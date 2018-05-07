import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

class EjSwing extends JFrame {
    DefaultTreeModel modelo;
    JTree arbol = new JTree();
    JButton btn = new JButton("Insertar");
    JButton btnsel = new JButton("Seleccionado");
    JButton btneli = new JButton("Eliminar");
    JButton btnmod = new JButton("Modificar");
    JLabel lbl = new JLabel();
    JTextField txt = new JTextField();
    Container cont;
    JScrollPane scroll;
    DefaultMutableTreeNode raiz;
    DefaultMutableTreeNode nnodo;
    DefaultMutableTreeNode equipo;
    DefaultMutableTreeNode jugador;

    public EjSwing() {
        cont = getContentPane();
        raiz = new DefaultMutableTreeNode("Clientes");
        modelo = new DefaultTreeModel(raiz);
        crearNodos();
        arbol.setModel(modelo);
        arbol.setBounds(10,20,150,200);
        scroll = new JScrollPane(arbol);
        lbl.setBounds(10,230,100,30);
        btn.setBounds(180,20,100,30);
        txt.setBounds(180,70,100,30);
        btnsel.setBounds(180,110,120,30);
        btneli.setBounds(180,140,120,30);
        btnmod.setBounds(180,180,120,30);
        // cont.add(arbol)
        scroll.setBounds(10,20,150,200);
        cont.add(scroll);
        cont.add(btn);
        cont.add(txt);
        cont.add(lbl);
        cont.add(btnsel);
        cont.add(btneli);
        cont.add(btnmod);
        cont.setLayout(new BorderLayout());

        arbol.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {

            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nnodo = new DefaultMutableTreeNode(txt.getText());
                raiz.add(nnodo);
                modelo.reload();
            }
        });
        btneli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indice = 0;
                DefaultMutableTreeNode nodo;
                DefaultMutableTreeNode padre;
                nodo = (DefaultMutableTreeNode) (arbol.getSelectionPath().getLastPathComponent());
                padre = (DefaultMutableTreeNode) nodo.getParent();
                // padre.remove(nodo);
                nodo.removeFromParent();
                // padre.setUserObject((Object)(txt.getText()));
                modelo.reload();
            }
        });

        btnmod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode nodo;
                nodo = (DefaultMutableTreeNode) (arbol.getSelectionPath().getLastPathComponent());
                nodo.setUserObject((Object)(txt.getText()));
                modelo.reload();
            }
        });
        btnsel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setText("NODO..." +arbol.getSelectionPath().getLastPathComponent());
            }
        });
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        EjSwing f = new EjSwing();
    }

    public void crearNodos() {
        equipo = new DefaultMutableTreeNode("Madrid");
        raiz.add(equipo);

        jugador = new DefaultMutableTreeNode("Pepe");
        equipo.add(jugador);

        jugador = new DefaultMutableTreeNode("Yumio");
        equipo.add(jugador);

        jugador = new DefaultMutableTreeNode("Tiner s.l.");
        equipo.add(jugador);


        equipo = new DefaultMutableTreeNode("Sevilla");
        raiz.add(equipo);

        jugador = new DefaultMutableTreeNode("FGT s.a.");
        equipo.add(jugador);

        jugador = new DefaultMutableTreeNode("Polos s.l.");
        equipo.add(jugador);

        jugador = new DefaultMutableTreeNode("Yahiza");
        equipo.add(jugador);
    }
}
