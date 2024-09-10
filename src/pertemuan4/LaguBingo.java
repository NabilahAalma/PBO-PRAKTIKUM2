// Class LaguBingo.java untuk implementasi Bingo Interface Class yang dibuat sebelumnya seperti variabel dan method menyanyi() yang tidak Tidak memiliki nilai balik
package pertemuan4;

public class LaguBingo {//Class dengan konstruktur untuk inisiasi dan implementasi lagu Bingo
    public String[] lirik;//inisiasi public dan tipe data lirik yang akan di isi lirik panjang lagu Bingo

    //Method yang digunakan untuk memberi nilai awal pada saat object diciptakan 
    public LaguBingo(String[] lirik) {// Konstruktor dengan parameter lirik tipe data String[]
        this.lirik = lirik;//this untuk menyatakan object lirik 
    }
    
    public void menyanyi() {//method/behaviour menyanyi dari LaguBingo
        for (String line : lirik) {//baris String lirik lagu di isi lirik sebagai parameter
            System.out.println(line);//print parameter line yakni lirik yang akan di demo kan
        }
    }
}