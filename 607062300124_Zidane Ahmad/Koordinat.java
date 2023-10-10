import java.util.Scanner;

public class Koordinat {
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    System.out.println("Koordinat titik Pertama (x1,x2)");

    System.out.print("x1 = ");
    int x1 = input.nextInt();
    System.out.print("y1 = ");
    int y1 = input.nextInt();

    System.out.println("Koordinat titik kedua (x2,y2)");     
    System.out.print("x2 = ");    
    int x2 = input.nextInt();
    System.out.print("y2 = ");
    int y2 = input.nextInt();

    int hasilx = 0; int hasily = 0;
    hasilx = x1 - x2;
    hasily = y1 - y2;

    if (hasilx <0);{
        hasilx = hasilx*-1;
    }
    if (hasily <0);{
        hasily = hasily*-1;
    }
    
    int jumlah = hasilx + hasily;
    System.out.println("hasil koordinat = " + jumlah);

    
    }
}
