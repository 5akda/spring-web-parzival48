package tech.parzival48.home.model

object Singleton {

    private var textList: ArrayList<String>? = null

    init {
        textList = arrayListOf()
        println("Singleton class invoked.")
    }

    fun push(newText: String) {
        textList?.add(newText)
    }

    fun print(): String? {
        var result: String = ""
        textList?.forEach {
            result += ("$it<br>")
        }
        return result
    }

}