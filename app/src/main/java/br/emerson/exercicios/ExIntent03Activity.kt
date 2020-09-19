package br.emerson.exercicios

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex_intent03.*

class ExIntent03Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_intent03)

        btnExIntent03Exemplo.setOnClickListener {
            etExIntent03URL.setText( "https://sp.senac.br/" )
        }

        btnExIntent03AbrirURL.setOnClickListener {
            if ( etExIntent03URL.text.isNotEmpty() )
            {
                val url = etExIntent03URL.text.toString()
                val intentUrl = Intent( Intent.ACTION_VIEW, Uri.parse( url ) )
                startActivity( intentUrl )
            }
            else
            {
                alert("Erro", "Digite uma URL", this)
            }
        }
    }
}