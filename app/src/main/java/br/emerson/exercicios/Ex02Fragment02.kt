package br.emerson.exercicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_ex0202.view.*

class Ex02Fragment02 : Fragment() {
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {
        val view = inflater.inflate(R.layout.fragment_ex0202, container, false)

        var texto: String = "Preencha todos os campos!"

        view.btnExFrag02ProdCadastrar.setOnClickListener {

            if ( view.etExFrag02ProdNome.text.isNotEmpty() )
            {
                texto = "Produto: ${view.etExFrag02ProdNome.text}"
            }

            alert("Resultado do Cadastro", texto, view.context)
        }

        return view
    }

}