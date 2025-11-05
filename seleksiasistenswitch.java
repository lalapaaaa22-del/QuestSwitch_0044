import java.util.Scanner;

public class seleksiasistenswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] mk = {
            "Struktur Data",
            "Pemrograman Berorientasi Objek",
            "Basis Data",
            "Algoritma dan Pemrograman",
            "Rekayasa Perangkat Lunak"
};
        double[] nilai = new double[mk.length];
        double total = 0;

        System.out.println("=== PROGRAM SELEKSI ASISTEN DOSEN (SWITCH CASE) ===");

        // Input nilai
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai " + mk[i] + ": ");
            nilai[i] = in.nextDouble();
            total += nilai[i];
        }

        double rata = total / mk.length;

        // Ubah rata-rata jadi kategori puluhan
        int kategori = (int) rata / 10;
        String predikat;

        // Gunakan switch case
        switch (kategori) {
            case 10:
            case 9:
                predikat = "A";
                break;
            case 8:
                if (rata >= 85) {
                    predikat = "AB";
                } else {
                    predikat = "B";
                }
                break;
                case 7:
                    predikat = "B";
                    break;
                case 6:
                    predikat = "BC";
                    break;
                default:
                      predikat = "C";
        }

        String hasilRata = String.format("%.2f", rata);
        System.out.println();
        System.out.println("Rata-rata: " + hasilRata + " | Predikat: " + predikat);

        // Seleksi lanjut
        if (predikat.equals("A") || predikat.equals("AB")) {
            System.out.println("\nAnda memenuhi syarat untuk melanjutkan seleksi Asisten Dosen.");
            System.out.println("Pilih mata kuliah berikut:");
            for (int i = 0; i < mk.length; i++) {
                System.out.println((i + 1) + ". " + mk[i]);
            }

            System.out.print("Masukkan pilihan (1-5): ");
            int p = in.nextInt();

            if (p < 1 || p > 5) {
                System.out.println("Pilihan tidak valid!");
            } else if (nilai[p - 1] >= 75) {
            System.out.println("Selamat, Anda memenuhi syarat menjadi Asisten Dosen untuk mata kuliah " + mk[p - 1]);
            } else {
                System.out.println("Maaf, nilai Anda belum memenuhi syarat untuk mata kuliah " + mk[p - 1]);
            }
        } else {
            System.out.println("\nMaaf, Anda belum memenuhi syarat menjadi Asisten Dosen.");
        }

     }
}


