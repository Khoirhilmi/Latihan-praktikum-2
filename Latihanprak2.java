import java.util.Scanner;

public class Latihanprak2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            
            System.out.print("Masukkan Usia: ");
            int usia = scanner.nextInt();
            
            System.out.print("Masukkan Tinggi Badan (cm): ");
            double tinggiBadan = scanner.nextDouble();
            
            System.out.println("\n--- Informasi Pengguna ---");
            System.out.println("Nama         : " + nama);
            System.out.println("NIM          : " + nim);
            System.out.println("Usia         : " + usia + " tahun");
            System.out.println("Tinggi Badan : " + tinggiBadan + " cm");
            
            //1.aritmatika
            int hasilAritmatika = (usia * 2) + 10 / 5 - 3;
            System.out.println("\nHasil dari (usia * 2) + 10 / 5 - 3 adalah: " + hasilAritmatika);
            
            //2.perbandingan
            boolean lebihDari18 = usia > 18;
            System.out.println("Usia lebih dari 18 tahun: " + lebihDari18);
            
            //3.operator logika
            boolean syaratTinggiDanUsia = (usia > 18) && (tinggiBadan > 160);
            System.out.println("Usia lebih dari 18 dan tinggi badan lebih dari 160 cm: " + syaratTinggiDanUsia);
            
            //4.konversi tipe data
            double usiaDouble = (double) usia;
            int tinggiInt = (int) tinggiBadan;
            System.out.println("\nUsia dalam tipe double: " + usiaDouble);
            System.out.println("Tinggi badan dalam tipe int: " + tinggiInt);
            
            scanner.close();
        }
    }