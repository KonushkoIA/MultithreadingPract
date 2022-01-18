public class Initialization {
    public void initialization(int massiv[], int value) {
        synchronized (massiv) {
            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = value;
                value = value + 10;
            }
            for (int i = 0; i < massiv.length; i++) {
                System.out.println(massiv[i]);
            }
        }
    }
}
