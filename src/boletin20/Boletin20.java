package boletin20;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin20 {

    
    public static void main(String[] args) {
        Libreria stock = new Libreria();
        int opcion;
        do{
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("OPCIONES: \n 1. Añadir libro. \n 2. Vender libro. \n 3. Ordenar. \n 4. Ver \n 5. Ver stock"));
            
            switch(opcion){
                case 1 : stock.engadirLibro();
                    break;
                case 2 : stock.vender();
                    break;
                case 3 : stock.ordenar();
                    break;
                case 4 : stock.ver();
                    break;
                case 5 : stock.verTodo();
                    break;
                case 6 : System.exit(0);
            }
        }while(opcion<6);
    }
    
}
