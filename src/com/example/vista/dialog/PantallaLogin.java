package com.example.vista.dialog;

import javax.swing.*;

/**
 * LOGIN VISTA
 * Esta clase declara los componentes y las
 * configuraciones del dialog
 * @author Tito Muñoz
 * @version 1
 */
public class PantallaLogin extends JDialog {
    //Declaracion de componentes
    private JPanel contentPane;
    private JButton btnHome;
    private JPanel loginPane;
    private JTextField email;
    private JPasswordField contraseña;
    private JButton btnInciarSesion;
    private JButton btnRegistrar;
    private JLabel labelEmail;
    private JLabel labelContraseña;
    private JPanel navegacionPane;

    /**
     * CONSTRUCTOR
     */
    public PantallaLogin() {
        //configuracion del dialog
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnHome);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\LifeStyleSwing\\src\\com\\example\\images\\icons8-heart-with-pulse-20.png");
        setIconImage(img.getImage());
        setTitle("Login");
        setSize(350,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE );


    }

    //GETTERS
    public JButton getBtnHome() {
        return btnHome;
    }
}
