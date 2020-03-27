import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {


    Display display;
    CA ca;


    public Frame(CA ca, int w, int steps){


        super("Simple CA");
        int width = w * 10;
        int height = steps*10;

        this.setSize(width, height);

        this.setLocation(0, 0);

        this.setResizable(true);

        this.ca = ca;

        this.setDefaultCloseOperation(2);

        init(width);
    }



    public void init(int width){
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(1,1,0,0));

        display = new Display(ca);
        display.setPreferredSize(new Dimension(width, 1500));
        add(display);
        setVisible(true);
    }

}
