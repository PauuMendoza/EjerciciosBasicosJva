/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * 17) Crea una aplicación que nos pida un día de la semana y que nos diga si
 * es un dia laboral o no. Usa un switch para ello.
 */
public class Ejercicio17_DiaSemana_Switch {
    
    public static void main(String[] args) {
        
        String dia = JOptionPane.showInputDialog(null, "Enter a day of the week", "DAY OF THE WEEK", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(dia);
    }
    
}
