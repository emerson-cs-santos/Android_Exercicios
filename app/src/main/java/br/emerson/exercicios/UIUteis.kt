package br.emerson.exercicios

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun alert (title: String, msg: String, Context: Context) {
    val builder = AlertDialog. Builder(Context)

    builder
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("OK",null)
        .create()
        .show()
}