package br.com.prj_006_listview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import br.com.prj_006_listview_simpleadapter.R
import kotlinx.android.synthetic.main.telainicial.*

class MainActivity : AppCompatActivity() {

    private var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.telainicial)
        initVars()
        initActions()




    }

    private fun initVars() {
        context = this@MainActivity

        lv_produtos.adapter = ArrayAdapter<HMAux>(
            context,
            android.R.layout.simple_list_item_1,
            genProd(20)
        )
    }

    private fun initActions() {

    }

    private fun genProd(quantidade: Int): ArrayList<HMAux> {
        var produtos = ArrayList<HMAux>()
        //
        for (i in 1..quantidade) {
            var pAux = Produto()

            pAux.code = i.toString()
            pAux.name = "Produto - $i"
            pAux.price= 0.5 * i
            pAux.multi = i
            pAux.unit = "CX"

            produtos.add(pAux.toHMAux())
        }
        //
        return produtos
    }


}
