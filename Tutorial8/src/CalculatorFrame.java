import java.awt.*;
import javax.swing.*;
public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3, 5,5));
        p1.setBackground(Color.BLUE);
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(("" + i));
            button.setBackground(Color.RED);
            p1.add(button);
        }
        JButton button1 = new JButton(("" + 0));
        button1.setBackground(Color.RED);
        p1.add(button1);
        JButton button2 = new JButton(("."));
        button2.setBackground(Color.RED);
        p1.add(button2);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        p2.setLayout(new GridLayout(4,1,10,5));
        String[] operators = {"+", "-", "Clear"};
        for (String operator : operators) {
            JButton button = new JButton(operator);
            button.setBackground(Color.GREEN);
            p2.add(button);
        }

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout (1,2));
        p3.add(p1);
        p3.add(p2);
        JTextField text = new JTextField("45.4");
        text.setBackground(Color.YELLOW);
        add(text, BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}