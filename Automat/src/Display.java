import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    public CA ca;
    private int in = 10;

    public Display(CA ca){
        this.ca = ca;
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        for(int i = 0; i< ca.getCells().length; i++){
            for(int j = 0; j< ca.getCells()[i].length; ++j){
                if(ca.getCells()[i][j]==0) {
                    g.setColor(Color.BLACK);
                    g.drawRect(j + in * j, i + in * i, in, in);
                }
                else g.fillRect(j+ in *j,i+ in *i, in, in);
                g.setColor(Color.RED);

            }
        }
    }
}
