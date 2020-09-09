package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex2.*
import kotlinx.android.synthetic.main.activity_ex4.*
import kotlinx.android.synthetic.main.activity_ex4.etNomeEx4

class Ex4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex4)

        cbInstagramEx4.setOnCheckedChangeListener { buttonView, isChecked ->
            etInstagramEx4.isEnabled = cbInstagramEx4.isChecked
        }

        cbTwitterEx4.setOnCheckedChangeListener { _, _ ->
            etTwitterEx4.isEnabled = cbTwitterEx4.isChecked
        }

        cbFacebookEx4.setOnCheckedChangeListener { _, _ ->
            etFacebookEx4.isEnabled = cbFacebookEx4.isChecked
        }

        cbTiktokEx4.setOnCheckedChangeListener { _, _ ->
            etTiktokEx4.isEnabled = cbTiktokEx4.isChecked
        }

        btnEnviarEx4.setOnClickListener {

            var Nome = ""

            var ExibirMsg = true

            if ( etNomeEx4.text.isNotEmpty() )
            {
                Nome = "\nNome: ${etNomeEx4.text}"
            }
            else
            {
                alert("Erro", "Nome não foi preenchido", this)
                ExibirMsg = false
            }

            var Instagram = ""

            if ( etInstagramEx4.text.isEmpty() && cbInstagramEx4.isChecked ) {
                alert("Erro", "Instagram não preenchido!", this)
                ExibirMsg = false
            }
            else
            {
                if ( cbInstagramEx4.isChecked )
                {
                    // Exemplo de usar toString para usar texto da caixa de texto
                    Instagram = "\n" + "Instagram: " + etInstagramEx4.text.toString()
                }
            }

            var Twitter = ""

            if ( etTwitterEx4.text.isEmpty() && cbTwitterEx4.isChecked )
            {
                alert("Erro", "Twitter não preenchido!", this)
                ExibirMsg = false
            }
            else
            {
                if ( cbTwitterEx4.isChecked  )
                {
                    Twitter = "\nTwitter: ${etTwitterEx4.text}"
                }
            }

            var Facebook = ""

            if ( etFacebookEx4.text.isEmpty() && cbFacebookEx4.isChecked )
            {
                alert("Erro", "Facebook não preenchido!", this)
                ExibirMsg = false
            }
            else
            {
                if ( cbFacebookEx4.isChecked )
                {
                    Facebook = "\nFacebook: ${etFacebookEx4.text}"
                }
            }

            var Tiktok = ""

            if( etTiktokEx4.text.isEmpty() && cbTiktokEx4.isChecked )
            {
                alert("Erro", "TikTok não preenchido!", this)
                ExibirMsg = false
            }
            else
            {
                if( cbTiktokEx4.isChecked )
                {
                    Tiktok = "\nTikTok: ${etTiktokEx4.text}"
                }
            }

            var texto = Nome + Instagram + Twitter + Facebook + Tiktok

            if ( ExibirMsg )
            {
                if ( texto.trim().isNotEmpty() )
                {
                    alert("Seus dados", texto, this)
                }

                if ( texto.trim().isEmpty() )
                {
                    alert("Erro", "Sem dados para exibir", this)
                }
            }
        }
    }
}