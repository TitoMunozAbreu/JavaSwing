package com.example.controlador;

import com.example.vista.dialog.PantallaLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * LOGIN CONTROLLER
 * Esta clase muestra la vista del login y contiene
 * su logica
 * @author Tito Muñoz
 * @version 1
 */
public class LoginController implements ActionListener, WindowListener {
    //declaracion de variables
    PantallaLogin pantallaLogin;

    public LoginController(){
        System.out.println("Pantalla login");
        //incializar el objeto
       this.pantallaLogin = new PantallaLogin();
        //activar los listeners de la actual pantalla
        addListenersPantallaLogin();
        this.pantallaLogin.setVisible(true); //este metodo SIEMPRE ir al final.
    }

    /**
     * Metodo para activar el listener de los botones de
     * la pantalla login
     */
    private void addListenersPantallaLogin() {
        this.pantallaLogin.getBtnHome().addActionListener(this);
        this.pantallaLogin.addWindowListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        //almacenar en una variable la accion ejecutada
        String command = e.getActionCommand();
        //Comprobar el tipo de boton seleccionado
        switch (command){
            case "home":
                onHome();
                break;
        }
    }

    /**
     * Metodo para volver a la pantalla principal
     */
    private void onHome() {
        this.pantallaLogin.dispose();
    }

    /**
     * Metodo para cerrar el dialog
     */
    private void onCancel() {
        this.pantallaLogin.dispose();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        onCancel();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
