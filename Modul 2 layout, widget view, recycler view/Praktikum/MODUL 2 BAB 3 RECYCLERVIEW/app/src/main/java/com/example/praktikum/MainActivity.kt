package com.example.praktikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.utm,
                namesuperhero = "Universitas Trunojoyo Madura",
                descSuperhero = " Universitas Trunojoyo atau Universitas Trunojoyo Madura atau UTM  adalah perguruan tinggi negeri yang terletak di Kecamatan Kamal, Kabupaten Bangkalan, Provinsi Jawa Timur, Pulau Madura, Indonesia."
            ),

            Superhero(
                R.drawable.its  ,
                namesuperhero = "Institute Teknologi 10 November",
                descSuperhero = " Institut Teknologi Sepuluh Nopember (disingkat ITS) adalah perguruan tinggi negeri yang terletak di Surabaya, Jawa Timur. Pada awalnya, ITS didirikan oleh Yayasan Perguruan Tinggi Teknik."
            ),

            Superhero(
                R.drawable.ub,
                namesuperhero = "Universitas Brawijaya",
                descSuperhero = " Universitas Brawijaya (UB) adalah perguruan tinggi negeri di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur, Indonesia"
            ),
            Superhero(
                R.drawable.ugm,
                namesuperhero = "Universitas Gajah Mada",
                descSuperhero = " Universitas Gadjah Mada lahir dari kancah perjuangan revolusi kemerdekaan bangsa Indonesia."
            ),
            Superhero(
                R.drawable.ui,
                namesuperhero = "Universitas Indonesia",
                descSuperhero = " Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat. "
            ),
            Superhero(
                R.drawable.unair,
                namesuperhero = "Universitas Airlangga",
                descSuperhero = "Universitas Airlangga (disingkat Unair atau UA; Jawa: ꦈꦤꦶꦮ꦳ꦼꦂꦱꦶꦠꦱ꧀\u200Bꦄꦲꦶꦂꦭꦁꦒ) adalah sebuah perguruan tinggi negeri yang terletak di Surabaya, Jawa Timur."
            )

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdaptor(this,superherolist){

        }
    }
}