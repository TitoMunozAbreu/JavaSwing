package com.example.vista.frame;

import javax.swing.*;

public class PantallaPrincipal extends JFrame{

    private JPanel contentPane;
    private JPanel navegacionPane;
    private JButton btnContacto;
    private JButton btnDatos;
    private JButton btnMenus;
    private JButton btnLogin;


    /**
     * CONSTRUCTOR
     */
    public PantallaPrincipal(){
        //configuracion del Jframe
        setContentPane(contentPane);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\LifeStyleSwing\\src\\com\\example\\images\\icons8-heart-with-pulse-20.png");
        this.setIconImage(img.getImage());
        setTitle("Papaya Life style");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650,550);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    //Getters de los botones

    public JButton getBtnContacto() {
        return btnContacto;
    }

    public JButton getBtnDatos() {
        return btnDatos;
    }

    public JButton getBtnMenus() {
        return btnMenus;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }
}
