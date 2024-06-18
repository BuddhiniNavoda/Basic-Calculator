import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Basiccal {
    public static void main(String[] args) {
        calbody cal = new calbody();

        }
    }


class calbody extends JFrame {

    double fn, sn, sum;
    String what;


    calbody() {
        setVisible(true);
        setTitle("MyCal");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // to set to middle of the screen

        BorderLayout bd = new BorderLayout();
        JPanel p1 = new JPanel();
        p1.setBackground(Color.pink);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.green);

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);

        // cal eke udama watena text field eka
        TextField t1 = new TextField(30);
        p1.add(t1);//p1 kiyana panle eke text hadanna

        //to make a button, first need a grid 3*3
        GridLayout g1 = new GridLayout(3, 3);
        p2.setLayout(g1);

        Button b1 = new Button("1");
        p2.add(b1);
        b1.setBackground(Color.magenta);
        b1.setFont(new Font(" ", 0, 25));

        // when we  click the button and also print the value
        // on screen we want add the ActionListener.
        // ActionListner eke Action Lisntner kiyala object ekak hadala eke actionproforme karanna method ekak hadala
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)

                // (t1.setText("1")) mehema dammoth eka button eke value eka withrai type wenne
                String v = t1.getText(); // kalin type wela thibba agayak vta gannawa
                v = v + "1"; // kalin thibba "v" value ekata 1k ekathu karanawa
                t1.setText(v); // aluth v value eka set karanawa
            }
        });

        Button b2 = new Button("2");
        p2.add(b2);
        b2.setBackground(Color.gray);
        b2.setFont(new Font(" ", 0, 25));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "2";
                t1.setText(v);
            }
        });

        Button b3 = new Button("3");
        p2.add(b3);
        b3.setBackground(Color.green);
        b3.setFont(new Font(" ", 0, 25));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "3";
                t1.setText(v);
            }
        });

        Button b4 = new Button("4");
        p2.add(b4);
        b4.setBackground(Color.yellow);
        b4.setFont(new Font(" ", 0, 25));
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "4";
                t1.setText(v);
            }
        });

        Button b5 = new Button("5");
        p2.add(b5);
        b5.setBackground(Color.pink);
        b5.setFont(new Font(" ", 0, 25));
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "5";
                t1.setText(v);
            }
        });

        Button b6 = new Button("6");
        p2.add(b6);
        b6.setBackground(Color.cyan);
        b6.setFont(new Font(" ", 0, 25));
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "6";
                t1.setText(v);
            }
        });

        Button b7 = new Button("7");
        p2.add(b7);
        b7.setBackground(Color.blue);
        b7.setFont(new Font(" ", 0, 25));
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "7";
                t1.setText(v);
            }
        });

        Button b8 = new Button("8");
        p2.add(b8);
        b8.setBackground(Color.lightGray);
        b8.setFont(new Font(" ", 0, 25));
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "8";
                t1.setText(v);
            }
        });

        Button b9 = new Button("9");
        p2.add(b9);
        b9.setBackground(Color.red);
        b9.setFont(new Font(" ", 0, 25));
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "9";
                t1.setText(v);
            }
        });

        Button b0 = new Button("0");
        p2.add(b0);
        b0.setBackground(Color.orange);
        b0.setFont(new Font(" ", 0, 25));
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + "0";
                t1.setText(v);
            }
        });

        Button Dot = new Button(".");
        p2.add(Dot);
        Dot.setBackground(Color.orange);
        Dot.setFont(new Font(" ", 0, 25));
        Dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                String v = t1.getText();
                v = v + ".";
                t1.setText(v);
            }
        });

        Button plus = new Button("+");
        p2.add(plus);
        plus.setFont(new Font(" ", 0, 25));
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fn = Double.parseDouble(t1.getText());
                System.out.println(fn);
                t1.setText(" ");
                what = "+";
            }
        });

        Button min = new Button("-");
        p2.add(min);
        min.setFont(new Font(" ", 0, 25));
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fn = Double.parseDouble(t1.getText());
                System.out.println(fn);
                t1.setText(" ");
                what = "-";
            }
        });

        Button devi = new Button("/");
        p2.add(devi);
        devi.setFont(new Font(" ", 0, 25));
        devi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fn = Double.parseDouble(t1.getText());
                System.out.println(fn);
                t1.setText(" ");
                what = "/";
            }
        });

        Button mul = new Button("*");
        p2.add(mul);
        mul.setFont(new Font(" ", 0, 25));
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fn = Double.parseDouble(t1.getText());
                System.out.println(fn);
                t1.setText(" ");
                what = "*";
            }
        });

        Button Equal = new Button("=");
        p2.add(Equal);
        Equal.setFont(new Font(" ", 0, 25));
        Equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sn = Double.parseDouble(t1.getText());
                sum = cal(fn, sn, what);
                System.out.println(sum);
                t1.setText(String.valueOf(sum));


            }
        });

        Button sqr = new Button("√");
        p2.add(sqr);
        sqr.setFont(new Font(" ", 0, 25));
        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //math.sqtr();
                double sq = Double.valueOf(t1.getText());
                double ans = Math.sqrt(sq);
                System.out.println(ans);
                t1.setText(String.valueOf(ans));
            }
        });

        Button Clear = new Button("C");
        p2.add(Clear);
        Clear.setFont(new Font(" ", 0, 25));
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TextField t1 = new TextField(30);(button ekata dala valu eka print karanna)
                t1.setText(" ");
                fn = 0.0;
                sn= 0.0;
                what = " ";

            }
        });


        MenuBar mb = new MenuBar();
        setMenuBar(mb); // to set a menu bar

        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("view");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        MenuItem m_new = new MenuItem("New File");
        MenuItem m_save = new MenuItem("Save");
        MenuItem m_Exit = new MenuItem("Exit");
        m1.add(m_new);
        m1.add(m_Exit);
        m1.add(m_save);
        /*m_Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane,"Are you want exit?");
            }
        });
        */
         


    }


    public double cal(double a, double b, String w) {
        double total = 0;

        if (w.equals("+")) {
            total = a + b;
        } else if (w.equals("-")) {
            total = a - b;

        } else if (w.equals("*")) {
            total = a * b;
        } else if (w.equals("/")) {
            total = a / b;

        }


        return total;


    }

}