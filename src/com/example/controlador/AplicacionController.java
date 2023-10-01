package com.example.controlador;

import com.example.vista.frame.PantallaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * APLICACION CONTROLLER
 * Esta clase muestra la vista principal y llama a
 * las vistas secundarias
 * @author Tito Muñoz
 * @version 1
 */
public class AplicacionController implements ActionListener, WindowListener {
    //declaracion de los objetos de la vista
    PantallaPrincipal pantallaPrincipal;
    LoginController loginController;
    DatosController datosController;
    MenusController menusController;
    ContactoController contactoController;

    /**
     * CONTRUCTOR
     */
    public AplicacionController(){
        //declaracion del objecto de la vista
        this.pantallaPrincipal = new PantallaPrincipal();
        //activar los listeners de la actual pantalla
        addListenersPantallaPrincipal();
    }

    /**
     * Metodo para activar el listener de los botones de
     * la pantalla principal
     */
    private void addListenersPantallaPrincipal() {
        this.pantallaPrincipal.getBtnLogin().addActionListener(this);
        this.pantallaPrincipal.getBtnDatos().addActionListener(this);
        this.pantallaPrincipal.getBtnMenus().addActionListener(this);
        this.pantallaPrincipal.getBtnContacto().addActionListener(this);
    }

    /**
     * Este metodo procesa la acciones realizadas
     * en la pantalla
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //almacenar en una variable la accion ejecutada
        String command = e.getActionCommand();
        //Comprobar el tipo de boton seleccionado
        switch (command){
            //mostrar pantallas
            case "login":
                pantallaLogin();
                break;
            case "datos":
                datosPantalla();
                break;
            case "menus":
                menusPantalla();
                break;
            case "contacto":
                contactoPantalla();
                break;
        }
    }

    /**
     * Metodo para que inicializar el ContactoController
     */
    private void contactoPantalla() {
        this.contactoController = new ContactoController();

    }

    /**
     * Metodo para que inicializar el MenusController
     */
    private void menusPantalla() {
        this.menusController = new MenusController();
     }

    /**
     * Metodo para que inicializar el LoginController
     */
    private void datosPantalla() {
        this.datosController = new DatosController();
    }

    /**
     * Metodo para que inicializar el Login controller
     */
    private void pantallaLogin() {
        this.loginController = new LoginController();
    }



    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

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

