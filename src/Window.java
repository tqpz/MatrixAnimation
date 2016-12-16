import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Mateusz on 15.12.2016.
 */
public class Window extends JFrame {

    private Container container;
    private int SIZE = 700;

    public Window(){
        setTitle("Matrix");
        setSize(SIZE,SIZE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setResizable(false);


        for (int i = 0; i < SIZE; i += 10) {
            new Painter(this, 5 + i).start();
        }
    }

    public int getSIZE() {
        return SIZE;
    }

    public static void main(String[] args){
        Window window = new Window();
    }
}
