import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EjSwing extends JFrame {
    Container cont;
    //------------------------------------------------
    public static void main(String[] args) {
        new EjSwing();
    }
    //------------------------------------------------
    public EjSwing() {
        cont = getContentPane();
        JButton boton1 = new JButton("Rojo");
        boton1.setBounds(20,50,100,20);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cont.setBackground(Color.red);
            }
        });
        cont.add(boton1);

        JButton boton2 = new JButton("Verde");
        boton2.setBounds(180,50,100,20);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cont.setBackground(Color.green);
            }
        });
        cont.add(boton2);

        cont.setLayout(new BorderLayout());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                super.windowClosing(we);
                System.exit(0);
            }
        });
        setSize(300,200);
        setLocation(100,100);
        setTitle("Ejemplo de javax.swing.JFrame");
        setResizable(false);
        setVisible(true);
    }
}
