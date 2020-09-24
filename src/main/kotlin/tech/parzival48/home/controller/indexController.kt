package tech.parzival48.home.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {
    
    @GetMapping("/")
    fun indexPage(): String = "index.html"

}