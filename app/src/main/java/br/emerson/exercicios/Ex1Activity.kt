package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex1.*

class Ex1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        val ola = getString(R.string.EX1_BtnOla2)
        val msg = getString(R.string.Ex1_msg)

        btnExibir.setOnClickListener {
            val texto = "$ola  ${etNome.text}  ${etSobreNome.text}!"
            alert(msg, texto, this)
        }
    }
}