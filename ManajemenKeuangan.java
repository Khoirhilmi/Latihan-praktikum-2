import java.util.Scanner;

public class ManajemenKeuangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan jumlah uang yang dimiliki: ");
        double uang = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Masukkan rata-rata pengeluaran harian: ");
        double pengeluaranHarian = scanner.nextDouble();
        scanner.nextLine();


        double pengeluaranBulanan = pengeluaranHarian * 30;
        double sisaUang = uang - pengeluaranBulanan;
        double bulanBertahan = uang / pengeluaranBulanan;
        String statusKeuangan;

        if (bulanBertahan < 1) {
            statusKeuangan = "PERINGATAN: Keuangan Anda kurang stabil!";
        } else if (bulanBertahan > 6) {
            statusKeuangan = "Keuangan Anda dalam kondisi aman.";
        } else {
            statusKeuangan = "Keuangan Anda cukup stabil.";
        }

        //operator Perbandingan & Logika
        boolean lebihDari30 = usia > 30;
        boolean lebihDari30DanUangBanyak = usia > 30 && uang > 10_000_000;
        boolean kurangDari30AtauUangCukup = usia < 30 || uang > 5_000_000;

        System.out.println("Apakah usia lebih dari 30? " + lebihDari30);
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + lebihDari30DanUangBanyak);
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + kurangDari30AtauUangCukup);

        //input jumlah hutang
        System.out.print("Masukkan jumlah hutang: ");
        double hutang = scanner.nextDouble();
        scanner.nextLine();

        //menggunakan math
        double nilaiAbsolutHutang = Math.abs(hutang);
        double pengeluaranDibulatkan = Math.ceil(pengeluaranHarian);
        int bonusTakTerduga = (int) (Math.random() * (901_000)) + 100_000; // 100.000 - 1.000.000
        double totalSetelahBonus = sisaUang + bonusTakTerduga;

        //rangkuman keuangan
        System.out.println("\n=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Uang yang dimiliki: Rp" + String.format("%,.2f", uang));
        System.out.println("Pengeluaran harian rata-rata: Rp" + String.format("%,.2f", pengeluaranHarian));
        System.out.println("Sisa uang dalam 30 hari: Rp" + String.format("%,.2f", sisaUang));
        System.out.println("Estimasi bulan bertahan: " + String.format("%.1f", bulanBertahan) + " bulan");
        System.out.println("Status Keuangan: " + statusKeuangan);
        System.out.println("Nilai absolut dari hutang: Rp" + String.format("%,.2f", nilaiAbsolutHutang));
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + String.format("%,.2f", pengeluaranDibulatkan));
        System.out.println("Bonus tak terduga: Rp" + String.format("%,d", bonusTakTerduga));
        System.out.println("Total uang setelah pengeluaran dan bonus: Rp" + String.format("%,.2f", totalSetelahBonus));

        scanner.close();
    }
}
