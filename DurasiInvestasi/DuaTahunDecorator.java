package DurasiInvestasi;

/**
 * Class ini merupakan class implementasi dari abstract class
 * TahunDecorator. Fungsi class ini sebagai decorator durasi investasi
 * 2 tahun
 * @author Muhammad Irfan
 * @version 09-12-2021
 */
public class DuaTahunDecorator extends TahunDecorator{
    /**
     * Method ini merupakan constructor. Berfungsi mengisi
     * atribut tahun pada parent classnya.
     * @param tahun input tahun
     */
    public DuaTahunDecorator(Tahun tahun) {
        super(tahun);
    }

    /**
     * Method ini akan mengoverride method setTahun pada
     * parent abstract class. Berfungsi memanggil method setTahun()
     * dan setDuaTahun()
     */
    @Override
    public void setTahun() {
        setDuaTahun(tahun);
    }

    /**
     * Metod ini akan mencetak durasi waktu 2 tahun
     * @param tahun input tahun
     */
    private void setDuaTahun(Tahun tahun) {
        super.setTahun();
        System.out.print("2 Tahun\n");
    }
}
