package com.example.projek2;

import java.util.ArrayList;

public class AppsData {

    private static String[] judul = new String[] {
            "Facebook","Gmail","Instagram","Line","LinkedIn","Messenger",
            "Pinterest","TikTok","Twitter","WhatsApp","Youtube"};
    private static int[] gambar = new int[] {R.drawable.img_fb,R.drawable.img_gmail,
            R.drawable.img_ig,R.drawable.img_line,R.drawable.img_linkedin,
            R.drawable.img_messenger,R.drawable.img_pint,R.drawable.img_tt,
            R.drawable.img_twitter,R.drawable.img_wa,R.drawable.img_yt};
    private static String[] desc = new String[] {
            "@Facebook #Sosial\n" +
                    "Rating 12+\n" +
                    "109.012.396\n" +
                    "Berisi Iklan·Menawarkan pembelian dalam aplikasi\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "Tambahkan ke Wishlist\t\n" +
                    "\n" +
                    "Mengikuti berita teman kini lebih cepat dari sebelumnya.\n" +
                    "\n" +
                    "• Mengetahui apa yang dilakukan teman\n" +
                    "• Berbagi pembaruan, foto, dan video\n" +
                    "• Mendapat pemberitahuan ketika teman menyukai dan mengomentari kiriman Anda\n" +
                    "• Memainkan permainan dan menggunakan aplikasi favorit\n" +
                    "• Jual beli secara lokal di Marketplace Facebook\n" +
                    "\n" +
                    "Sekarang Anda dapat mengakses versi terbaru Facebook untuk Android lebih awal dengan menjadi penguji versi beta. Pelajari cara mendaftar, memberi masukan, dan keluar dari program di Pusat Bantuan kami: http://on.fb.me/133NwuP\n" +
                    "\n" +
                    "Ada masalah saat mengunduh atau memasang aplikasi? Lihat http://bit.ly/GPDownload1\n" +
                    "Masih perlu bantuan? Beri tahu kami selengkapnya tentang masalah Anda. http://bit.ly/invalidpackage\n" +
                    "\n" +
                    "Facebook hanya tersedia untuk pengguna yang berusia 13 tahun ke atas.\n" +
                    "Ketentuan Layananhttp://m.facebook.com/terms.php.\n",
            "@Google #LLCKomunikasi\n" +
                    "Rating 3+\n" +
                    "9.003.998\n" +
                    "Berisi Iklan\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "\n" +
                    "Gmail adalah aplikasi email yang mudah digunakan untuk menghemat waktu Anda dan menyimpan pesan dengan aman. Langsung terima pesan melalui notifikasi push, baca dan tanggapi secara online maupun offline, dan temukan pesan apa pun dengan cepat.\n" +
                    "Dengan aplikasi Gmail Anda mendapatkan:\n" +
                    "• Kotak masuk yang teratur - pesan sosial dan promosi diurutkan ke dalam kategori, sehingga Anda dapat membaca pesan dari teman dan keluarga terlebih dahulu.\n" +
                    "• Spam berkurang - Gmail memblokir spam sebelum sampai ke kotak masuk untuk menjaga akun Anda tetap aman dan rapi.\n" +
                    "• 15 GB penyimpanan gratis - Anda tidak perlu menghapus pesan untuk menghemat ruang penyimpanan.\n" +
                    "• Dukungan untuk banyak akun - Gunakan kedua alamat Gmail dan non-Gmail (Outlook.com, Yahoo Mail, atau email IMAP/POP lainnya) langsung dari aplikasi.",
            "@Instagram #Sosial\n" +
                    "Rating 12+\n" +
                    "115.714.487\n" +
                    "Berisi Iklan·Menawarkan pembelian dalam aplikasi\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "Merapatkan orang dan perkara yang anda sayangi. — Instagram daripada Facebook\n" +
                    "\n" +
                    "Berhubung dengan rakan, kongsi aktiviti anda atau lihat perkara baharu daripada orang lain di seluruh dunia. Teroka komuniti kami di mana anda boleh berasa bebas untuk menjadi diri anda sendiri dan berkongsi segala-galanya dari detik harian anda hingga sorotan kehidupan.\n" +
                    "\n" +
                    "Luahkan Perasaan Anda dan Berhubung Dengan Rakan\n" +
                    "\n" +
                    "* Tambahkan foto dan video pada kisah anda yang akan hilang selepas 24 jam serta ceriakan cerita anda menggunakan alat kreatif yang menyeronokkan.\n" +
                    "* Hantarkan mesej kepada rakan anda dalam Direct. Mulakan perbualan yang menyeronokkan tentang perkara yang anda lihat pada Suapan dan Cerita.\n" +
                    "* Siarkan foto dan video ke suapan anda yang ingin ditunjukkan pada profil anda.\n" +
                    "\n" +
                    "Ketahui Lebih Lanjut Tentang Minat Anda\n" +
                    "\n" +
                    "* Lihat IGTV untuk menonton video yang lebih panjang daripada pencipta kegemaran anda.\n" +
                    "* Dapatkan inspirasi daripada foto dan video daripada akaun baharu dalam Explore.\n" +
                    "* Temui jenama dan perniagaan kecil serta produk kedai yang berkaitan dengan gaya peribadi anda.\n",
            "@LINE #Corporation #Komunikasi\n" +
                    "Rating 3+\n" +
                    "12.840.779\n" +
                    "Berisi Iklan·Menawarkan pembelian dalam aplikasi\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "\n" +
                    "LINE membentuk ulang komunikasi di dunia, memungkinkan kamu untuk tidak hanya menikmati layanan pesan, tetapi juga panggilan suara dan video gratis di mana pun kamu berada.\n" +
                    "\n" +
                    "Unduh LINE dan temukan alasan mengapa aplikasi ini populer di dunia dan menjadi aplikasi nomor 1 yang paling sering diunduh di 52 negara.\n" +
                    "\n" +
                    "Fitur-fitur terbaru LINE\n" +
                    "★ Mengobrol soal minat yang sama di OpenChat\n" +
                    "Nikmati obrolan seru dan terbuka mengenai beragam topik bersama kenalan baru.\n" +
                    "\n" +
                    "★ Percakapan intim atau diskusi bersama bisa dilakukan di mana saja dengan fitur panggilan video grup\n" +
                    "Mengobrol dengan hingga 200 teman di grup secara bersamaan! Nikmati juga obrolan video tatap muka langsung dengan teman!\n" +
                    "\n" +
                    "★ Gunakan polling untuk segera mengetahui pendapat temanmu\n" +
                    "Dari tempat janjian hingga mau makan apa, hindari diskusi yang terlalu panjang dan buat keputusan secara mudah dengan membuat polling.\n" +
                    "\n" +
                    "Fitur-fitur utama LINE\n" +
                    "★ Panggilan suara dan video gratis di mana pun, kapan pun\n" +
                    "Nikmati panggilan berkualitas tinggi tanpa biaya, di mana pun kamu berada. Benar-benar gratis bahkan untuk panggilan internasional dengan hingga 200 orang sekaligus! Gunakan berbagai efek dan filter agar panggilan videomu jadi lebih menyenangkan (Harap perhatikan bahwa fitur ini mungkin tidak tersedia pada perangkat tertentu).\n" +
                    "\n" +
                    "★ Ruang obrolan praktis untuk berbagai hal\n" +
                    "Bagikan pesan, foto, video, stiker, pesan suara, dan lokasi kepada teman dengan mudah\n" +
                    "\n" +
                    "★ Fitur jejaring sosial yang asik dan mudah digunakan\n" +
                    "Dari pesan dan stiker hingga foto, video, dan lokasi, bagikan momen sehari-harimu dengan teman di Timeline!\n" +
                    "\n" +
                    "★ Temukan berbagai karakter paling populer di dunia di Toko Stiker\n" +
                    "Temukan ratusan stiker gratis yang populer ditambah stiker menggemaskan dari berbagai karakter favorit dunia! Pilih dari beragam kumpulan stiker LINE untuk menghidupkan pesanmu dengan cara yang unik.\n" +
                    "\n" +
                    "★ Sinkronisasi otomatis antara perangkat dan PC\n" +
                    "Baik saat menggunakan LINE untuk seluler atau tersambung ke LINE untuk PC menggunakan PC atau Mac, obrolan LINE kamu akan selalu diperbarui dan disinkronkan secara otomatis.\n" +
                    "\n" +
                    "★ Ruang penyimpanan pribadi: Keep\n" +
                    "Simpan pesan, foto, video, dan lainnya di Keep, tempat dimana kamu bisa berbagi dengan mudah bersama teman.\n" +
                    "\n" +
                    "★ Info menarik dari berbagai Official Account LINE\n" +
                    "Tambahkan Official Account untuk menerima pesan asli dari selebriti terkenal dari negara pilihanmu.\n" +
                    "\n" +
                    "★ Lakukan panggilan internasional dengan LINE Out\n" +
                    "Lakukan panggilan internasional ke ponsel dan sambungan telepon kabel dengan tarif rendah. Kamu bahkan bisa menghubungi teman yang tidak memiliki LINE.\n" +
                    "Sebagai tambahan, kamu dapat menikmati panggilan gratis setelah menonton iklan dengan LINE Out Gratis.\n" +
                    "\n" +
                    "■Kami sarankan untuk menggunakan paket data atau terhubung ke Wi-Fi karena kamu dapat dikenakan biaya transfer data.\n" +
                    "■ Gunakan LINE dengan Android OS versi 4.4 ke atas untuk dapat menikmati LINE secara maksimal.\n" +
                    "\n" +
                    "**********\n" +
                    "Jika kecepatan jaringan terlalu lambat atau jika tidak tersedia cukup ruang penyimpanan pada perangkat, LINE mungkin tidak dapat terinstal dengan benar.\n" +
                    "\n" +
                    "Jika hal ini terjadi, harap periksa koneksimu dan coba lagi.\n" +
                    "**********",
            "@LinkedIn #Bisnis\n" +
                    "Rating 12+\n" +
                    "2.002.821\n" +
                    "Berisi Iklan·Menawarkan pembelian dalam aplikasi\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "Tambahkan ke Wishlist\t\n" +
                    "\n" +
                    "Aplikasi LinkedIn memudahkan untuk terhubung dengan orang-orang dan hal-hal yang penting untuk kehidupan profesional Anda. Bangun dan kembangkan jaringan profesional Anda, baca berita bisnis dan industri terbaru, dan temukan pekerjaan impian Anda.\n" +
                    "\n" +
                    "Semuanya dimulai dengan profil LinkedIn Anda. Di sini tidak hanya sekadar resume profesional Anda — tapi juga menunjukkan siapa diri Anda dan apa yang telah Anda capai dalam karier Anda. Ini baru permulaan:\n" +
                    "• Mencari orang, pekerjaan, perusahaan, dan grup di LinkedIn\n" +
                    "• Mendapatkan update dari orang-orang, penerbit, dan perusahaan yang penting demi kesuksesan karier profesional Anda\n" +
                    "• Menunjukkan diri Anda dalam profil profesional Anda dan membangun brand profesional Anda\n" +
                    "• Memperbarui profil profesional langsung dari dalam aplikasi untuk menyempurnakan resume Anda\n" +
                    "• Mengembangkan jaringan profesional Anda dan terus terhubung\n" +
                    "• Terhubung dengan orang-orang dan melihat profil profesional mereka\n" +
                    "• Membagikan artikel untuk mengembangkan diri Anda sebagai profesional terkemuka\n" +
                    "• Mengikuti perusahaan untuk mendapatkan posting pekerjaan, update bisnis, dan saran untuk terhubung dengan orang-orang yang mungkin Anda kenal\n" +
                    "• Mengupgrade akun Anda ke LinkedIn Premium langsung dari dalam aplikasi\n",
            "@Messenger #Facebook #Komunikasi\n" +
                    "Rating 12+\n" +
                    "77.399.191\n" +
                    "Menawarkan pembelian dalam aplikasi\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "Tambahkan ke Wishlist\t\n" +
                    "\n" +
                    "Tetaplah bersama kapan saja, dengan aplikasi komunikasi di satu tempat gratis* kami, lengkap dengan fitur pengiriman teks, panggilan suara dan video, serta obrolan video grup yang tak terbatas. Sinkronkan pesan dan kontak Anda secara mudah ke ponsel Android dan terhubunglah dengan siapa saja, di mana saja.\n" +
                    "\n" +
                    "PENGIRIMAN PESAN DAN TELEPON LINTAS APLIKASI\n" +
                    "Terhubunglah dengan teman Instagram Anda langsung dari Messenger. Cukup cari nama atau nama pengguna mereka agar bisa mengirim pesan atau menelepon.\n" +
                    "\n" +
                    "MODE MENGHILANG\n" +
                    "Kirimkan pesan yang hanya bertahan beberapa saat. Pilih gunakan mode menghilang di mana pesan yang sudah Anda lihat akan menghilang setelah keluar dari obrolan.\n" +
                    "\n" +
                    "PENGATURAN PRIVASI\n" +
                    "Dengan pengaturan privasi yang baru, Anda bisa memilih siapa yang bisa menghubungi Anda dan ke mana pesan Anda akan dikirim.\n" +
                    "\n" +
                    "TANGGAPAN KHUSUS\n" +
                    "Kehabisan kata-kata? Anda bisa menyesuaikan tanggapan, dengan jauh lebih banyak pilihan emoji, termasuk \uD83C\uDF89 dan \uD83D\uDD25.\n" +
                    "\n" +
                    "TEMA OBROLAN\n" +
                    "Pilih berbagai tema dan warna yang menarik, seperti Tie-Dye atau Cinta, untuk membuat obrolan Anda lebih personal.\n" +
                    "\n" +
                    "NONTON BARENG\n" +
                    "Tonton video, acara tv, dan film dengan teman melalui Obrolan Video dan Forum Messenger saat Anda tidak bisa bersama mereka. Abadikan setiap momen dan tanggapan secara realtime.\n" +
                    "\n" +
                    "KUMPULKAN ANGGOTA GRUP DENGAN FORUM\n" +
                    "Kirimkan tautan obrolan video grup ke siapa saja, meskipun mereka tidak punya Messenger. Selenggarakan obrolan dengan hingga 50 orang tanpa batas waktu.\n" +
                    "\n" +
                    "PANGGILAN VIDEO GRATIS* UNTUK TETAP TERHUBUNG\n" +
                    "Tetaplah dekat dengan teman dan keluarga Anda menggunakan obrolan video langsung tanpa batas. Adakan panggilan video grup dengan hingga 8 orang, menggunakan audio berkualitas tinggi, video definisi tinggi, dan berbagai fitur video interaktif seperti filter wajah.\n" +
                    "\n" +
                    "KIRIM PESAN TEKS & TELEPON GRATIS* TANPA BATAS\n" +
                    "Tak perlu bertukar nomor telepon. Cukup kirimkan pesan ke teman Facebook Anda, meskipun mereka berada di seluruh penjuru dunia. Nikmati pengiriman pesan teks dan suara berkualitas tinggi ke perangkat seluler, tablet, dan desktop.\n" +
                    "\n" +
                    "NONAKTIFKAN CAHAYA DALAM MODE GELAP\n" +
                    "Istirahatkan mata Anda dengan tampilan baru ringkas yang menggelapkan warna antarmuka obrolan.\n" +
                    "\n" +
                    "REKAM DAN KIRIM PESAN SUARA DAN VIDEO\n" +
                    "Saat pesan saja tidak cukup, tekan rekam, lalu kirim. Katakan, nyanyikan, tunjukkan, atau teriakkan dengan lantang.\n" +
                    "\n" +
                    "EKSPRESIKAN DIRI ANDA DENGAN STIKER, GIF, DAN EMOJI\n" +
                    "Gunakan stiker khusus untuk menunjukkan sisi kreatif Anda. Anda bahkan bisa menambahkan efek dan filter ke panggilan video.\n" +
                    "\n" +
                    "KIRIM FILE, FOTO, DAN VIDEO\n" +
                    "Tak ada batasan jumlah file yang ingin Anda bagikan dengan teman.\n" +
                    "\n" +
                    "RENCANAKAN DAN WUJUDKAN JADI NYATA\n" +
                    "Buat rencana kumpul-kumpul dengan polling dan sebagainya. Sarankan lokasi pertemuan atau beri tahu teman lokasi Anda dengan membagikannya hanya dengan beberapa ketuk.\n" +
                    "\n" +
                    "KIRIM UANG DENGAN AMAN DAN MUDAH (hanya di AS)\n" +
                    "Kirim dan terima uang secara aman dan mudah dengan teman dan keluarga langsung dari aplikasi dengan menambahkan kartu debit, akun PayPal, atau kartu prabayar yang bisa diisi ulang (kartu dengan satu sumber hanya memenuhi syarat untuk mengirim uang).\n" +
                    "\n" +
                    "BERBINCANGLAH DENGAN PELAKU BISNIS\n" +
                    "Jalin koneksi secara mudah dengan pelaku bisnis favorit Anda untuk memesan tempat, mendapatkan dukungan pelanggan, mencari promo, dan lain-lain.\n" +
                    "\n" +
                    "HADIRKAN SMS KE MESSENGER\n" +
                    "Tak perlu buka banyak aplikasi untuk tetap terhubung. Cukup gunakan satu aplikasi untuk SMS dan Messenger.\n" +
                    "\n" +
                    "KOMPATIBEL DI SELURUH PLATFORM\n" +
                    "Ngobrollah dengan teman di seluruh ragam perangkat, seperti desktop, Portal, dan lainnya.\n" +
                    "\n" +
                    "Kebijakan Privasi: https://www.facebook.com/about/privacy/\n" +
                    "\n" +
                    "PELAJARI SELENGKAPNYA tentang pengiriman pesan dan obrolan video grup Messenger di: http://messenger.com (https://messenger.com/)\n" +
                    "\n" +
                    "* Tarif data berlaku\n" +
                    "\n" +
                    "Beberapa fitur Messenger mungkin tidak tersedia di negara atau wilayah Anda.",
            "@Pinterest #Gaya #Hidup\n" +
                    "Rating 12+\n" +
                    "7.757.777\n" +
                    "Berisi Iklan\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "\n" +
                    "Apakah Anda selalu mencari wallpaper background terbaru, kutipan penyemangat, koleksi resep simpel untuk dicoba? Aplikasi ini terbaik untuk menemukan, mengumpulkan dan unduh yang Anda perlukan.\n" +
                    "\n" +
                    "Temukan jutaan ide kreatif dan inspiratif di aplikasi Pinterest, seperti:\n" +
                    "\uD83D\uDE0D Gambar lucu dan cute terbaru untuk wallpaper telepon genggam, laptop atau tablet\n" +
                    "✨ Kumpulan quotes, kutipan, kata-kata romantis atau motivasi/penyemangat dalam bahasa Indonesia dan Inggris\n" +
                    "⚒️Desain rumah, desain arsitektur rumah, gaya trending interior rumah terbaru. Pastinya sangat cocok jika Anda baru pindah rumah atau hanya ingin perbarui suasana dekorasi kamar dan interior rumah\n" +
                    "\uD83D\uDC95 Wedding tips dan ide kreatif wedding photo - semua konten gratis ini siap untuk berikan inspirasi acara pernikahan\n" +
                    "\uD83E\uDDF5Jutaan inspo untuk proyek DIY di akhir pekan, mulai dari project memasak, hingga seni dan craft membuat hadiah atau proyek DIY di rumah\n" +
                    "\uD83E\uDD33\uD83C\uDFFD Perbarui wallpaper handphone atau laptop Anda dengan koleksi gambar ilustrasi lucu lucu\n" +
                    "\uD83C\uDF0EDestinasi travel terbaru baik di Indonesia ataupun di luar Indonesia. Temukan juga kabar dan inspirasi tempat nongkrong baru, baik untuk kebutuhan travel ataupun sumber inspirasi. Jangan ketinggalan juga, temukan juga tips fitness, hidup sehat dan tips merawat diri cantik luar dalam\n" +
                    "\uD83D\uDC84 Fashion OOTD dan outfit untuk wanita, wanita ber- hijab dan pria baik dari Indonesia ataupun mancanegara\n" +
                    "\uD83C\uDF73Resep makanan untuk sehari-hari, tutorial resep masakan indonesia dari kue hingga nasi. Temukan juga koleksi resep masakan barat/non- Indonesia. Pelajari resep baru yuk!\n" +
                    "\uD83D\uDCA1Jutaan inspo baru dari dunia kreasi tattoo, temukan inspirasi desain - desain tattoo yang keren disini\n" +
                    "\n" +
                    "\n" +
                    "Fitur apa saja yang dapat Anda temukan di aplikasi Pinterest?\n" +
                    "⭐️ Pinterest Lens, sebuah fitur yang menggunakan kamera Anda untuk mengambil photo. Dengan mudah Anda dapat cari tutorial gratis atau tips cara membuat/memasak/menciptakan ide - ide brilian menjadi realita. Mudah cara pakainya, klik logo kamera atau photo yang ada di aplikasi Pinterest, ambil gambar, dan temukan jutaan ide yang serupa.\n" +
                    "⭐️ Kumpulkan dan bagikan ide Anda! Mulai dari percobaan proyek DIY yang kreatif dan unik, resep masakan indonesia, tips dekor rumah, atur ide Anda semua dalam satu papan sehingga memudahkan untuk menciptakan ide tersebut menjadi realita. Bagikan temuan atau inspo yang Anda temukan melalui aplikasi media sosial lainnya\n" +
                    "⭐️ Kirimkan ide dan inspo kreatif yang Anda temukan, yaitu pin atau papan dalam bentuk photo/image/gambar ullzang atau couple goals, ke teman-teman Anda di dunia social, melalu fitur pesan, SMS atau media sosial lainnya\n" +
                    "⭐️ Unduh pin/gambar yang Anda suka dan simpan ke photo gallery/camera di perangkat Anda\n" +
                    "⭐️ Unggah percobaan atau proyek DIY yang sudah Anda coba dalam bentuk sebuah photo, berbagi tips dan informasi dengan komunitas di Pinterest mengenai suatu proyek tersebut\n" +
                    "\n" +
                    "Sebagai aplikasi gratis yang selalu memberikan Anda jutaan ide kreatif dan inspirasi tentang favorit k-pop band. Hanya dengan 1 klik tombol 'Simpan', Anda dapat kumpulkan inspirasi, phone wallpaper band music korea favorit Anda di satu tempat. Keren kan!\n" +
                    "\n" +
                    "Yuk, download app gratis Pinterest hari ini! Dapakan jutaan inspo dan ide baru dan kreatif secara gratis dan cuma - cuma. Berikan diri Anda hadiah untuk dapat menjadi selalu kreatif setiap saat.\n" +
                    "\n" +
                    "Kabar baik, jika Anda sudah download, yuk pastikan Anda perbarui aplikasi gratis Pinterest hari ini. Pastinya jangan sampai tertinggal banyak sekali ide baru dan inspirasi yang ada disini ya..\n",
            "@TikTok #Pte. #Ltd.Pemutar&Editor #Video\n" +
                    "Rating 12+\n" +
                    "9.513.853\n" +
                    "Menawarkan pembelian dalam aplikasi\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "\n" +
                    "Cuma TikTok pusatnya video kreatif dan viral! Download sekarang!\n" +
                    "\n" +
                    "TikTok adalah platform sosial video pendek yang dipadukan dengan musik. Musik untuk tarian, gaya kreatif, ataupun unjuk bakat, para pengguna didorong untuk berimajinasi sebebas-bebasnya dan meluapkan ekspresi mereka dengan bebas. Dirancang untuk generasi kekinian, melalui TikTok kamu dapat membuat video pendek yang unik dengan cepat dan mudah untuk dibagikan dengan teman dan ke seluruh dunia. TikTok adalah gudangnya video viral yang cocok untuk kamu yang berjiwa muda. Kami berusaha untuk memberdayakan lebih banyak pembuat konten kreatif dan berkualitas untuk menjadi bagian dari revolusi konten.\n" +
                    "\n" +
                    "[Kualitas Tajam yang Nyata]\n" +
                    "Diunggah dengan mudah, tampilan yang mulus, dan lacar digunakan.\n" +
                    "Setiap detail video ditampilkan dalam kualitas yang sempurna.\n" +
                    "\n" +
                    "[Studio dalam Genggaman]\n" +
                    "Kolaborasi sempurna antara kecerdasan buatan dan jepretan gambar.\n" +
                    "Menyempurnakan keunggulan produk melalui sinkronisasi musik, efek spesial, dan teknologi canggih.\n" +
                    "Studio video kreatif yang menakjubkan sekarang ada digenggamanmu.\n" +
                    "\n" +
                    "[Daftar Musik kekinian yang Sangat Lengkap]\n" +
                    "Bawa imajinasi dan kreativitasmu ke tingkat yang lebih tinggi dan masuki dunia baru yang tak terbatas.\n",
            "@Twitter, #Inc.Sosial\n" +
                    "Rating 12+\n" +
                    "17.462.380\n" +
                    "Berisi Iklan·Menawarkan pembelian dalam aplikasi\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "\n" +
                    "Gabung dalam percakapan! Twitter adalah aplikasi jejaring sosial andalan dan sumber informasi peristiwa dunia. Mulai dari berita terbaru di Indonesia, cuaca, politik, hingga olahraga seperti renang dan sepak bola, apa pun yang terjadi di dunia, pasti ada di Twitter terlebih dahulu. Temukan teman atau ikuti para influencer dan selebritis. Setiap suara dapat memengaruhi dunia!\n" +
                    "\n" +
                    "Buka obrolan pribadi atau buka percakapan besar dengan orang-orang yang mengikuti Anda. Ikuti semua tren dan tagar, tinggalkan komentar pada postingan media sosial teman dan follower Twitter Anda lainnya. Ikuti selebritis favorit Anda dan ratusan pengguna Twitter yang menarik, untuk membaca konten mereka dalam sekejap. Suguhi jejaring sosial Anda dengan cerita trending, humor, GIF, foto, dan video viral. Bagikan berita terkini atau gosip selebritis favorit Anda. Ketahui mana saja twit Anda yang disukai atau diretwit.\n" +
                    "\n" +
                    "Buat akun Twitter gratis Anda sekarang juga!\n" +
                    "\n" +
                    "Twitter bukan hanya sumber berita dunia, tetapi juga sarana untuk menemukan orang-orang menarik, acara TV dan film, selebritis, pemain olahraga, dan politisi, serta menjaring banyak orang yang tertarik tentang Anda. Menjaga jejaring sosial tidak pernah semudah ini! Itu sebabnya Twitter menjadi salah satu platform media sosial yang paling banyak digunakan di dunia.\n" +
                    "\n" +
                    "Buat Profil yang Menarik\n" +
                    "\n" +
                    "Kreasikan profil Anda, tambahkan foto, deskripsi, lokasi, dan foto latar belakang\n" +
                    "\n" +
                    "-Kirimkan twit sering-sering dan optimalkan waktu posting Anda\n" +
                    "-Kirimkan konten visual\n" +
                    "-Gunakan tagar dalam twit Anda\n" +
                    "-Tarik follower di luar Twitter\n" +
                    "\n" +
                    "Ketahui Apa yang Sedang Tren Sekarang\n" +
                    "\n" +
                    "Jika Anda penggemar olahraga, gunakan Twitter untuk mengikuti berita bola basket, lari, renang, bola voli, silat, atau tinju. Cek semua pertandingan sepak bola dan futsal, ikuti tim favorit Anda agar selalu mendapat kabar terbaru melalui linimasa Anda.\n" +
                    "\n" +
                    "Anda mungkin tertarik dengan berita bisnis dan pasar saham, atau tren di dunia hiburan dan budaya. Apa pun itu, Twitter adalah sumber berita Anda.\n" +
                    "\n" +
                    "Gabung dalam percakapan atau tonton video siaran langsung untuk berinteraksi secara mendalam dengan banyak pemirsa, langsung dari perangkat seluler Anda. Siarkan tayangan langsung, buat acara streaming langsung, bagikan video media sosial, atau duduk dan saksikan acara dari seluruh dunia.\n" +
                    "\n" +
                    "Sukai kami di Facebook https://www.facebook.com/TwitterInc/\n" +
                    "Ikuti kami di Instagram https://www.instagram.com/twitter/?hl=id\n" +
                    "\n" +
                    "Kebijakan Privasi: https://twitter.com/en/privacy\n" +
                    "Syarat dan Ketentuan: https://twitter.com/en/tos\n" +
                    "\n" +
                    "\n" +
                    "Kami membagikan data pengidentifikasi perangkat dengan sejumlah mitra pengiklanan, yang dapat mnecakup peristiwa buka aplikasi yang terjadi sebelum proses pendaftaran. Lihat di sini untuk detail selengkapnya: https://help.twitter.com/id/safety-and-security/data-through-partnerships\n",
            "@WhatsApp #LLCKomunikasi\n" +
                    "Rating 3+\n" +
                    "133.455.431\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "\n" +
                    "WhatsApp dari Facebook\n" +
                    "\n" +
                    "WhatsApp Messenger adalah aplikasi perpesanan GRATIS yang tersedia untuk Android dan ponsel cerdas lainnya. WhatsApp menggunakan koneksi Internet telepon Anda (4G/3G/2G/EDGE atau Wi-Fi, jika tersedia) yang memungkinkan Anda mengirim pesan dan menelepon teman dan keluarga. Beralihlah dari SMS ke WhatsApp untuk mengirim dan menerima pesan, panggilan, video, dokumen, dan Pesan Suara.\n" +
                    "\n" +
                    "MENGAPA MENGGUNAKAN WHATSAPP:\n" +
                    "\n" +
                    "• TANPA BIAYA: WhatsApp menggunakan koneksi Internet telepon Anda (4G/3G/2G/EDGE atau Wi-Fi, jika tersedia) yang memungkinkan Anda mengirim pesan dan menelepon teman dan keluarga, sehingga Anda tidak perlu mengeluarkan biaya untuk setiap pesan atau panggilan.* Tidak ada biaya langganan untuk menggunakan WhatsApp.\n" +
                    "\n" +
                    "• MULTIMEDIA: Mengirim dan menerima foto, video, dokumen, dan Pesan Suara.\n" +
                    "\n" +
                    "• PANGGILAN GRATIS: Hubungi teman dan keluarga Anda secara gratis dengan Panggilan WhatsApp, meskipun jika mereka berada di negara lain.* Panggilan WhatsApp menggunakan koneksi Internet telepon dan bukan paket seluler Anda. (Catatan: Biaya data mungkin berlaku. Hubungi penyedia layanan seluler Anda untuk informasi selengkapnya. Selain itu, Anda tidak dapat mengakses 119 dan nomor layanan darurat lainnya melalui WhatsApp).\n" +
                    "\n" +
                    "• CHAT GRUP: Nikmati chat grup dengan kontak Anda agar dapat dengan mudah terhubung dengan teman dan keluarga.\n" +
                    "\n" +
                    "• WHATSAPP WEB: Anda juga dapat mengirim dan menerima pesan WhatsApp langsung dari browser komputer Anda.\n" +
                    "\n" +
                    "• TANPA BIAYA INTERNASIONAL: Tidak ada biaya tambahan untuk mengirim pesan WhatsApp secara internasional. Chat dengan teman Anda di seluruh penjuru dunia dan hindari biaya SMS internasional.*\n" +
                    "\n" +
                    "• KATAKAN TIDAK PADA NAMA PENGGUNA DAN PIN: Mengapa harus repot mengingat nama pengguna atau PIN? WhatsApp bekerja dengan nomor telepon Anda, sama seperti SMS, dan terintegrasi secara lancar dengan buku alamat telepon Anda.\n" +
                    "\n" +
                    "• SELALU MASUK: Dengan WhatsApp, akun Anda selalu masuk, sehingga tidak ada pesan yang terlewat. Tidak ada kebingungan mengenai apakah akun Anda sedang masuk atau keluar.\n" +
                    "\n" +
                    "• TERHUBUNG SECARA CEPAT DENGAN KONTAK ANDA: Buku alamat Anda digunakan untuk menghubungkan Anda dengan kontak yang memiliki WhatsApp secara cepat dan mudah sehingga tidak perlu menambahkan nama pengguna yang sulit untuk diingat.\n" +
                    "\n" +
                    "• PESAN OFFLINE: Jika Anda mematikan telepon atau tidak melihat notifikasi, WhatsApp akan menyimpan pesan terbaru hingga saat Anda menggunakan WhatsApp lagi.\n" +
                    "\n" +
                    "• DAN MASIH BANYAK LAGI: Bagikan lokasi Anda, bertukar kontak, setel wallpaper dan suara notifikasi khusus, kirim pesan siaran ke beberapa kontak sekaligus, dan masih banyak lagi.\n" +
                    "\n" +
                    "\\*Biaya data mungkin berlaku. Hubungi penyedia layanan seluler Anda untuk informasi selengkapnya.\n" +
                    "\n" +
                    "---------------------------------------------------------\n" +
                    "Kami selalu senang menerima kabar dari Anda. Jika Anda memiliki umpan balik, pertanyaan, atau keluhan, silakan kirimkan kami email di:\n" +
                    "\n" +
                    "android-support@whatsapp.com\n" +
                    "\n" +
                    "atau ikuti kami di twitter:\n" +
                    "\n" +
                    "http://twitter.com/WhatsApp\n" +
                    "@WhatsApp\n" +
                    "---------------------------------------------------------\n",
            "@YouTube #Google #LLCPemutar&Editor #Video\n" +
                    "Rating 12+\n" +
                    "98.217.406\n" +
                    "Berisi Iklan\n" +
                    "Aplikasi ini tersedia untuk perangkat Anda\n" +
                    "\n" +
                    "Dapatkan aplikasi YouTube resmi di ponsel dan tablet Android. Lihat video yang ditonton pengguna di seluruh dunia -- dari video musik paling trendi hingga konten game, mode, kecantikan, berita, pembelajaran, dan lain-lain yang sedang populer. Subscribe channel yang Anda sukai, buat konten Anda sendiri, bagikan kepada teman, dan tonton di perangkat apa pun.\n" +
                    "\n" +
                    "Tonton dan subscribe\n" +
                    "● Telusuri rekomendasi pribadi di tab Beranda\n" +
                    "● Lihat konten terbaru dari channel favorit Anda di tab Subscription\n" +
                    "● Temukan video yang pernah Anda tonton, sukai, dan simpan untuk nanti di tab Koleksi\n" +
                    "\n" +
                    "Jelajahi beragam topik, yang sedang populer, dan sedang naik daun (tersedia di negara tertentu)\n" +
                    "● Terus ikuti konten musik, game, kecantikan, berita, pembelajaran, dan lain-lain yang sedang populer\n" +
                    "● Lihat apa yang sedang tren di YouTube dan di seluruh dunia di tab Jelajahi\n" +
                    "● Kenali Kreator, Gamer, dan Artis Naik Daun (tersedia di negara tertentu) yang paling keren\n" +
                    "\n" +
                    "Jalin hubungan dengan komunitas YouTube\n" +
                    "● Ikuti kreator favorit Anda melalui Postingan, Stories, Premiere, dan Live stream\n" +
                    "● Gabung dalam percakapan melalui komentar dan berinteraksilah dengan kreator dan anggota komunitas lainnya\n" +
                    "\n" +
                    "Buat konten dari perangkat seluler\n" +
                    "● Buat atau upload video Anda sendiri langsung dari aplikasi YouTube\n" +
                    "● Jalin interaksi dengan penonton secara real time melalui live streaming langsung dari aplikasi YouTube\n" +
                    "\n" +
                    "Temukan pengalaman yang cocok untuk Anda dan keluarga (tersedia di negara tertentu)\n" +
                    "● Setiap keluarga memiliki pendekatan yang berbeda terhadap video online. Ketahui opsi Anda: aplikasi YouTube Kids atau pengalaman yang diawasi orang tua (baru) di youtube.com/myfamily\n" +
                    "\n" +
                    "Dukung kreator yang Anda sukai dengan langganan channel (tersedia di negara tertentu)\n" +
                    "● Gabung ke channel yang menawarkan langganan bulanan berbayar dan dukung karya kreatornya\n" +
                    "● Dapatkan akses ke keuntungan eksklusif channel & jadilah bagian dari komunitas pelanggannya\n" +
                    "● Jadikan komentar dan live chat tampak berbeda dengan badge loyalitas di samping nama pengguna Anda\n" +
                    "\n" +
                    "Upgrade ke YouTube Premium (tersedia di negara tertentu)\n" +
                    "● Tonton video tanpa gangguan iklan, sambil menggunakan aplikasi lain, atau saat layar terkunci\n" +
                    "● Simpan video untuk ditonton pada saat yang lebih tepat – misalnya saat di pesawat atau transportasi umum\n" +
                    "● Dapatkan akses ke YouTube Music Premium sebagai bagian dari manfaat"};

    public static ArrayList<AppsModel> getListData() {
        AppsModel appsModel = null;
        ArrayList<AppsModel> list = new ArrayList<>();
        for (int i = 0; i < judul.length; i++){
            appsModel = new AppsModel();
            appsModel.setGambar(gambar[i]);
            appsModel.setJudul(judul[i]);
            appsModel.setDesc(desc[i]);
            list.add(appsModel);
        }
        return list;
    }
}

