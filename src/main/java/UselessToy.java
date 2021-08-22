/**
 * Created by Igor Khristiuk
 * Date: 22.08.2021
 * Time: 8:40
 */
public class UselessToy {
    private final int SLEEP_TIME = 3000;
    private final int countSteps = 6;
    private volatile boolean switcher = false;

    public void switchOn() {
        for (int i = 0; i < countSteps; i++) {
            if (!switcher) {
                switcher = true;
                System.out.println("Переключатель в режиме \"Включен\"");
            }
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void switchOff() {
        while (!Thread.currentThread().isInterrupted()) {
            if (switcher) {
                switcher = false;
                System.out.println("Переключатель в режиме \"Выключен\"");
            }
        }
    }
}
