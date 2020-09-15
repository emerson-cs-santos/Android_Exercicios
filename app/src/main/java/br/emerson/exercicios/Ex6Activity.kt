package br.emerson.exercicios

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex6.*
import kotlin.properties.Delegates

class Ex6Activity : AppCompatActivity() {

    var valor1 = 0
    var valor2 = 0
    var check: Int = 0
    var operacao: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex6)

        addClickBotoesNumeros()
        addClickBotoesOperacoes()

        // Apagar
        btnApagarEx6.setOnClickListener {
            etNumerosEx6.setText("")
            valor1 = 0
            valor2 = 0
            check = 0
            operacao = 0
            txtResultadoEx6.setText("")
        }

        // Igual
        btnIgualEx6.setOnClickListener {
            var result: Number = 0

            // Somar
            if( operacao == 0 )
            {
                result = valor1 + valor2
            }

            // Subtrair
            if( operacao == 1 )
            {
                result = valor1 - valor2
            }

            // Multiplicar
            if( operacao == 2 )
            {
                result = valor1 * valor2
            }

            // Dividir
            if( operacao == 3 )
            {
                result = valor1 / valor2
            }

            txtResultadoEx6.setText( etNumerosEx6.text.toString() + " = " + result.toString() )
        }

    }

    private fun addValor( valor: Int )
    {
        if( check == 0 )
        {
            valor1 = valor
            etNumerosEx6.setText( valor.toString() )
            check = 1
        }
        else
        {
            valor2 = valor
            check = 0
            etNumerosEx6.setText( etNumerosEx6.text.toString() + " " + valor.toString() )
        }

    }

    private fun addOperacao( op: Int, operacaoSimbolo: String )
    {
        operacao = op
        etNumerosEx6.setText( etNumerosEx6.text.toString() + " $operacaoSimbolo" )
    }
    
    private fun addClickBotoesNumeros()
    {
        btn0Ex6.setOnClickListener {
            addValor(0)
        }

        btn1Ex6.setOnClickListener {
            addValor(1)
        }

        btn2Ex6.setOnClickListener {
            addValor(2)
        }

        btn3Ex6.setOnClickListener {
            addValor(3)
        }

        btn4Ex6.setOnClickListener {
            addValor(4)
        }

        btn5Ex6.setOnClickListener {
            addValor(5)
        }

        btn6Ex6.setOnClickListener {
            addValor(6)
        }

        btn7Ex6.setOnClickListener {
            addValor(7)
        }

        btn8Ex6.setOnClickListener {
            addValor(8)
        }

        btn9Ex6.setOnClickListener {
            addValor(9)
        }

    }

    private fun addClickBotoesOperacoes()
    {
        btnSomarEx6.setOnClickListener {
            addOperacao( 0, "+" )
        }

        btnSubtrairEx6.setOnClickListener {
            addOperacao( 1, "-" )
        }

        btnMultiplicarEx6.setOnClickListener {
            addOperacao( 2, "x" )
        }

        btnDividirEx6.setOnClickListener {
            addOperacao( 3, "÷" )
        }
    }
}