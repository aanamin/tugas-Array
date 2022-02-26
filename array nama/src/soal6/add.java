package soal6;

import java.util.ArrayList;
public class add {
    
    public static void main(String[] args) {
        
        //nomor6
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
        
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("m");
        nama.add("i");
        nama.add("n");

        nama.add(0, "e");
        System.out.println("Hasil dari add(0, e) = "+ nama) ;

        nama.add(2, "f");
        System.out.println("Hasil dari (2, f) = " + nama);

        nama.add(3, "g");
        System.out.println("Hasil dari (3, g) = " + nama);

        nama.add(4, "h");
        System.out.println("Hasil dari (4, h) = " + nama);

        nama.add(6, "h");
        System.out.println("Hasil dari (6,h) = " + nama);

        nama.add(-3,"j");
        System.out.println("Hasil dari (-3,j) = " + nama);
    }
}
