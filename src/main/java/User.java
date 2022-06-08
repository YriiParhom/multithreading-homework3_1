public class User implements Runnable {

    private final int NUM_OF_SWITCHES = 5;
    private final int WAIT = 5000;

    @Override
    public void run() {
        for (int i = 0; i < NUM_OF_SWITCHES; i++) {
            try {
                if (!Main.toggle) {
                    Main.toggle = true;
                    System.out.println("Пользователь включил тумблер");
                    Thread.sleep(WAIT);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}
