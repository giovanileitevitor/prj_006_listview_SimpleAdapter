package br.com.prj_006_listview_simpleadapter

class Produto(
    var code: String = "-1",
    var name: String = "",
    var price: Double = 0.0,
    var multi: Int = 0,
    var unit: String = ""
) {

    override fun toString(): String {
        return name
    }

    fun toHMAux(): HMAux {
        var hmAux = HMAux()

        hmAux[HMAux.CODE] = code
        hmAux[HMAux.NAME] = name

        return hmAux
    }
}