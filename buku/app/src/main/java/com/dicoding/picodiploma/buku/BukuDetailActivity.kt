package com.dicoding.picodiploma.buku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class BukuDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.detail_buku)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bukuDetail = intent.getParcelableExtra<Buku>(MainActivity.INTENT_PARCELABLE)

        val gambar = findViewById<ImageView>(R.id.gambar)
        val nama = findViewById<TextView>(R.id.nama)
        val penulis = findViewById<TextView>(R.id.penulis)
        val penerbit = findViewById<TextView>(R.id.penerbit)
        val tanggalTerbit = findViewById<TextView>(R.id.tanggalTerbit)
        val halaman = findViewById<TextView>(R.id.halaman)
        val deskripsi = findViewById<TextView>(R.id.deskripsi)

        gambar.setImageResource(bukuDetail?.gambar!!)
        nama.text = bukuDetail.nama
        penulis.text = bukuDetail.penulis
        penerbit.text = bukuDetail.penerbit
        tanggalTerbit.text = bukuDetail.tanggalTerbit
        halaman.text = bukuDetail.halaman
        deskripsi.text = bukuDetail.deskripsi
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}