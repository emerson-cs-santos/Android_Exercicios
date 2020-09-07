package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex3.*

class Ex3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex3)

        btnCalcular.setOnClickListener {
            var resultadoMSG = ""
            var resultado = 0

            if ( etValor1.text.isEmpty() || etValor2.text.isEmpty() )
            {
                resultadoMSG = "Valores não foram preenchidos"
            }

            if ( rbSomar.isChecked )
            {
                resultado = etValor1.text.toString().toInt() + etValor2.text.toString().toInt()
                resultadoMSG = "${etValor1.text} + ${etValor2.text} = $resultado"
            }

            if ( rbSubtrair.isChecked)
            {
                resultado = etValor1.text.toString().toInt() - etValor2.text.toString().toInt()
                resultadoMSG = "${etValor1.text} - ${etValor2.text} = $resultado"
            }

            if ( rbMultiplicar.isChecked )
            {
                resultado = etValor1.text.toString().toInt() * etValor2.text.toString().toInt()
                resultadoMSG = "${etValor1.text} * ${etValor2.text} = $resultado"
            }

            if ( rbDividir.isChecked )
            {
                resultado = etValor1.text.toString().toInt() / etValor2.text.toString().toInt()
                resultadoMSG = "${etValor1.text} / ${etValor2.text} = $resultado"
            }

            alert("Resultado","$resultadoMSG",this)
        }
    }
}