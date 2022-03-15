import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        double nasi_goreng_special = 9999.99;
        double ayam_bakar_special = 12345.67;
        double steak_sirloin_special = 21108.40;
        double kwetiaw_siram_special = 13579.13;
        double kambing_guling_special = 98765.43;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int pesanan_nasi_goreng = 0;
        int pesanan_ayam_bakar_special = 0;
        int pesanan_steak_sirloin_special = 0;
        int pesanan_kwetiaw_siram_special = 0;
        int pesanan_kambing_guling_special = 0;

        System.out.println("Selamat Siang ....");
        System.out.print("Pesan Untuk Berapa Orang? : ");
        int pemesan = Integer.parseInt(input.readLine());
        System.out.print("Pesanan Atas nama : ");
        String nama_pemesan = input.readLine();
        System.out.println("Menu Special Hari Ini \n =========================");
        System.out.println("1. Nasi Goreng Special      @ Rp. " + nasi_goreng_special);
        System.out.println("2. Ayam Bakar Special      @ Rp. " + ayam_bakar_special);
        System.out.println("3. Steak Sirloin Special      @ Rp. " + steak_sirloin_special);
        System.out.println("4. Kwetiaw Siram Special      @ Rp. " + kwetiaw_siram_special);
        System.out.println("5. Kambing Guling Special      @ Rp. " + kambing_guling_special);


        System.out.println("Nasi Goreng Special");
        pesanan_nasi_goreng = Integer.parseInt(input.readLine());
        loops(pesanan_nasi_goreng, "Nasi Goreng Special");

        System.out.println("Ayam Bakar Special");
        pesanan_ayam_bakar_special = Integer.parseInt(input.readLine());
        loops(pesanan_ayam_bakar_special, "Ayam Bakar Special");


        System.out.println("Steak Sirloin Special");
        pesanan_steak_sirloin_special = Integer.parseInt(input.readLine());
        loops(pesanan_steak_sirloin_special, "Steak Sirloin Special");

        System.out.println("Kwetiaw Siram Special");
        pesanan_kwetiaw_siram_special = Integer.parseInt(input.readLine());
        loops(pesanan_kwetiaw_siram_special, "Kwetiaw Siram Special");

        System.out.println("Kambing Guling Special");
        pesanan_kambing_guling_special = Integer.parseInt(input.readLine());
        loops(pesanan_kambing_guling_special, "Kambing Guling Special");

        double total_harga_nasi = calculateOrder(nasi_goreng_special, pesanan_nasi_goreng);
        double total_pesanan_ayam_bakar_special = calculateOrder(ayam_bakar_special, pesanan_ayam_bakar_special);
        double total_pesanan_steak_sirloin_special = calculateOrder(steak_sirloin_special, pesanan_steak_sirloin_special);
        double total_pesanan_kwetiaw_siram_special = calculateOrder(kwetiaw_siram_special, pesanan_kwetiaw_siram_special);
        double total_pesanan_kambing_guling_special =calculateOrder( kambing_guling_special, pesanan_kambing_guling_special);
        double total_harga = total_harga_nasi + total_pesanan_ayam_bakar_special + total_pesanan_steak_sirloin_special + total_pesanan_kwetiaw_siram_special + total_pesanan_kambing_guling_special;
        System.out.println("1. Nasi Goreng Special  " + pesanan_nasi_goreng + " porsi * " + "Rp. " + nasi_goreng_special + " = Rp. " + df(total_harga_nasi));
        System.out.println("2. Ayam Bakar Special  " + pesanan_ayam_bakar_special + " porsi * " + "Rp. " + ayam_bakar_special + " = Rp. " + df(total_pesanan_ayam_bakar_special));
        System.out.println("3. Steam Sirloin Special   " + pesanan_steak_sirloin_special + " porsi * " + "Rp. " + steak_sirloin_special + " = Rp. " + df(total_pesanan_steak_sirloin_special));
        System.out.println("4. Kwetiaw Siram Special  " + pesanan_kwetiaw_siram_special + " porsi * " + "Rp. " + kwetiaw_siram_special + " = Rp. " + df(total_pesanan_kwetiaw_siram_special));
        System.out.println("5. Kambing Guling Special  " + pesanan_kambing_guling_special + " porsi * " + "Rp. " + kambing_guling_special + " = Rp. " + df(total_pesanan_kambing_guling_special));
        System.out.println("Total Pembelian              = " + total_harga);

        System.out.println("==================================================================================");
        System.out.println("Total Pembelian              = " + total_harga);
        System.out.println("Disc. 10% ( Masa Promosi ) = " + calcuateDiscount(total_harga, 10) + " -");
        System.out.println("==================================================================================");
        double total_harg_after_disc = total_harga - calcuateDiscount(total_harga, 10);
        System.out.println("Total Pembelian setelah disc 10%                             = Rp. " + df(total_harg_after_disc));
        System.out.println("Pembelian per orang <untuk 8 orang>        = Rp. " + df(total_harg_after_disc / pemesan));
        System.out.println("Terima kasih atas kunjungan anda..........");
        System.out.println("............. Tekan enter untuk keluar............. ");
        input.readLine();

    }

    public static boolean loops(int pesanan, String menu) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (pesanan > 10 || pesanan < 0) {
            System.out.println("pesanan " + menu + " tidak valid, input kembali");
            pesanan = Integer.parseInt(input.readLine());
        }
        return true;
    }

    public static String df(double harga) {
        DecimalFormat df = new DecimalFormat("##.##");
        String ss = df.format(harga);
        return ss;
    }

    static double calcuateDiscount(double markedprice, double s) {
        double amount = (s * markedprice) / 100;
        return amount;
    }

    static double calculateOrder(double pesanan, double harga) {
        double amount = pesanan * harga;
        return amount;
    }


}
