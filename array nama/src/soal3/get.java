package soal3;

import java.util.ArrayList;
public class get {
    public static void main(String[] args) {
        
        //nomor 3
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini
        //get(0), get(2), get(6), get(-3)
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("M");
        nama.add("I");
        nama.add("N");

        System.out.println("Hasil dari get(0) = " + nama.get(0));
        System.out.println("Hasil dari get(2) = " + nama.get(2));
        System.out.println("Hasil dari get(6) = " + nama.get(6));
        System.out.println("Hasil dari get(-3) =" + nama.get(-3));
    }   
}
