package br.emerson.exercicios

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ex10.*

class Ex10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex10)

      //  val cadastro: ArrayList<Bitmap> = ArrayList()
      //  cadastro.add( Base64Util.convertStringToBitmap(getString(R.string.helmets)) )

        sbMudarImagensEx10.setOnSeekBarChangeListener( object: SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, progress: Int, fromUser: Boolean)
            {
                if(progress in 1..3)
                {
                  ivImagemEx10.setImageResource(R.drawable.imagem1ex10)
                  ivImagemEx10.tag = R.drawable.imagem1ex10
                }

                if(progress in 3..8)
                {
                    ivImagemEx10.setImageResource(R.drawable.imagem2ex10)
                    ivImagemEx10.tag = R.drawable.imagem2ex10
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?)
            {

            }

            override fun onStopTrackingTouch(p0: SeekBar?)
            {

            }
        })

    }





}