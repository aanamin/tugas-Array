package soal5;

import java.util.ArrayList;
public class remove {
    public static void main(String[] args) {
        
        //nomor5
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //remove(0), remove(3), remove(2)
        
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("m");
        nama.add("i");
        nama.add("n");

        nama.remove(0);
        System.out.println("Hasil dari remove(0) = " + nama);

        nama.remove(2);
        System.out.println("Hasil dari remove(2) = " + nama);
        
        nama.remove(3);
        System.out.println("Hasil dari remove(3) = " + nama);

    }
    
}