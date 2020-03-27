import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Form {
    private JPanel panel;
    private JComboBox ruleComboBox;
    private JTextField widthField;
    private JTextField stepsField;
    private JButton showButton;


    public Form() {
        showButton.addActionListener(e -> {
            int ruleSet, steps, width;

            ruleSet = Integer.parseInt((String) Objects.requireNonNull(ruleComboBox.getSelectedItem()));
            steps = Integer.parseInt(stepsField.getText());
            width = Integer.parseInt(widthField.getText());
            CA ca = new CA(steps, width, ruleSet);
            Frame frame2 = new Frame(ca, width, steps);
            frame2.setBackground(Color.BLACK);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple CA");
        frame.setContentPane(new Form().panel);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }
}
