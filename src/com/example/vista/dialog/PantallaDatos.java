package com.example.vista.dialog;

import javax.swing.*;

/**
 * LOGIN DATOS
 * Esta clase declara los componentes y las
 * configuraciones del dialog
 * @author Tito Muñoz
 * @version 1
 */
public class PantallaDatos extends JDialog {
    //Declaracion de componentes
    private JPanel contentPane;
    private JButton btnHome;
    public JTable tableClientes;
    private JTextField papayaTextField;
    private JTextField sevillaTextField;
    private JTextField movilTextField;
    private JScrollPane TablePane;
    private JPanel DatosPane;
    private JPanel navegacionPane;


    /**
     * CONSTRUCTOR
     */
    public PantallaDatos() {
        //configuracion del dialog
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnHome);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\LifeStyleSwing\\src\\com\\example\\images\\icons8-heart-with-pulse-20.png");
        setIconImage(img.getImage());
        setTitle("Datos");
        setSize(450,225);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE );

    }

    public JButton getBtnHome() {
        return btnHome;
    }
}
