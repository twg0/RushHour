package App;

import javax.swing.*;

public class MyApp {
    private JPanel jPanel;

    public static void main(String args[]) {

        JFrame frame = new JFrame("MyApp");
        frame.setContentPane(new MyApp().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
