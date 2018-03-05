import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Screen s = new Screen();
        s.config_test();
        s.build_screen();
        s.splash_screen();
        System.out.println("");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BkGenerator bk = new BkGenerator();
        bk.generator();
    }
}
