package Instrumen;
/**
 * Abstract class sebagai rancangn untuk setiap observer
 * 
 * @author Muhammad Irfan
 * @version 09-12-2021
 */
public abstract class Observer {
    protected Investor investor;

    /**
     * Method abstract untuk update()
     */
    public abstract void update();
}