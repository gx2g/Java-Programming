
import java.awt.*;
import javax.swing.*;


class Elac extends Jframe {


public Elac() {

    c = getContainer();
    c.setLayout(new GridLayout());
    JLabel myLab = new JLabel();

    c = getContentPane();
    JLabel myLab = new JLabel();

    Font f = new Font("Times new Roman", font.bold + font.italic);
    myLab.setFont(f);
    myLab.setText("Elac");

    JPanel p1 = new JPanel();
    p1.setBackgroud(Color.YELLOW);
    p1.add(myLab);

    // END OF P1

    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(3,2,5,5));

    p2.add(new JLabel("First Name: "));
    t1 = new JTextField(10);
    p2.add(t1);

    p2.add(new JLabel("Last Name: "));
    t2 = new JTextField(10);
    p2.add(t2);

    p2.add(new JLabel("Enter ID: "));
    t3 = new JTextField(10);
    p2.add(t3);
    p2.setBackground(Color.GREEN);


    JPanel p3 = new JPanel();
    p3.setLayout(new FlowLayout());
    b1 = new JButton("Add");
    b2 = new JButton("Clear");
    b3 = new JButton("Show");
    b4 = new JButton("Save");
    b5 = new JButton("Remove");

    p3.add(b1);
    p3.add(b2);
    p3.add(b3);
    p3.add(b4);
    p3.add(b5);

    c.add(p1);
    c.add(p2);
    c.add(p3);
}


    public static void main(String[] args) {

    Elac win = new Elac();
    win.setSize(400, 300);
    win.setVisible(true);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

