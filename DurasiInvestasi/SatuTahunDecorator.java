package DurasiInvestasi;

/**
 * Class ini merupakan class implementasi dari abstract class
 * TahunDecorator. Fungsi class ini sebagai decorator durasi investasi
 * 1 tahun
 * @author Muhammad Irfan
 * @version 09-12-2021
 */
public class SatuTahunDecorator extends TahunDecorator{
    /**
     * Method ini merupakan constructor. Berfungsi mengisi
     * atribut tahun pada parent classnya.
     * @param tahun input tahun
     */
    public SatuTahunDecorator(Tahun tahun) {
        super(tahun);
    }

    /**
     * Method ini akan mengoverride method setTahun pada
     * parent abstract class. Berfungsi memanggil method setTahun()
     * dan setSatuTahun()
     */
    @Override
    public void setTahun() {
        setSatuTahun(tahun);
    }

    /**
     * Metod ini akan mencetak durasi waktu 1 tahun
     * @param tahun input tahun
     */
    private void setSatuTahun(Tahun tahun) {
        super.setTahun();
        System.out.print("1 Tahun\n");
    }
}
