package DurasiInvestasi;
/**
 * Abstract class sebagai rancangan untuk decorator 1 & 2 tahun
 * @author Muhammad Irfan
 * @version 09-12-2021
 */
public abstract class TahunDecorator implements Tahun{
    protected Tahun tahun;

    /**
     * Constructor untuk mengisi value ke atribut tahun
     * @param tahun input tahun
     */
    public TahunDecorator(Tahun tahun) {
        this.tahun = tahun;
    }

    /**
     * Method untuk set tahun, akan di override
     */
    public void setTahun(){
        tahun.setTahun();
    }
}
