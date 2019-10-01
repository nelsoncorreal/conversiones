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
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
         do{   
                opc=Integer.parseInt(JOptionPane.showInputDialog("1. Celsius a Fahrenheit "
                + "\n2. Celsius a Kelvin \n3. Kelvin a Fahrenheit"));
        switch(opc){
            case 1:
                 celsius_fahrenheit c = new celsius_fahrenheit();
                 conversion(c);
                 break;
            case 2:
                celsius_kelvin d = new celsius_kelvin();
                conversion(d);
                break;
            case 3: 
                Kelvin_fahrenheit e = new Kelvin_fahrenheit();
                conversion(e);
        }
        opc=Integer.parseInt(JOptionPane.showInputDialog("desea hacer mas conversiones 1. SI"
                + "2. NO"));
        }while(opc==1);
    }
    public static void conversion(hacerConversion c){
        c.convertir();
    }
}
