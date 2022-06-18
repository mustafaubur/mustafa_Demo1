package code.utilities;

public class BrowserUtil {
    public static void wait(int second){
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
