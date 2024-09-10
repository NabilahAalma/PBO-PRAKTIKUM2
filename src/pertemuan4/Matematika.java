package pertemuan4;

//1. Dengan Interface buat Class nama Matematika, berisi method dan dua parameter: 
//• pertambahan(int  a, int  b)  
//• pengurangan(int  a, int b) 
//• perkalian(int  a, int  b) 
//• pembagian(int  a, int  b) 

public interface Matematika {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}
//mungkin dalam versi lain dapat gunakan double pada semua variabel dan tipe data yang akan di operasikan jika ingin mengoperasikan maupun menghasilkan nilai pecahan
//misalnya pada contoh soal pengisian parameter untuk pembagian dimana : 21 / 2 = 10.5, namun karena int jadi di bulatkan jadi 10