package Instrumen;
public class Saham extends Observer{
    int durasi;

    public Saham(Investor investor, int durasi){
        this.investor = investor;
        this.durasi = durasi;
        this.investor.attach(this);
    }

    @Override
    public void update() {
        System.out.println(">> SAHAM");
        System.out.printf("\tDana sebesar Rp %.2f telah diinvestasikan ke Saham\n", investor.getState());
        investor.waktuInvestasi(durasi);
    }
}
