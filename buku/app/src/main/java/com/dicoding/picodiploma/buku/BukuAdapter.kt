package com.dicoding.picodiploma.buku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BukuAdapter(private val context: Context, private val buku: List<Buku>, val listener: (Buku) -> Unit)
    : RecyclerView.Adapter<BukuAdapter.bukuViewHolder>(){
    class bukuViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val gambar = view.findViewById<ImageView>(R.id.gambar)
        val nama = view.findViewById<TextView>(R.id.nama)
        val penulis = view.findViewById<TextView>(R.id.penulis)
        val penerbit = view.findViewById<TextView>(R.id.penerbit)
        val tanggal_terbit = view.findViewById<TextView>(R.id.tanggalTerbit)
        val halaman = view.findViewById<TextView>(R.id.halaman)
        val deskripsi = view.findViewById<TextView>(R.id.deskripsi)

        fun bindView(buku: Buku, listener: (Buku) -> Unit) {
            gambar.setImageResource(buku.gambar)
            nama.text = buku.nama
            penulis.text = buku.penulis
            penerbit.text = buku.penerbit
            tanggal_terbit.text = buku.tanggalTerbit
            halaman.text = buku.halaman
            deskripsi.text = buku.deskripsi
            itemView.setOnClickListener {
                listener(buku)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bukuViewHolder {
        return bukuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.data_buku, parent, false)
        )
    }

    override fun onBindViewHolder(holder: bukuViewHolder, position: Int) {
        holder.bindView(buku[position], listener)
    }

    override fun getItemCount(): Int = buku.size
}