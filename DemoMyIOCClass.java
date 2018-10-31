import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;


public class DemoMyIO
{

    public static void main(String[] args)
    {
// note: commented code is whithout use
// of MyIO class
// MyIO : offers static method that it catch
// bad input and display method
// you can expand MyIO and add more usefull
// API

/*****************************
 String strNum = JOptionPane.showInputDialog("Enter an Integer");
 int n1 = Integer.parseInt(strNum);

 strNum = JOptionPane.showInputDialog("Enter an Integer");
 int n2 = Integer.parseInt(strNum);

 int sum = n1+n2;

 *********************************/

        int n1 = MyIO.getInt("Enter an Integer");
        int n2 = MyIO.getInt("Enter an Integer");
        int sum = n1 + n2;
        MyIO.display("Total is "+(n1+n2));





    }



}

class MyIO
{
    private MyIO()
    {

    }

    public static int getInt(String s)
    {
        String strNum = null;
        int n=0;
        boolean okay = false;

        while(! okay)
        {
            try{
                strNum = JOptionPane.showInputDialog("Enter an Integer");
                n = Integer.parseInt(strNum);
                okay = true;
            }catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,strNum + " is not integer try again");

            }

        }
        return n;

    }



    public static void display(String s)
    {
        JTextArea jt = new JTextArea(15,20);
        jt.setBackground(Color.YELLOW);
        jt.setForeground(Color.BLUE);
        Font f = new Font("times new roman",Font.BOLD+Font.ITALIC,30);
        jt.setFont(f);

        jt.setText(s);
        JScrollPane sr = new JScrollPane(jt);
        JOptionPane.showMessageDialog(null,sr) ;





    }

}