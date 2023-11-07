package bangunruang;
import java.util.Scanner;
public class Kerucut {

    static double luasPermukaan(double r, double s){
        double hasil = ( 3.14 * r *(r + s));
        return hasil;
    }
    static double volume(double r, double t){
        double hasil = (3.14 * r * r * t)/3 ;
        return hasil;
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        double r = input.nextDouble();
        System.out.print("Masukkan Garis Pelukis : ");
        double s = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double t = input.nextDouble();
        
        System.out.println("Luas permukaan kerucut adalah : " + luasPermukaan(r,s));
        System.out.println("Volume kerucut adalah : " + volume(r,t));
    }    
}


