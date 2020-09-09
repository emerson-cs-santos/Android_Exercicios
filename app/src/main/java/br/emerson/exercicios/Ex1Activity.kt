package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex1.*

class Ex1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        val ola = getString(R.string.Ex1_ola)
        val msg = getString(R.string.Ex1_msg)

        var texto = ""

        btnExibir.setOnClickListener {

            if(etNomeEx4.text.isEmpty() || etSobreNome.text.isEmpty())
            {
                texto = getString(R.string.Ex1_camposVazios)
            }
            else
            {
                texto = "$ola  ${etNomeEx4.text}  ${etSobreNome.text}!"
            }

            alert(msg, texto, this)
        }
    }
}