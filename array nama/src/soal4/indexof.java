package soal4;

import java.util.ArrayList;
public class indexof {
    public static void main(String[] args) {
        
        //nomor4
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //indexOf(a), indexOf(c), indexOf(q)
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("m");
        nama.add("i");
        nama.add("n");
        
        System.out.println("Hasil dari indexOf(a) = " + nama.indexOf("a"));
        System.out.println("Hasil dari indexOf(c) = " + nama.indexOf("c"));
        System.out.println("Hasil dari indexOf(q) = " + nama.indexOf("q"));
    }
    
}
