import java.util.Scanner;

public class NilaiAkhir {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int P = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();

        double NA = 0.25 * P + 0.35 * A + 0.40 * B;
        System.out.println(NA);
        String nilaiHuruf;

        if (NA >=80.01){
            nilaiHuruf = "A.";
        }else if (NA >=70.01){
            nilaiHuruf = "B.";
        }else if (NA >=60.01){
            nilaiHuruf = "D."; 
        }else if (NA <=60){
            nilaiHuruf = "Tidak Lulus";
        }else{
            nilaiHuruf = "";
        }
      
        if (NA >= 60) {
            System.out.println("Lulus Matakuliah Implementasi Algoritma dengan nilai " + nilaiHuruf);
        } else {
            System.out.println("Tidak Lulus Matakuliah Implementasi Algoritma. Silakan mengulang tahun depan.");
        }
    }
        
    }

