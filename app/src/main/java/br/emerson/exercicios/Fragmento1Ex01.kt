package br.emerson.exercicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragmento1_ex01.*
import kotlinx.android.synthetic.main.fragmento1_ex01.view.*

class Fragmento1Ex01 : Fragment() {
     override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        val view = inflater.inflate(R.layout.fragmento1_ex01, container, false)

         // Para acessar os recursos da view do fragmento, é preciso Digitar "view" antes, conforme está abaixo.

         var texto: String = "Preencha todos os campos!"

         view.btnExFrag01Cadastrar.setOnClickListener {
             if ( view.etExFrag01Nome.text.isNotEmpty() && view.etExFrag01Telefone.text.isNotEmpty() && view.etExFrag01Email.text.isNotEmpty() )
             {
                 texto = """Nome: ${view.etExFrag01Nome.text}
                |Telefone: ${view.etExFrag01Telefone.text}
                |E-mail: ${view.etExFrag01Email.text}
                """.trimMargin("|")
             }
             alert("Resultado", texto, view.context)
         }

         return view
    }
}