package pertemuan4;

//Buat Class nama MatematikaBeraksi, lalu eksekusi method dan tampilkan: 
//• Pertambahan : 20 + 10 = 30  
//• Pengurangan : 10-5 = 5 
//• Perkalian : 10*3 = 30 
//• Pembagian : 21/2 = 10 //pengecualian jika nilai var b==0 akan menghasilkan nilai tidak terdefinisi
// matematikatkkb (matematika_tambah_kurang_kali_bagi) objek/instance ( variabel yang memiliki nilai yang berbeda di setiap objek) dari Aritmatika.java

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematikatkkb = new Aritmatika();

        System.out.println("Pertambahan : 20 + 10 = " + matematikatkkb.pertambahan(20, 10));//parameter di isi dengan nilai yang diperintahkan pada masing-masing operasi
        System.out.println("Pengurangan : 10 - 5 = " + matematikatkkb.pengurangan(10, 5));//kemudian output nya akan ditampilkan/di print
        System.out.println("Perkalian : 10 * 3 = " + matematikatkkb.perkalian(10, 3));
        System.out.println("Pembagian : 21 / 2 = " + matematikatkkb.pembagian(21, 2));
    }
}
//mungkin dalam versi lain dapat gunakan double pada semua variabel dan tipe data yang akan di operasikan jika ingin mengoperasikan maupun menghasilkan nilai pecahan
//misalnya pada contoh soal pengisian parameter untuk pembagian dimana : 21 / 2 = 10.5, namun karena int jadi di bulatkan jadi 10

//run:
//Pertambahan : 20 + 10 = 30
//Pengurangan : 10 - 5 = 5
//Perkalian : 10 * 3 = 30
//Pembagian : 21 / 2 = 10
//BUILD SUCCESSFUL (total time: 0 seconds)