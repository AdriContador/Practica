package App;

import Panel.MyPanel;
import Utils.Comprobador;


import javax.swing.*;

/**Esta es la clase controladora, permite arrancar la ejecución de la aplicación.
 * @author Adri Contador
 */
public class Aplicacion {
    /**
     * Este método arranca la ejecución del programa.
     * @param args
     */
    public static void main (String[] args) {
        Comprobador.Prueba();
        System.out.println("Registra tu animal en el siguiente formulario.");
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}
