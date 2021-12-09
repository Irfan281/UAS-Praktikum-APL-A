package Instrumen;
/**
 * Class ini merupakan observer dan implementasi dari abstract class observer
 * 
 * @author Muhammad Irfan
 * @version 09-12-2021
 */
public class Saham extends Observer{
    int durasi;

    /**
     * Method constructor untuk mengisikan nilai pada atribut investor dan durasi
     * @param investor sebagai objek dari class Investor
     * @param durasi durasi sesuai pilihan user
     */
    public Saham(Investor investor, int durasi){
        this.investor = investor;
        this.durasi = durasi;
        this.investor.attach(this);
    }

    /**
     * Method untuk mencetak pesan saat ada update terbaru, 
     * menggoverride method pada parent classnya
     */
    @Override
    public void update() {
        System.out.println(">> SAHAM");
        System.out.printf("\tDana sebesar Rp %.2f telah diinvestasikan ke Saham\n", investor.getState());
        investor.waktuInvestasi(durasi);
    }
}
