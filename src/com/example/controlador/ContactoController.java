package com.example.controlador;

import com.example.vista.dialog.PantallaContacto;
import com.example.vista.dialog.PantallaDatos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * CONTACTO CONTROLLER
 * Esta clase muestra la vista de contactos y contiene
 * su logica
 * @author Tito Muñoz
 * @version 1
 */
public class ContactoController implements ActionListener, WindowListener {
    //declaracion de variables
    private PantallaContacto pantallaContacto;

    public ContactoController() {
        System.out.println("Pantalla contacto excecuted");
        //incializar el objeto
        this.pantallaContacto = new PantallaContacto();
        //activar los listeners de la actual pantalla
        addListenersPantallaContacto();
        this.pantallaContacto.setVisible(true); //este metodo SIEMPRE ir al final.
    }

    /**
     * Metodo para activar el listener de los botones de
     * la pantalla login
     */
    private void addListenersPantallaContacto() {
        this.pantallaContacto.getBtnHome().addActionListener(this);
        this.pantallaContacto.addWindowListener(this);
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
        this.pantallaContacto.dispose();
    }

    /**
     * Metodo para cerrar el dialog
     */
    private void onCancel() {
        this.pantallaContacto.dispose();
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

