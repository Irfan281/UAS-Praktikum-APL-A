package Instrumen;
public class Reksadana extends Observer{
    int durasi;

    public Reksadana(Investor investor, int durasi){
        this.investor = investor;
        this.durasi = durasi;
        this.investor.attach(this);
    }

    @Override
    public void update() {
        System.out.println(">> REKSADANA");
        System.out.printf("\tDana sebesar Rp %.2f telah diinvestasikan ke Reksadana\n", investor.getState());
        investor.waktuInvestasi(durasi);
    }
}
