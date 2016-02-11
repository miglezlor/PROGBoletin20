package boletin20;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Libreria {
    ArrayList <Libro> inventario = new ArrayList();
    
    public void engadirLibro(){
        String titulo = JOptionPane.showInputDialog("Introduce el titulo del libro");
        String autor = JOptionPane.showInputDialog("Introduce el autor del libro");
        String ISBN = JOptionPane.showInputDialog("Introduce el ISBN del libro");
        float prezo = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro"));
        int numUnidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de unidades"));
        Libro lib = new Libro(titulo, autor, ISBN, prezo, numUnidades);
        inventario.add(lib);
    }
    
    public void ver(){
        String titu = (JOptionPane.showInputDialog("Titulo del libro que quieres ver"));
        for (int i=0; i<inventario.size();i++){
            if (titu.equalsIgnoreCase(inventario.get(i).getTítulo())){
                JOptionPane.showMessageDialog(null, inventario.get(i).toString());
            }
        }
        
    }
    public void vender(){
        int k = Integer.parseInt(JOptionPane.showInputDialog("Posicion del libro que se vende"));
        int nlibros = inventario.get(k).getNumUnidades();
        nlibros = nlibros - 1;
        if (nlibros==0){
            inventario.remove(k);
            JOptionPane.showMessageDialog(null, "Ya no hay unidades de este libro.");
        }
        else{
            inventario.get(k).setNumUnidades(nlibros);
            JOptionPane.showMessageDialog(null, "Quedan "+nlibros+" unidades");
        }
            
    }
    
    public void ordenar(){
        Collections.sort(inventario);
    }
    
    public void verTodo(){
        JOptionPane.showMessageDialog(null, inventario);
    }
    
}
