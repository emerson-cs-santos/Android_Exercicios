package br.emerson.exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_ex5.*

class Ex5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex5)

        val tipo = arrayOf("Selecione", "Filme", "Música", "Livro", "Jogo")
        val adapter_tipo = ArrayAdapter(this, android.R.layout.simple_spinner_item, tipo)
        adapter_tipo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spTipoEx5.adapter = adapter_tipo

        val subTipoFilmes = arrayOf("Selecione", "Matrix", "The Mask", "Spider-Man")
        val adapter_subTipoFilmes = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoFilmes)
        adapter_subTipoFilmes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val subTipoMusicas = arrayOf("Selecione", "Canon Ball", "Fly to the moon", "Patience")
        val adapter_subTipoMusicas = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoMusicas)
        adapter_subTipoMusicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val subTipoLivros = arrayOf("Selecione", "Metro 2033", "Admiravel mundo novo", "Invisible Man")
        val adapter_subTipoLivros = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoLivros)
        adapter_subTipoLivros.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val subTipoJogos = arrayOf("Selecione", "Sonic 3", "Crash Bandicoot", "MegaMan X4")
        val adapter_subTipoJogos = ArrayAdapter(this, android.R.layout.simple_spinner_item, subTipoJogos)
        adapter_subTipoJogos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spTipoEx5.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long)
            {
                // Selecione
                if ( spTipoEx5.selectedItemPosition == 0 )
                {

                }

                // filmes
                if ( spTipoEx5.selectedItemPosition == 1 )
                {
                    spSubTipoEx5.adapter = adapter_subTipoFilmes
                }

                // Musicas
                if ( spTipoEx5.selectedItemPosition == 2 )
                {
                    spSubTipoEx5.adapter = adapter_subTipoMusicas
                }

                // Livros
                if ( spTipoEx5.selectedItemPosition == 3 )
                {
                    spSubTipoEx5.adapter = adapter_subTipoLivros
                }

                // Jogos
                if ( spTipoEx5.selectedItemPosition == 4 )
                {
                    spSubTipoEx5.adapter = adapter_subTipoJogos
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?)
            {

            }
        }

    }
}