public class Main {

    public static volatile boolean toggle = false;

    public static void main(String[] args) {

        Runnable user = new User();
        Runnable box = new Box();
        Thread userThread = new Thread(user);
        Thread boxThread = new Thread(box);
        userThread.start();
        boxThread.start();
        try {
            userThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        boxThread.interrupt();
    }
}
