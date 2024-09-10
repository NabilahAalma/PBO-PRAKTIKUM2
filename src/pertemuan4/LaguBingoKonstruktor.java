package pertemuan4;

public class LaguBingoKonstruktor {// Demo Class main atau utama untuk mencetak lirik lagu yang diminta
    public static void main(String[] args) {// TODO code application logic here
        String[] lirik = {//variabel lirik tipe string dengan isi lirik lagu lengkap yang akan dipanggil ke parameter dan nantinya akan di print out
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "B-I-N-G-O",
            "And Bingo was his name-o.",
            " ",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-I-N-G-O",
            "(clap)-I-N-G-O",
            "(clap)-I-N-G-O",
            "And Bingo was his name-o.",
            " ",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-N-G-O",
            "(clap)-(clap)-N-G-O",
            "(clap)-(clap)-N-G-O",
            "And Bingo was his name-o.",
            " ",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-(clap)-G-O",
            "(clap)-(clap)-(clap)-G-O",
            "(clap)-(clap)-(clap)-G-O",
            "And Bingo was his name-o.",
            " ",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-(clap)-(clap)-O",
            "(clap)-(clap)-(clap)-(clap)-O",
            "(clap)-(clap)-(clap)-(clap)-O",
            "And Bingo was his name-o.",
            " ",
            "There was a farmer who had a dog,",
            "And Bingo was his name-o.",
            "(clap)-(clap)-(clap)-(clap)-(clap)",
            "(clap)-(clap)-(clap)-(clap)-(clap)",
            "(clap)-(clap)-(clap)-(clap)-(clap)",
            "And Bingo was his name-o."
        };
        
        LaguBingo bingo = new LaguBingo(lirik);//buat objek lalu panggil atribut dan isi value nya lewat parameter lirik.Dipanggil otomatis ketika new digunakan
        bingo.menyanyi();//lalu lagu bernama bingo ini melakukan perintah behaviour atau method menyanyi yang mana untuk String line di isi dengan lirik dan print parameter line yakni lirik yang sudah di isi sebelumnya
    }
}

//run:
//There was a farmer who had a dog,
//And Bingo was his name-o.
//B-I-N-G-O
//B-I-N-G-O
//B-I-N-G-O
//And Bingo was his name-o.
// 
//There was a farmer who had a dog,
//And Bingo was his name-o.
//(clap)-I-N-G-O
//(clap)-I-N-G-O
//(clap)-I-N-G-O
//And Bingo was his name-o.
// 
//There was a farmer who had a dog,
//And Bingo was his name-o.
//(clap)-(clap)-N-G-O
//(clap)-(clap)-N-G-O
//(clap)-(clap)-N-G-O
//And Bingo was his name-o.
// 
//There was a farmer who had a dog,
//And Bingo was his name-o.
//(clap)-(clap)-(clap)-G-O
//(clap)-(clap)-(clap)-G-O
//(clap)-(clap)-(clap)-G-O
//And Bingo was his name-o.
// 
//There was a farmer who had a dog,
//And Bingo was his name-o.
//(clap)-(clap)-(clap)-(clap)-O
//(clap)-(clap)-(clap)-(clap)-O
//(clap)-(clap)-(clap)-(clap)-O
//And Bingo was his name-o.
// 
//There was a farmer who had a dog,
//And Bingo was his name-o.
//(clap)-(clap)-(clap)-(clap)-(clap)
//(clap)-(clap)-(clap)-(clap)-(clap)
//(clap)-(clap)-(clap)-(clap)-(clap)
//And Bingo was his name-o.
//BUILD SUCCESSFUL (total time: 0 seconds)