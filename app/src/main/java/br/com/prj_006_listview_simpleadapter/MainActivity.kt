package br.com.prj_006_listview_simpleadapter

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import android.widget.Toast
import br.com.prj_006_listview.HMAux
import br.com.prj_006_listview.Produto
import kotlinx.android.synthetic.main.telainicial.*

class MainActivity : AppCompatActivity() {

    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.telainicial)

        initVars()
        initActions()
    }

    private fun initVars() {
        context = this@MainActivity


        val De = arrayOf(HMAux.CODE, HMAux.NAME)
        val Para = intArrayOf(R.id.celula_tv_item, R.id.celula_tv_subitem)

        lv_produtos.adapter = SimpleAdapter(
            context,
            genProd(20),
            R.layout.celula,
            De,
            Para
        )
    }

    private fun initActions() {
        lv_produtos.setOnItemClickListener { parent, view, position, id ->
            var item = parent.getItemAtPosition(position) as HMAux

            Toast.makeText(
                context,
                item[HMAux.NAME],
                Toast.LENGTH_SHORT
            ).show()

        }
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
