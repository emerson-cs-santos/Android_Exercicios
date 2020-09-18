package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex8.*

class Ex8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex8)

        btnCalcularEx8.setOnClickListener {
            if( !rbImperialParaMetricoEx8.isChecked && !rbMetroParaImperialEx8.isChecked )
            {
                alert("Erro","Escolha ao menos uma opção", this)
            }
            else
            {
                // imperialParaMetrico
                if( rbImperialParaMetricoEx8.isChecked && !rbMetroParaImperialEx8.isChecked )
                {
                    this.imperialParaMetrico()
                }

                // metricoParaImperial
                if( rbMetroParaImperialEx8.isChecked && !rbImperialParaMetricoEx8.isChecked)
                {
                    this.metricoParaImperial()
                }
            }


        }
    }

    fun imperialParaMetrico()
    {
        var resultado: Double = 0.0

        if( etPolegadasEx8.text.isNotEmpty() )
        {
            resultado = etPolegadasEx8.text.toString().toDouble() * 2.54
            etCmEx8.setText( resultado.toString() )
        }

        if( etPesEx8.text.isNotEmpty() )
        {
            resultado = etPesEx8.text.toString().toDouble() / 3.281
            etMetrosEx8.setText( resultado.toString() )
        }

        if( etMilhasEx8.text.isNotEmpty() )
        {
            resultado = etMilhasEx8.text.toString().toDouble() * 1.609
            etKmEx8.setText( resultado.toString() )
        }
    }

    fun metricoParaImperial()
    {
        var resultado: Double = 0.0

        if( etCmEx8.text.isNotEmpty() )
        {
            resultado = etCmEx8.text.toString().toDouble() / 2.54
            etPolegadasEx8.setText( resultado.toString() )
        }

        if( etMetrosEx8.text.isNotEmpty() )
        {
            resultado = etMetrosEx8.text.toString().toDouble() * 3.281
            etPesEx8.setText( resultado.toString() )
        }

        if( etKmEx8.text.isNotEmpty() )
        {
            resultado = etKmEx8.text.toString().toDouble() / 1.609
            etMilhasEx8.setText( resultado.toString() )
        }

    }
}