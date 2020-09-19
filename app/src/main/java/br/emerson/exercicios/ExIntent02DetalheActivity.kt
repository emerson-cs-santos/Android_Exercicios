package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex_intent02_detalhe.*

class ExIntent02DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_intent02_detalhe)

        val nome = intent.getStringExtra( "nome" )

        tvExIntent02DetalheTexto.text = "Texto veio da outra atividade: $nome"

        btnExIntent02DetalheVoltar.setOnClickListener {
            finish()
        }
    }
}