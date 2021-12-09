package DurasiInvestasi;
public class DuaTahunDecorator extends TahunDecorator{
    public DuaTahunDecorator(Tahun tahun) {
        super(tahun);
    }

    @Override
    public void setTahun() {
        tahun.setTahun();
        setDuaTahun(tahun);
    }

    private void setDuaTahun(Tahun tahun) {
        System.out.println("\tDurasi Waktu Investasi : 2 Tahun");
    }
}
