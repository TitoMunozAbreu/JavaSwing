package com.example.vista.dialog;

import javax.swing.*;
import java.awt.event.*;

public class PantallaContacto extends JDialog {
    private JPanel contentPane;
    private JPanel navegacionPane;
    private JButton btnHome;
    private JList contenido;
    private JPanel contactoPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public PantallaContacto() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnHome);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\LifeStyleSwing\\src\\com\\example\\images\\icons8-heart-with-pulse-20.png");
        setIconImage(img.getImage());
        setTitle("Contacto");
        setSize(400,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE );
    }

    public JButton getBtnHome() {
        return btnHome;
    }

    private void onHome() {
       dispose();
    }

}
