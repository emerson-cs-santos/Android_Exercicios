package br.emerson.exercicios

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_ex9.*
import java.util.*

class Ex9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex9)

        val cadastro: ArrayList<String> = ArrayList()
        cadastro.add( "Selecione" )

        val adapter_Cadastro = ArrayAdapter(this, android.R.layout.simple_spinner_item, cadastro)
        adapter_Cadastro.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spCadastroEx9.adapter = adapter_Cadastro

        val calendario = Calendar.getInstance()
        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

        etDataEx9.setOnClickListener {
            val pegarData = DatePickerDialog(this, { view, anoQueSeraSelecionado, mesQueSeraSelecionado, diaQueSeraSelecionada ->
                etDataEx9.setText("$diaQueSeraSelecionada/$mesQueSeraSelecionado/$anoQueSeraSelecionado")
            }, ano, mes, dia)

            pegarData.show()
        }

        btnCadastrarEx9.setOnClickListener {

            if( etNomeEx9.text.isNotEmpty() && etDataEx9.text.isNotEmpty() )
            {
                cadastro.add( etNomeEx9.text.toString() + " - " +  etDataEx9.text.toString() )
                etNomeEx9.setText("")
                etDataEx9.setText("")
            }
            else
            {
                alert("Erro", "Prencha ambos os campos!", this)
            }
        }

    }
}