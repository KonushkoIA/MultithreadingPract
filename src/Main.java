public class Main {
    public static void main(String[] args) {
        Massiv massiv = new Massiv();
        Initialization initialization = new Initialization();
        MyFirstThread myFirstThread = new MyFirstThread(initialization, massiv, 10);
        MyFirstThread myFirstThread1 = new MyFirstThread(initialization, massiv, 2000);
        Thread thread = new Thread(myFirstThread);
        Thread thread1 = new Thread(myFirstThread1);
        thread.start();
        thread1.start();
    }
}
