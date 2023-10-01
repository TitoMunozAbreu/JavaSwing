package com.example.controlador;

import com.example.modelo.Cliente;
import com.example.modelo.Menu;
import com.example.vista.dialog.PantallaDatos;
import com.example.vista.dialog.PantallaMenus;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;

/**
 * MENU CONTROLLER
 * Esta clase muestra la vista de los menus semanal
 * @author Tito Muñoz
 * @version 1
 */
public class MenusController implements ActionListener, WindowListener {
    //declaracion de variables
    private PantallaMenus pantallaMenus;

    public MenusController(){
        System.out.println("Pantalla menus excecuted");
        //incializar el objeto
        this.pantallaMenus = new PantallaMenus();
        //activar los listeners de la actual pantalla
        addListenersPantallaController();
        //Crear tabla del menu semanal
        MenuTableModel menuTableModel = new MenuTableModel();
        this.pantallaMenus.getTableMenus().setModel(menuTableModel);
        this.pantallaMenus.getTableMenus().setAutoCreateRowSorter(true);
        this.pantallaMenus.setVisible(true); //este metodo SIEMPRE ir al final.
    }

    /**
     * Metodo para activar el listener de los botones de
     * la pantalla Menu
     */
    private void addListenersPantallaController() {
        this.pantallaMenus.getBtnHome().addActionListener(this);
        this.pantallaMenus.addWindowListener(this);
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
        this.pantallaMenus.dispose();
    }

    /**
     * Metodo para cerrar el dialog
     */
    private void onCancel() {
        this.pantallaMenus.dispose();
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

    /**
     * Clase MenuTableModel para definir los
     * datos de la tabla
     */
    private static class MenuTableModel extends AbstractTableModel {
        private final String[] COLUMNS = {"Dia", "Comida"};
        private List<Menu> menus;

        private MenuTableModel(){
            menus = List.of(
                    new Menu("Lunes","Arroz con frijoles negros"),
                    new Menu("Martes","Salmon con esparragos verdes"),
                    new Menu("Miercoles","Berenjenas rellenas"),
                    new Menu("Jueves","Revuelto de verduras con huevo"),
                    new Menu("Viernes","Pavo empanado"),
                    new Menu("Sabado","Bacalao dorado"),
                    new Menu("Domingo","Tortilla de patatas")
            );
        }
        @Override
        public int getRowCount() {
            return menus.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> menus.get(rowIndex).getDia();
                case 1 -> menus.get(rowIndex).getDescripcion();
                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column) {
            return COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0,columnIndex ) != null){
                return getValueAt(0,columnIndex).getClass();
            }else {
                return  Object.class;
            }
        }
    }

}
