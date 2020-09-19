package br.emerson.exercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex_intent02.*

class ExIntent02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_intent02)

        btnExIntent02AbrirIntent.setOnClickListener {
            if ( etExIntent02Nome.text.isNotEmpty() )
            {
                val intentDetalhe = Intent( this, ExIntent02DetalheActivity::class.java)
                intentDetalhe.putExtra( "nome", etExIntent02Nome.text.toString() )
                startActivity( intentDetalhe )
            }
            else
            {
                alert("Erro", "Preencha o nome!", this)
            }
        }
    }
}