package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex_fragmento02.*

class ExFragmento02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_fragmento02)

        btnExFragmento02Usuario.setOnClickListener {
            val fragmentoUsuario = Ex02Fragment01()
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer, fragmentoUsuario).commit()
        }

        btnExFragmento02Produto.setOnClickListener {
            val fragmentoProduto = Ex02Fragment02()
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer, fragmentoProduto).commit()
        }
    }
}