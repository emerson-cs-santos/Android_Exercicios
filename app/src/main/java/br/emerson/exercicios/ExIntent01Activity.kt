package br.emerson.exercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex_intent01.*

class ExIntent01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_intent01)

        btnExIntent01.setOnClickListener {
            val intentDetalhe = Intent( this, ExIntent01DetalheActivity::class.java )
            startActivity( intentDetalhe )
        }
    }
}