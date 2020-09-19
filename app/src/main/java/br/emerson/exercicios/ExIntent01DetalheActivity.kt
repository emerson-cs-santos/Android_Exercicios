package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex_intent01_detalhe.*

class ExIntent01DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_intent01_detalhe)

        btnVoltarExIntentDetalhe01.setOnClickListener {
            finish()
        }
    }
}