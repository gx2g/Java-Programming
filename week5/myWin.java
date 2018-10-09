import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class myWin extends JFrame
{
    private Container c;
    private JTextField t1;
    private JButton b1;

    public myWin() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.BLACK);
        t1 = new JTextField(20);
        c.add(t1);
        b1 = new JButton("Press Me");
        c.add(b1);
    }

    public static void main(String [] args)
    {
        myWin win1 = new myWin();
        win1.setSize(600, 500);
        win1.setVisible(true);

    }


}