/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idoatalakito;

/**
 *
 * @author Husika
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ido extends JFrame implements ActionListener {
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;
    JLabel lb6;
    JLabel lb7;
    JLabel lb8;
    JLabel lb9;
    JLabel lb10;
    JLabel lb11;
    JLabel lb12;

    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;
    JTextField tf12;

    JButton bt;

    JPanel pl1;
    JPanel pl2;
    JPanel pl3;
    JPanel pl4;

    public Ido() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");

        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tf3 = new JTextField(5);
        tf4 = new JTextField(5);
        tf5 = new JTextField(5);
        tf6 = new JTextField(5);
        tf7 = new JTextField(5);
        tf8 = new JTextField(5);
        tf9 = new JTextField(5);
        tf10 = new JTextField(5);
        tf11 = new JTextField(5);
        tf12 = new JTextField(5);

        bt = new JButton("Számol");

        pl1 = new JPanel();
        pl2 = new JPanel();
        pl3 = new JPanel();
        pl4 = new JPanel();

        GridLayout grl = new GridLayout(4, 1);
        setLayout(grl);

        FlowLayout fl = new FlowLayout();

        GridLayout gr = new GridLayout(1, 1);

        pl1.setLayout(fl);
        pl2.setLayout(fl);
        pl3.setLayout(gr);
        pl4.setLayout(fl);

        bt.addActionListener(this);

        pl1.add(tf1);
        pl1.add(lb1);
        pl1.add(tf2);
        pl1.add(lb2);
        pl1.add(tf3);
        pl1.add(lb3);
        pl1.add(tf4);
        pl1.add(lb4);

        pl2.add(tf5);
        pl2.add(lb5);
        pl2.add(tf6);
        pl2.add(lb6);
        pl2.add(tf7);
        pl2.add(lb7);
        pl2.add(tf8);
        pl2.add(lb8);

        pl3.add(bt);

        pl4.add(tf9);
        pl4.add(lb9);
        pl4.add(tf10);
        pl4.add(lb10);
        pl4.add(tf11);
        pl4.add(lb11);
        pl4.add(tf12);
        pl4.add(lb12);

        this.add(pl1);
        this.add(pl2);
        this.add(pl3);
        this.add(pl4);

        pack();

    }

    public static void main(String[] args) {
        Ido i = new Ido();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int seconds = Integer.parseInt(tf4.getText()) + Integer.parseInt(tf8.getText());
            int minutes = Integer.parseInt(tf3.getText()) + Integer.parseInt(tf7.getText());
            int hours = Integer.parseInt(tf2.getText()) + Integer.parseInt(tf6.getText());
            int days = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf5.getText());

            if (seconds > 59) {
                seconds -= 60;
                minutes++;
            }

            if (minutes > 59) {
                minutes -= 60;
                hours++;
            }

            if (hours > 23) {
                hours -= 24;
                days++;
            }

            tf9.setText(String.valueOf(days));
            tf10.setText(String.valueOf(hours));
            tf11.setText(String.valueOf(minutes));
            tf12.setText(String.valueOf(seconds));
        } catch (Exception ex) {}
    }
}
