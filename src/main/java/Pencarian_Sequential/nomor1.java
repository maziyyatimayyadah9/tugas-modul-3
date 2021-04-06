package Pencarian_Sequential;
import java.util.Scanner;

public class nomor1 {
    public static void main (String[] args){
    System.out.println(" ALGORITMA PENCARIAN SEQUENTIAL " +"\n" );
        String data[] = {"Galileo", "Archimedes", "Mayyadah", "Tesla", "Aljabar", "Alkhawarizmi"};
        String dataA;
       
        System.out.print(" Masukkan data yang dicari ");
        Scanner scan = new Scanner (System.in);
        dataA = scan.nextLine();
        
        System.out.println();
        System.out.print(" isi data adalah ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        for (int i=0; i<data.length; i++){
            if (dataA.equalsIgnoreCase(data[i])){
                System.out.print(" Data "+dataA+" berada pada indeks ke - " + i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("Maziyyati Mayyadah");
        System.out.println("2D TEKNIK INFORMATIKA");
    }
}