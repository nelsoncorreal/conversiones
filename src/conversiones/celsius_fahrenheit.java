/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian salamanca
 */
public class celsius_fahrenheit implements hacerConversion {

    @Override
    public void convertir() {
        float c;
        c= Float.parseFloat(JOptionPane.showInputDialog("Grados celsius"));
        JOptionPane.showMessageDialog(null," la conversion a grados fahrenheit es : "+((c*9/5) + 32) );
        
    }
    
}
