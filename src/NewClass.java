/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import javax.swing.*;
public class NewClass{
public static void main ( String [] args ) {
Ventana ven = new Ventana ( ) ;
ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
ven.show( ) ;
}

}


class Ventana extends JFrame{
public Ventana ( ) {
setSize(300 ,200) ;
}
}