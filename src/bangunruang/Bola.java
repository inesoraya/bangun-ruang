package bangunruang;
import java.util.Scanner;
public class Bola {
      
    static double luasPermukaan(double r){
        double hasil =  4 * 3.14 * r * r ;
        return hasil;
    }
    static double volume(double r){
        double hasil = 4 *(3.14 * r * r * r)/3;
        return hasil;
    }
    
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Jari-Jari alas: ");
       double r = input.nextDouble();

       System.out.println("Luas permukaan bola adalah : " + luasPermukaan(r));
       System.out.println("Volume bola adalah : " + volume(r));
    }
}

