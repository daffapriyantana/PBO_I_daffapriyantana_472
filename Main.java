import java.util.Scanner;
import  java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        // Membuat Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan data
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L) : ");
        char jenisKelaminInput = scanner.next().charAt(0);

        System.out.print(" Masukkan tahun lahir : ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menyesuaikan dengan tahun sekarang
        int tahunSekarang = LocalDate.now().getYear();

        // Menghitung umur
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelamin;
        if (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput == 'p' || jenisKelaminInput == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak valid ";
        }

        // Menampilkan output
        System.out.println("\nData Diri :");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Umur : " + umur + "tahun");
    }
}