//class hewan
class Hewan {

    //atribut
    String Nama;
    String Jenis;
    String Suara;
    String Kulit;

    //method menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Suara: " + Suara);
        System.out.println("Kulit: " + Kulit);
        System.out.println(); // baris kosong untuk pemisah
    }
}

//kelas main
public class Main {
    public static void main(String[] args) {

        //membuat objek hewan1
        Hewan hewan1 = new Hewan();
        hewan1.Nama = "Harimau";
        hewan1.Jenis = "Mamalia";
        hewan1.Suara = "RAWRRRR";
        hewan1.Kulit = "loreng hitam oren";

        //membuat objek hewan2
        Hewan hewan2 = new Hewan();
        hewan2.Nama = "Sapi";
        hewan2.Jenis = "Mamalia";
        hewan2.Suara = "MOOOOOOO";
        hewan2.Kulit = "hitam putih";

        //Menampilkan informasi hewan 1 dan hewan 2
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}