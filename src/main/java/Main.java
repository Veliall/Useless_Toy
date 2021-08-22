/**
 * Created by Igor Khristiuk
 * Date: 22.08.2021
 * Time: 8:40
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        UselessToy toy = new UselessToy();

        Thread user = new Thread(null, toy::switchOn, "Пользователь");
        Thread uselessToy = new Thread(null, toy::switchOff, "Игрушка");

        user.start();
        uselessToy.start();

        user.join();
        uselessToy.interrupt();
    }
}
