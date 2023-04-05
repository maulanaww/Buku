package com.dicoding.picodiploma.buku

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Buku(
    val gambar: Int,
    val nama: String,
    val penulis: String,
    val penerbit: String,
    val tanggalTerbit: String,
    val halaman: String,
    val deskripsi: String,
) : Parcelable