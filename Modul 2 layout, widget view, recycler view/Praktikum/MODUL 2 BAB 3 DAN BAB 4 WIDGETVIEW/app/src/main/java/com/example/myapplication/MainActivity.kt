package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editNama)
        val text = editText.text.toString()
        val imgBtn = findViewById<ImageButton>(R.id.imgButtonAdd)
        imgBtn.setOnClickListener {
            val tampil = editText.text.toString()
            Toast.makeText(this@MainActivity, "Data  " + tampil + " telah di input" , Toast.LENGTH_SHORT).show()
        }
    }
}