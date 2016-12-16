import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Mateusz on 15.12.2016.
 */
class Painter extends Thread {
    private Window window;
    private int x;
    private int SPEED = 50;

    public Painter(Window win, int x) {
        this.window = win;
        this.x = x;
    }

    public void run() {
        Graphics g = window.getGraphics();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        while (true) {
            int random = (int) (Math.random() * 10000);

            try {
                Thread.sleep(random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < window.getSIZE(); i += 10) {
                g.setColor(Color.GREEN);
                g.drawString(String.valueOf(alphabet[(int) (Math.random() * alphabet.length)]), x, 10 + i);
                try {
                    Thread.sleep(SPEED);
                } catch (InterruptedException e) {
                }
            }

            for (int i = 0; i < window.getSIZE(); i += 10) {
                g.setColor(Color.black);
                g.fillRect(x, 10 + i, 10, 10);
                try {
                    Thread.sleep(SPEED);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}