# stack-queue.StrukturDataB

STACK DAN QUEUE

Stack (tumpukan) adalah struktur data yang meniru bagaimana proses menyimpan dan mengambil suatu buku pada suatu tumpukan buku yang ada di lantai. Apabila diperhatikan dengan seksama maka proses menyimpa buku (disebut push) dan proses mengambil buku (disebut pop) dari suatu tumpukan selalu dilakukan pada bagian atas tumpukan (top of the stack ) sehingga terjadi urutan yang disebut LIFO (Last In First Out). Artinya, buku yang terakhir disimpan adalah buku yang pertama harus diambil karena buku inilah  yang berada pada urutan teratas dari tumpukan.

Operasi dalam stack :
Push : Menyisipkan data ke dalam stack.
Pop : Mengeluarkan data dari stack.
IsEmpty : Untuk mengecek apakah stack dalam keadaan kosong atau tidak.
IsFull : Untuk mengecek apakah stack dalam keadaan penuh atau tidak.
Clear : Mengosongkan isi data.

Pendeklarasian stack :
//deklarasi stack dengan struct dan array
struct STACK
{
      int data[5];
      int top;
};
//deklarasi variabel tumpukan dari struct 
STACK tumpukan;

Queue (antrian) adalah suatu kumpulan data yang penambahan elemen hanya bisa dilakukan pada suatu ujung (disebut dengan sisi belakang atau rear), dan penghapusan atau pengambilan elemen dilakukan lewat ujung yang lain (disebut dengan sisi dengan atau front). Pada queue prinsip yang digunakan adalah FIFO (first in first out).
Ada pun operasi dasar yang dapat dilakukan pada sebuah queue (antrian), yaitu operasi penambahan data (ENQUEUE) dan operasi pengurangan/ pengambilan data (DEQUEUE). Gambar dibawah mengilustrasikan operasi ENQUEUE dan DEQUEUE pada queue yang didimplemenatasikan dengan array berukuran 6 dari proses berurutan sebagai berikut,
P1 : Penambahan 3 data, yaitu A-B-C-D-E
P2 : Pengurangan 2 data
P3 : Penambahan 3 data, yaitu F-G-H

Pada kehidupan sehari-hari, implementasi queue dapat dilustrasikan seperti antrian pasien pada sebuah poliklinik. Jika ada pasien baru maka pasien tersebut akan mendapatkan nomor antrian yang paling besar dan akan menjadi pasien yang terakhir dilayani setelah pasien-pasien yang datang sebelumnya.
