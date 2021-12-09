package Instrumen;
public class Kripto extends Observer {
    int durasi;

    public Kripto(Investor investor, int durasi){
        this.investor = investor;
        this.durasi = durasi;
        this.investor.attach(this);
    }

    @Override
    public void update() {
        System.out.println(">> KRIPTO");
        System.out.printf("\tDana sebesar Rp %.2f telah diinvestasikan ke Kripto\n", investor.getState());
        investor.waktuInvestasi(durasi);
    }
}
