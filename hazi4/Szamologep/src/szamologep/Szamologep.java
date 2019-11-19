package szamologep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.Flow;

public class Szamologep extends JFrame implements ActionListener {
    JTextField tf1;

    JPanel pl1;
    JPanel pl2;
    JPanel pl3;
    JPanel pl4;
    JPanel pl5;
    JPanel pl6;

    JButton blank;
    JButton backspace;
    JButton ce;
    JButton c;
    JButton mc;
    JButton mr;
    JButton ms;
    JButton mplus;
    JButton osztas;
    JButton szorzas;
    JButton minusz;
    JButton sqrt;
    JButton szazalek;
    JButton tort;
    JButton pluszminusz;
    JButton pont;

    JButton eredmeny;
    JButton n0;
    JButton n1;
    JButton n2;
    JButton n3;
    JButton n4;
    JButton n5;
    JButton n6;
    JButton n7;
    JButton n8;
    JButton n9;
    JButton osszead;

    List<Integer> lista = new ArrayList<>();

    public Szamologep() throws HeadlessException {
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf1 = new JTextField();
        eredmeny = new JButton("=");
        osszead = new JButton("+");
        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");

        blank = new JButton("");
        backspace = new JButton("Backspace");
        ce = new JButton("CE");
        c = new JButton("C");
        mc = new JButton("MC");
        mr = new JButton("MR");
        ms = new JButton("MS");
        mplus = new JButton("M+");
        osztas = new JButton("/");
        szorzas = new JButton("*");
        minusz = new JButton("-");
        sqrt = new JButton("sqrt");
        szazalek = new JButton("%");
        tort = new JButton("1/x");
        pluszminusz = new JButton("+/-");
        pont = new JButton(".");

        pl1 = new JPanel();
        pl2 = new JPanel();
        pl3 = new JPanel();
        pl4 = new JPanel();
        pl5 = new JPanel();
        pl6 = new JPanel();

        GridLayout grL = new GridLayout(6, 1);
        setLayout(grL);

        GridLayout gr1 = new GridLayout(1, 1);
        GridLayout gr2 = new GridLayout(1, 4);
        GridLayout gr3 = new GridLayout(1, 6);

        pl1.setLayout(gr1);
        pl2.setLayout(gr2);
        pl3.setLayout(gr3);
        pl4.setLayout(gr3);
        pl5.setLayout(gr3);
        pl6.setLayout(gr3);

        pl1.add(tf1);

        pl2.add(blank);
        pl2.add(backspace);
        pl2.add(ce);
        pl2.add(c);

        pl3.add(mc);
        pl3.add(n7);
        pl3.add(n8);
        pl3.add(n9);
        pl3.add(osztas);
        pl3.add(sqrt);
        pl4.add(mr);
        pl4.add(n4);
        pl4.add(n5);
        pl4.add(n6);
        pl4.add(szorzas);
        pl4.add(szazalek);
        pl5.add(ms);
        pl5.add(n1);
        pl5.add(n2);
        pl5.add(n3);
        pl5.add(minusz);
        pl5.add(tort);
        pl6.add(mplus);
        pl6.add(n0);
        pl6.add(pluszminusz);
        pl6.add(pont);
        pl6.add(osszead);
        pl6.add(eredmeny);

        osszead.addActionListener(this);
        eredmeny.addActionListener(this);
        n0.addActionListener(this);
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);

        this.add(pl1);
        this.add(pl2);
        this.add(pl3);
        this.add(pl4);
        this.add(pl5);
        this.add(pl6);

        pack();

    }

    public static void main(String[] args) {
        Szamologep s = new Szamologep();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int osszeg = 0;

        if (e.getSource() == n0)
            tf1.setText(tf1.getText() + String.valueOf(0));
        if (e.getSource() == n1)
            tf1.setText(tf1.getText() + String.valueOf(1));
        if (e.getSource() == n2)
            tf1.setText(tf1.getText() + String.valueOf(2));
        if (e.getSource() == n3)
            tf1.setText(tf1.getText() + String.valueOf(3));
        if (e.getSource() == n4)
            tf1.setText(tf1.getText() + String.valueOf(4));
        if (e.getSource() == n5)
            tf1.setText(tf1.getText() + String.valueOf(5));
        if (e.getSource() == n6)
            tf1.setText(tf1.getText() + String.valueOf(6));
        if (e.getSource() == n7)
            tf1.setText(tf1.getText() + String.valueOf(7));
        if (e.getSource() == n8)
            tf1.setText(tf1.getText() + String.valueOf(8));
        if (e.getSource() == n9)
            tf1.setText(tf1.getText() + String.valueOf(9));

        if (e.getSource() == osszead) {
            lista.add(Integer.parseInt(tf1.getText()));
            tf1.setText("");
        }

        if (e.getSource() == eredmeny) {

            lista.add(Integer.parseInt(tf1.getText()));
            tf1.setText("");
            for (Integer j : lista) {
                osszeg += j;
            }
            tf1.setText(String.valueOf(osszeg));
        }
    }
}