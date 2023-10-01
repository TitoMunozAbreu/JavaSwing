package com.example.controlador;

import com.example.modelo.Cliente;
import com.example.vista.dialog.PantallaDatos;

import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;

/**
 * DATOS CONTROLLER
 * Esta clase muestra la vista de Datos y contiene
 * su logica
 * @author Tito Muñoz
 * @version 1
 */
public class DatosController implements ActionListener, WindowListener {
    //declaracion de variables
    private PantallaDatos pantallaDatos;

    public DatosController(){
        System.out.println("Contructor pantalla datos excecuted");
        //incializar el objeto
        this.pantallaDatos = new PantallaDatos();
        //activar los listeners de la actual pantalla
        addListenersPantallaDatos();
        //Crear tabla de datos del cliente
        ClienteTableModel clienteTableModel = new ClienteTableModel();
        this.pantallaDatos.tableClientes.setModel(clienteTableModel);
        this.pantallaDatos.tableClientes.setAutoCreateRowSorter(true);
        this.pantallaDatos.setVisible(true); //este metodo SIEMPRE ir al final.
    }

    /**
     * Metodo para activar el listener de los botones de
     * la pantalla login
     */
    private void addListenersPantallaDatos() {
        this.pantallaDatos.addWindowListener(this);
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
    private void onHome() {
        this.pantallaDatos.dispose();
    }

    private void onCancel() {
        this.pantallaDatos.dispose();
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

    private static class ClienteTableModel extends AbstractTableModel{
        private final String[] COLUMNS = {"Nombre","Direccion","Movil"};
        private List<Cliente> clientes;

        private ClienteTableModel(){
            clientes = List.of(
                    new Cliente("Papaya","Sevilla","6351257"),
                    new Cliente("Conchita e Mango","Cadiz","6584125"),
                    new Cliente("Tamarindo","Malaga","65842472")
            );

        }
        @Override
        public int getRowCount() {
            return clientes.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> clientes.get(rowIndex).getNombre();
                case 1 -> clientes.get(rowIndex).getDireccion();
                case 2 -> clientes.get(rowIndex).getMovil();
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
