package com.dicoding.picodiploma.buku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bukuList = listOf<Buku>(
            Buku(
                R.drawable.empowered,
                nama = "Empowered ME (Mother Empowers)",
                penulis = "Puty Puar",
                penerbit = "Penerbit : Gramedia Pustaka Utama",
                tanggalTerbit = "Tanggal terbit : 23 Februari 2022",
                halaman = "188 Halaman",
                deskripsi = "Perempuan berdaya bisa diartikan sebagai perempuan yang memiliki kekuatan/kemampuan memilih atau mengambil keputusan untuk hidupnya sendiri. Setelah menjadi ibu, tidak sedikit perempuan yang merasa kewalahan dengan adanya tambahan peran dalam hidupnya. Berbagai ekspektasi yang terbentuk di masyarakat dan hadir setiap saat melalui media sosial kerap membuat ibu semakin sulit memahami dirinya sendiri. Padahal pemahaman akan diri sendiri, peran, dan tujuan adalah dasar dari kepercayaan diri dalam pengambilan keputusan. Ketika seorang ibu berdaya; merasa kuat, dan percaya diri akan pilihan hidupnya, ini akan menciptakan dampak positif bukan hanya bagi dirinya, tapi juga keluarga dan masyarakat; termasuk para perempuan di sekelilingnya. Buku berilustrasi ini diharapkan bisa menjadi teman bagi para perempuan termasuk ibu-ibu untuk lebih memahami dan memercayai diri serta menghargai proses bertumbuh dalam hidup. Terdapat pula beberapa templat yang dapat mengarahkan penyusunan prioritas, pengukuran kemajuan, dan refleksi diri.",
            ),
            Buku(
                R.drawable.make_time,
                nama = "Make Time",
                penulis = "Jake Knapp dan John Zeratsky",
                penerbit = "Penerbit : Gramedia Pustaka Utama",
                tanggalTerbit = "Tanggal terbit : 23 Maret 2022",
                halaman = "364 Halaman",
                deskripsi = "Pernahkah kamu merenung dan bertanya-tanya, “Apa sih yang benar-benar telah kulakukan hari ini?” Pernahkah kamu melamunkan proyek-proyek dan aktivitas yang akan kamu kerjakan “suatu hari nanti”—tetapi saat itu tak pernah datang? Kita semua mengalami kesulitan meluangkan waktu untuk hal-hal yang sangat penting. Setiap hari kita memulai dengan niat terbaik—tapi kemudian waktu kita ditelan habis oleh rapat beruntun, rantai pesan dan e-mail yang tak pernah berhenti, dan update yang tak pernah berakhir di media sosial. Terkadang letih dan terdistraksi sudah menjadi “keadaan normal” kita. Tetapi, bagaimana jika kita bisa melangkah keluar dari roda putar hamster itu dan mulai memegang kendali atas waktu dan perhatian kita? Sebagai pencipta Design Sprint-nya Google Ventures, Jake Knapp dan John Zeratsky telah menolong ratusan tim menyelesaikan masalah-masalah penting dengan mendesain ulang jam kerja mereka. Berdasarkan pelajaran-pelajaran dari Design Sprint ini, mereka menghabiskan bertahun-tahun untuk bereksperimen dengan kebiasaan dan rutinitas mereka sendiri, mencari cara untuk mengoptimalkan energi, fokus, dan waktu. Sekarang, mereka telah berhasil mewujudkan taktik-taktik paling efektif ke dalam kerangka kerja harian yang terdiri dari empat langkah—Sorotan, Laser, Energi, Renungan—yang bisa digunakan oleh setiap orang untuk mendesain jadwal harian secara sistematis. Make Time bukanlah soal produktivitas atau mencontreng lebih banyak daftar tugas. Buku ini juga tidak mengusulkan solusi yang tak realistis, misalnya membuang smartphone atau menyumpahi media sosial. Make Time menawarkan menu 87 poin taktik yang bisa kamu selaraskan sendiri, antara lain: • Daftar Hal-Hal yang Mungkin Bisa Dilakukan • Tidak Memudahkan Diri Sendiri • Jangan Cek Handphone Sewaktu Bangun Pagi • Jadikan Piringmu Seperti Alun-alun • Mengunci Diri di Luar • ... dan masih banyak lagi Bacaan wajib bagi setiap orang yang pernah menginginkan lebih dari 24 jam dalam sehari. Buku ini akan membantumu mendesain hidup di seputar hal-hal yang penting bagimu. Kamu bisa “memiliki” hidupmu sendiri, detik demi detik, dari hari ke hari.",
            ),
            Buku(
                R.drawable.discovering_myself,
                nama = "Discovering Myself",
                penulis = "OPSY Clinic",
                penerbit = "Penerbit : Elex Media Komputindo",
                tanggalTerbit = "Tanggal terbit : 28 Agustus 2022",
                halaman = "150 Halaman",
                deskripsi = "Kita sering kali mendengar tentang PENTINGNYA MEMAHAMI DIRI SENDIRI, tetapi BAGAIMANA CARANYA? Kadang kala kita lelah menjalani rutinitas kehidupan, hingga muncul pertanyaan : APAKAH HIDUPKU LAYAK UNTUK KUJALANI? Kita telah berjuang sampai detik ini, berusaha dengan keras sampai sejauh ini, tapi sudahkah kita menjawab pertanyaan ini: APA TUJUAN HIDUPKU? Buku ini dirancang secara khusus dalam bentuk buku jurnal ekspresif dengan memadukan antara teori oleh para ahli, data-data ilmiah, pengalaman pribadi penulis, pengalaman penulis selama melayani klien di bidang psikologis, metode dalam penulisan jurnal ekspresif, serta beberapa metode asesmen diri yang membantu kita dalam memahami dengan baik siapa kita yang sebenarnya, menemukan kehidupan yang layak untuk kita jalani, mengenal tujuan hidup kita, serta bagaimana memiliki kehidupan yang mengarah pada tujuan.",
            ),
            Buku(
                R.drawable.kintsugi,
                nama = "Kintsugi",
                penulis = "Tomas Navarro",
                penerbit = "Penerbit : Mahaka Publishing",
                tanggalTerbit = "Tanggal terbit : 9 September 2022",
                halaman = "440 Halaman",
                deskripsi = "Setiap orang menginginkan hidup yang mudah, sesuai rencana, tanpa masalah. Namun realitanya, kehidupan tidak semenyenangkan itu. Ada kalanya dilanda badai, musibah, kesulitan, bahkan kehilangan. Ya, tidak ada hidup dan pikiran yang seenteng kapas. Orang yang kita lihat tenang, belum tentu hidup tanpa masalah. Ia hanya pintar mengelola semuanya agar terlihat mudah.\n" +
                        "\n" +
                        "Ketika kehilangan suatu hal yang berharga, rasanya seakan ada bagian dari diri kita yang hancur berkeping-keping. Namun, dalam prinsip seni kuno kintsugi, ketika suatu benda pecah berkeping-keping, itulah titik awal untuk menciptakan ulang suatu keindahan, yaitu dengan menyatukan kembali semua kepingan yang tercerai-berai dan menonjolkannya dengan emas.",
            ),
            Buku(
                R.drawable.catatan_tentang_dunia,
                nama = "Catatan tentang Dunia yang Gelisah",
                penulis = "Matt Haig",
                penerbit = "Penerbit : Gramedia Pustaka Utama",
                tanggalTerbit = "Tanggal terbit : 13 September 2022",
                halaman = "366 Halaman",
                deskripsi = "Dunia sedang mempermainkan pikiran kita. Bagaimana jika ada sesuatu yang bisa kita lakukan?\n" +
                        "\n" +
                        "Masyarakat tempat kita tinggal semakin membuat pikiran kita sakit, membuatnya merasa seolah-olah cara kita hidup direkayasa untuk membuat kita tidak bahagia. Ketika Matt Haig mengalami gangguan panik, kecemasan, dan depresi sebagai orang dewasa, butuh waktu lama baginya untuk mengetahui bagaimana dunia luar dapat mempengaruhi kesehatan mentalnya baik secara positif maupun negatif.\n" +
                        "\n" +
                        "Catatan tentang Dunia yang Gelisah mengumpulkan pengamatannya bagaimana berbagai kemajuan sosial, komersial, dan teknologi yang telah menciptakan dunia yang kita tinggali sekarang sebenarnya dapat menghambat kebahagiaan kita. Haig meneliti segala sesuatu dari fenomena yang lebih luas seperti ketidaksetaraan, media sosial, dan berita hingga hal-hal yang lebih dekat dengan kehidupan kita sehari-hari, seperti bagaimana kita tidur, berolahraga, dan bahkan perbedaan yang kita tarik antara pikiran dan tubuh kita. Dari situ. Matt Haig mengajak kita untuk merasa lebih tenang dan bahagia serta mempertanyakan kebiasaan di era digital. Buku ni bahkan mungkin mengubah cara Anda menghabiskan waktu berharga Anda di Bumi.",
            ),
            Buku(
                R.drawable.grow_your_personal,
                nama = "Grow Your Personal Branding",
                penulis = "Ipnu R. Noegroho",
                penerbit = "Penerbit : Psikologi Corner",
                tanggalTerbit = "Tanggal terbit : 26 Desember 2022",
                halaman = "186 Halaman",
                deskripsi = "Bagaimana caranya agar orang mengenal Anda? Bagaimana caranya menjual diri Anda sehingga karya atau nilai-nilai yang Anda bawa bisa sampai ke orang-orang atau pengikut Anda? Bagaimana cara melakukan personal branding di dunia sosial media seperti Linkedin dan YouTube? Mengapa banyak orang sampai-sampai membeli kelas pelatihan personal branding? Apakah artis-artis atau para miliarder yang terkenal sekarang juga melakukan metode personal branding? Sepenting apakah Amu ini?\n" +
                        "\n" +
                        "Setiap manusia pasti memiliki identitas diri yang mungkin bisa saja dianggap menarik dan unik untuk orang lain. Inilah mengapa Anda perlu sebuah personal branding untuk meningkatkan awareness orang-orang Barang dan jasa saja perlu yang namanya branding, maka, sosok manusia pun juga perlu khususnya mereka yang mempunyai nama dan karya, seperti pebisnis, public figure, motivator, seniman, dan crazy rich Temukan semuanya dan jadilah sosok lebih sekali pun. yang dikenal dan sukses.",
            ),
            Buku(
                R.drawable.hal_hal_yang_boleh_dilakukan,
                nama = "Hal-hal yang Boleh dan Tak Boleh Kulakukan",
                penulis = "Teruko Kobayashi",
                penerbit = "Penerbit : Gramedia Pustaka Utama",
                tanggalTerbit = "Tanggal terbit : 7 September 2022",
                halaman = "228 Halaman",
                deskripsi = "Dalam hidup, adakalanya penderitaan dan kepedihan datang silih berganti. Terkadang muncul keinginan untuk melarikan diri dan amarah yang tak dapat dibendung. Meski begitu, betapapun menyakitkannya suatu pengalaman, pasti akan menjadi pelajaran di masa mendatang. Hal terpenting untuk menjalani hidup yang bahagia adalah tidak putus harapan dan tetap memiliki impian, berapa pun usia kita. Menerawang kembali ke masa lalu yang penuh lika-liku, termasuk sepak terjangnya dalam dunia kecantikan di Jepang selama lebih dari 50 tahun, Teruko Kobayashi membagikan 25 hal yang boleh dan tidak boleh dilakukan untuk memudahkan hidup. Berikut beberapa di antaranya: JANGAN LAKUKAN • Jangan membandingkan • Jangan sombong • Jangan berlebihan memiliki • Jangan memikirkan kekurangan penampilan • Jangan cemburu LAKUKANLAH • Bersyukur atas kehidupan setiap hari • Terbuka akan hal baru • Memiliki hobi • Tetap tersenyum • Menyayangi diri sendiri",
            ),
            Buku(
                R.drawable.money_habits,
                nama = "Money Habits",
                penulis = "Rana Kinasih",
                penerbit = "Penerbit : Jendela",
                tanggalTerbit = "Tanggal terbit : 19 Juli 2022",
                halaman = "172 Halaman",
                deskripsi = "Pengelolaan keuangan adalah mengatur uang yang dimiliki agar cukup untuk kebutuhan harian, hiburan, dan disimpan untuk keperluan lainnya yang akan membantu Anda meraih tujuan finansial di masa depan.\n" +
                        "\n" +
                        "Mengelola keuangan sering dianggap sepele oleh sebagian orang karena menganggap uang itu adalah milik sendiri jadi boleh digunakan seenaknya. Padahal pengelolaan keuangan ini juga dibutuhkan untuk mengantisipasi banyak hal yang mungkin tidak terduga, jadi Anda perlu menerapkannya dalam kehidupan sehari-hari.\n" +
                        "\n" +
                        "Buku “Money Habits : Merdeka Finansial Untuk Hidup Lebih Bermakna” akan membantu Anda dalam mengelolah keuangan dengan baik dan benar.",
            ),
            Buku(
                R.drawable.atomic_habits,
                nama = "Atomic Habits",
                penulis = "James Clear",
                penerbit = "Penerbit : Gramedia Pustaka Utama",
                tanggalTerbit = "Tanggal terbit : 15 Sep 2019",
                halaman = "356 Halaman",
                deskripsi = "Orang mengira ketika Anda ingin mengubah hidup, Anda perlu memikirkan hal-hal besar. Namun pakar kebiasaan terkenal kelas dunia James Clear telah menemukan sebuah cara lain. Ia tahu bahwa perubahan nyata berasal dari efek gabungan ratusan keputusan kecil—dari mengerjakan dua push-up sehari, bangun lima menit lebih awal, sampai menahan sebentar hasrat untuk menelepon. Ia menyebut semua tadi atomic habits.",
            ),
            Buku(
                R.drawable.the_habit_journal,
                nama = "The Habit Journal",
                penulis = "James Clear",
                penerbit = "Penerbit : Gramedia Pustaka Utama",
                tanggalTerbit = "Tanggal terbit : 7 September 2022",
                halaman = "230 Halaman",
                deskripsi = "Habit Journal adalah buku catatan berdasarkan buku mega bestseller Atomic Habits yang memungkinkan kita memaksimalkan terbentuknya kebiasaan baik. Jurnal yang unik ini dilengkapi dengan 12 halaman Pelacak Kebiasaan yang bisa ditempel di lemari es, meja kerja, atau tempat mana pun yang kita suka. Selain itu, indeks dan bagian Satu Garis per Hari di jurnal ini akan memudahkan kita membentuk kebiasaan membuat jurnal harian. Ada empat bagian dari jurnal ini yang menyediakan contoh dan desain, yaitu Perkakas Pelacak Kebiasaan, Perkakas Pembuatan Keputusan, Perkakas Produktivitas, dan Perkakas Kebugaran. Semua itu akan membantu kita melakukan perubahan-perubahan kecil yang mendatangkan hasil luar biasa.",
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BukuAdapter(this, bukuList){
            val intent = Intent(this, BukuDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}