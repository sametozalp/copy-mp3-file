import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<>();
    
    public static void main(String[] args) {
        dosyaOku();
        kopyala("pinhaniKopya.mp3");
        
    }
    
        public static void dosyaOku() {
            try {
    
                FileInputStream in = new FileInputStream("pinhani.mp3");
                int oku;
                while ((oku = in.read()) != -1) {
                    icerik.add(oku);
                }
    
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
    
        }

        public static void kopyala(String dosyaIsmi) {
            try {
                FileOutputStream out = new FileOutputStream(dosyaIsmi);
                for(int deger: icerik) {
                    out.write(deger);
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
}