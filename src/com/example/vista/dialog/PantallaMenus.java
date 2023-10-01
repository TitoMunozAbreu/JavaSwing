package com.example.vista.dialog;

import javax.swing.*;

public class PantallaMenus extends JDialog {
    private JPanel contentPane;
    private JButton btnHome;
    private JTable tableMenus;
    private JPanel tablePane;
    private JPanel navegacionPane;


    public PantallaMenus() {
        //configuracion del dialog
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnHome);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\LifeStyleSwing\\src\\com\\example\\images\\icons8-heart-with-pulse-20.png");
        setIconImage(img.getImage());
        setTitle("Menu");
        setSize(550,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE );

    }

    public JTable getTableMenus() {
        return tableMenus;
    }

    public JButton getBtnHome() {
        return btnHome;
    }
}
