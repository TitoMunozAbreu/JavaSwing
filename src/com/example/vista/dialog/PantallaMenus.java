package com.example.vista.dialog;

import javax.swing.*;

public class PantallaMenus extends JDialog {
    private JPanel contentPane;
    private JButton btnHome;
    private JTable tableMenus;
    private JPanel tablePane;
    private JPanel navegacionPane;
    private JList list1;


    public PantallaMenus() {
        //configuracion del dialog
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnHome);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\LifeStyleSwing\\src\\com\\example\\images\\icons8-heart-with-pulse-20.png");
        setIconImage(img.getImage());
        setTitle("Papaya Life style");
        setSize(550,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE );

    }

    public JTable getTableMenus() {
        return tableMenus;
    }
}
