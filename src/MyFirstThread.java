public class MyFirstThread implements Runnable {
    private Initialization initialization;
    private Massiv massiv;
    private int value;

    public MyFirstThread(Initialization initialization, Massiv massiv, int value) {
        this.initialization = initialization;
        this.massiv = massiv;
        this.value = value;
    }

    public Initialization getInitialization() {
        return initialization;
    }

    public void setInitialization(Initialization initialization) {
        this.initialization = initialization;
    }

    public Massiv getMassiv() {
        return massiv;
    }

    public void setMassiv(Massiv massiv) {
        this.massiv = massiv;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public void run() {
        initialization.initialization(massiv.getMassiv(), value);
    }
}
