import java.awt.FlowLayout;
04
 
05
import javax.swing.*;
06
 
07
public class TestFrameExample {
08
 
09
    public static void main(String s[]) {
10
 
11
        JFrame frame = new JFrame("JFrame Example");
12
 
13
        JPanel panel = new JPanel();
14
        panel.setLayout(new FlowLayout());
15
 
16
        JLabel label = new JLabel("This is a label!");
17
 
18
        JButton button = new JButton();
19
        button.setText("Press me");
20
 
21
        panel.add(label);
22
        panel.add(button);
23
 
24
        frame.add(panel);
25
        frame.setSize(300, 300);
26
        frame.setLocationRelativeTo(null);
27
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
28
        frame.setVisible(true);
29
 
30
    }
31
 
32
}
