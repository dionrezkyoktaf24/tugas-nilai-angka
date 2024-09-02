//Driver Class
import java.util.Scanner;

public class tesiswaa {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();


        siswaa zidane = new siswaa(id, nama, ipk);
        //Nilai diatas 75 LuLus
        if (zidane.getIpk() >= 75) {
            System.out.println(zidane.getNama()+ " Kamu Dinyatakan LuLus");
        }else {
            System.out.println(zidane.getNama()+ " Kamu Dinyatakan Tidak LuLus");
        }
        //Nilai Huruf
        if (zidane.getIpk() < 60){
            System.out.println("Nilai Kamu E");
        }else if (zidane.getIpk() > 60 && zidane.getIpk()<= 70) {
            System.out.println("Nilai Kamu D");
        }else if (zidane.getIpk() > 71 && zidane.getIpk()<= 80) {
            System.out.println("Nilai Kamu C");
        }else if (zidane.getIpk() > 81 && zidane.getIpk()<= 90) {
            System.out.println("Nilai Kamu B");
        }else if (zidane.getIpk() > 91 && zidane.getIpk()<= 100) {
            System.out.println("Nilai Kamu A");
        
        in.close();
        }
    }
}