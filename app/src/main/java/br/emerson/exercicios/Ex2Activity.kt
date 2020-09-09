package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex2.*

class Ex2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2)

        btnVerInfo.setOnClickListener {
            var texto = ""
            val ola = getString(R.string.Ex2_msg)
            val nome = getString(R.string.Ex2_Nome)
            val sobrenome = getString(R.string.Ex2_sobrenome)
            val preferencias = getString(R.string.Ex2_Preferencias)
            val genero = getString(R.string.Ex2_Genero)
            val estadoCivil = getString(R.string.Ex2_EstadoCivil)

            texto = """ $nome: ${etNomeEx4.text}
            |$sobrenome: ${etSobreNome.text}
            |
            |$preferencias
            """.trimMargin("|")

            // Genero
            if(rbFeminino.isChecked)
            {
                texto += "\n $genero: "  + getString(R.string.Ex2_Feminino)
            }

            if(rbMasculino.isChecked)
            {
                texto += "\n $genero: "  + getString(R.string.Ex2_Masculino)
            }

            if(rbNaoInformar.isChecked)
            {
                texto += "\n $genero: "  + getString(R.string.Ex2_PrefiroNaoInformar)
            }

            // Estado civil
            if(rbSolteiro.isChecked)
            {
                texto += "\n $estadoCivil: "  + getString(R.string.Ex2_Solteiro)
            }

            if(rbCasado.isChecked)
            {
                texto += "\n $estadoCivil: "  + getString(R.string.Ex2_Casado)
            }

            if(rbViuvo.isChecked)
            {
                texto += "\n $estadoCivil: "  + getString(R.string.Ex2_Viuvo)
            }

            alert(ola, texto, this)
        }
    }
}