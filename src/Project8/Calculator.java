package Project8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    public Calculator(){
        setTitle("calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,300,250,250);

        JTextField text1 = new JTextField();
        add(text1, BorderLayout.NORTH);



        JButton[] jbs = new JButton[12];
        GridLayout layout1 = new GridLayout(4,3);
        JPanel binPanel = new JPanel(layout1);
        add(binPanel, BorderLayout.CENTER);
        jbs[0] = new JButton("0");
        jbs[1] = new JButton("1");
        jbs[2] = new JButton("2");
        jbs[3] = new JButton("3");
        jbs[4] = new JButton("4");
        jbs[5] = new JButton("5");
        jbs[6] = new JButton("6");
        jbs[7] = new JButton("7");
        jbs[8] = new JButton("8");
        jbs[9] = new JButton("9");
        jbs[10] = new JButton("+");
        jbs[11] = new JButton("=");

        for (int i = 0; i < jbs.length; i++) {
            binPanel.add(jbs[i]);
        }

        jbs[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("0");
            }
        });
        jbs[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("1");
            }
        });
        jbs[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("2");
            }
        });
        jbs[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("3");
            }
        });
        jbs[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("4");
            }
        });
        jbs[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("5");
            }
        });
        jbs[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("6");
            }
        });
        jbs[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("7");
            }
        });
        jbs[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("8");
            }
        });
        jbs[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("9");
            }
        });
        jbs[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("+");
            }
        });


        setVisible(true);
    }





}
