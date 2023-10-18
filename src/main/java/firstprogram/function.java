package firstprogram;
import firstprogram.panggil_fungsi;

public class function {
    public static void main (String[] args){
        int x = 1;
        int y = 2;
        int z = 3;

        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
        panggil_fungsi.citra();
        panggil_fungsi.indra("indra");
        panggil_fungsi.indra("joko");
    }

    public static int tambah (int a, int b){
        int hasiltambah = a+b;
        System.out.println("hasil tambah " + a + " dan " + b + " adalah: " + hasiltambah);
        return hasiltambah;
    }
}
