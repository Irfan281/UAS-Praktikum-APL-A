package DurasiInvestasi;
public abstract class TahunDecorator extends Tahun{
    protected Tahun tahun;

    public TahunDecorator(Tahun tahun) {
        this.tahun = tahun;
    }

    public void setTahun(){
        tahun.setTahun();
    }
}
