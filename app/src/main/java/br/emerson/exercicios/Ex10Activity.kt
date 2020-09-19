package br.emerson.exercicios

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_ex10.*

class Ex10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex10)


        btnTeste.setOnClickListener {
            imageViewEx10.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext, // Context
                    R.drawable.baseline_account_circle_black_48 // Drawable
                )
            )

        }

        sbMudarImagensEx10.setOnSeekBarChangeListener( object: SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, progress: Int, fromUser: Boolean)
            {
                if(progress in 1..20)
                {
                    imageViewEx10.setImageResource(R.drawable.baseline_account_circle_black_48)
                    imageViewEx10.tag = R.drawable.baseline_account_circle_black_48

                }

                if(progress in 20..40)
                {
                    imageViewEx10.setImageResource(R.drawable.baseline_backup_black_48)
                    imageViewEx10.tag = R.drawable.baseline_backup_black_48
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