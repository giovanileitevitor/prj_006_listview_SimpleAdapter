package br.com.prj_006_listview_simpleadapter

class HMAux : HashMap<String, String>() {

    override fun toString(): String {
        return this[NAME] ?: "ERROR"
    }

    companion object {
        const val CODE = "code"
        const val NAME = "name"
    }
}