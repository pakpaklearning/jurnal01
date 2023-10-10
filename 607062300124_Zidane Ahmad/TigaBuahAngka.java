import java.util.Scanner;

public class TigaBuahAngka {
    public static void main (String [] args){
    Scanner input=new Scanner(System.in);
    
    System.out.print("Masukan Angka Pertama :");    
    int x = input.nextInt();
    System.out.print("Masukan Angka Kedua :");        
    int y = input.nextInt();
    System.out.print("Masukan Angka Ketiga :");
    int z = input.nextInt();

    if (x < y && x < z) {
        if (y < z)
        System.out.println(" Bilangan Kecil " + x + " Bilangan Tengah " + y + " Bilangan Besar " + z );
        else if (z < y)
        System.out.println("Bilangan Kecil  " + x + " Bilangan Tengah " + z + "Bilangan Besar" + y );
    }

    else if (y < x && y < z) {
        if (x < z)
        System.out.println(" Bilangan Kecil " + y + " Bilangan Tengah " + x + " Bilangan Besar " + z );
        else if (z < x)
        System.out.println(" Bilangan Kecil " + y + " Bilangan Tengah " + z + " Bilangan Besar " + x );
        }

    else if (z < x && z < y) {
        if (x < y)
        System.out.println(" Bilangan Kecil " + z + " Bilangan Tengah " + x + " Bilangan Besar " + y );
        else if (y < x)
        System.out.println(" Bilangan Kecil " + z + " Bilangan Tengah " + y + " Bilangan Besar " + x );
        }

    }
    
}
