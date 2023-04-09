package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var namaKampus = arrayOf("Institute Teknologi 10 November", "Universitas Brawijaya", "Universitas Gajah Mada", "Universitas Indonesia", "Universitas Airlangga", "Universitas Trunojoyo Madura")
        var imgKampus = arrayOf(
            R.drawable.its,
            R.drawable.ub,
            R.drawable.ugm,
            R.drawable.ui,
            R.drawable.unair,
            R.drawable.utm,
            )

        val KampusAdapter = KampusAdapter(namaKampus,imgKampus)

        rv_row_kampus.apply {
            layoutManager = LinearLayoutManager( this@MainActivity)
            setHasFixedSize(true)
            adapter = KampusAdapter
        }
    }
}