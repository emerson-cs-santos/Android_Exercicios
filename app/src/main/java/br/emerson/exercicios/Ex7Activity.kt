package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex7.*

class Ex7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex7)

        btnCalcularEx7.setOnClickListener {
            if ( etCelsiusEx7.text.isEmpty() && etFahrenheitEx7.text.isEmpty()  )
            {
                alert("Erro", "Prencha um dos campos!", this)
            }
            else
            {
                if ( etCelsiusEx7.text.isNotEmpty() && etFahrenheitEx7.text.isNotEmpty() )
                {
                    alert("Erro", "Prencha apenas um dos campos!", this)
                }
                else
                {
                    var result = 0.0

                    // Celsius para Fahrenheit
                    if( etCelsiusEx7.text.isNotEmpty() && etFahrenheitEx7.text.isEmpty() )
                    {
                        result = ( etCelsiusEx7.text.toString().toDouble() * 1.8000 ) + 32
                    }

                    // Fahrenheit para Celsius
                    if( etFahrenheitEx7.text.isNotEmpty() && etCelsiusEx7.text.isEmpty() )
                    {
                        result = ( ( etFahrenheitEx7.text.toString().toDouble() - 32 ) * 5 ) / 9
                    }

                    txtResultadoEx7.setText("$result")
                }
            }
        }
    }
}