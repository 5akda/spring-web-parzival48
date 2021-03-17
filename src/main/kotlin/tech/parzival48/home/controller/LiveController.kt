package tech.parzival48.home.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import tech.parzival48.home.model.Singleton

@RestController
class LiveController {


    @GetMapping("/live/{text}")
    fun sendText(@PathVariable text: String): String {
        Singleton.push(text)
        return "Done :)"
    }

    @GetMapping("/live")
    fun getAllText(): String {
        Singleton.print()?.let {
            return it
        } ?: run {
            return "empty"
        }
    }

    /* master jaaa */

}