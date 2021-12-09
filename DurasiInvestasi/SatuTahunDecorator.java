package DurasiInvestasi;
public class SatuTahunDecorator extends TahunDecorator{
    public SatuTahunDecorator(Tahun tahun) {
        super(tahun);
    }

    @Override
    public void setTahun() {
        tahun.setTahun();
        setSatuTahun(tahun);
    }

    private void setSatuTahun(Tahun tahun) {
        System.out.println("\tDurasi Waktu Investasi : 1 Tahun");
    }
}
