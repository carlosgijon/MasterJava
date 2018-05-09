import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

class EjSwing extends JFrame {
    int contador = 0;
    public EjSwing() {
        final Panel p_central = new Panel();
        Panel p_sur = new Panel();
        int i = 0;
        Button btn_agregar = new Button("Agregar");
        Button btn_eliminar = new Button("Eliminar");
        Button btn_eliminar_todos = new Button("Eliminar todos");
        final Button[] botones = new Button[10];

        setLayout(new BorderLayout());

        for(i = 0; i < botones.length; i++){
            botones[i] = new Button("Boton " + (i + 1));
        }

        btn_agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contador < botones.length) {
                    p_central.add(botones[contador++]);
                    validate();
                }
            }
        });

        btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contador > 0) {
                    contador--;
                    p_central.remove(contador);
                    validate();
                }
            }
        });

        btn_eliminar_todos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p_central.removeAll();
                contador = 0;
                validate();
            }
        });

        p_sur.add(btn_agregar);
        p_sur.add(btn_eliminar);
        p_sur.add(btn_eliminar_todos);
        add(p_central,BorderLayout.CENTER);
        add(p_sur,BorderLayout.SOUTH);
        setSize(1000,300);
    }

    public static void main(String[] args) {
        EjSwing f = new EjSwing();
        f.setVisible(true);
    }
}
