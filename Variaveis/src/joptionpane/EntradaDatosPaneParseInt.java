/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author jg_je
 */
public class EntradaDatosPaneParseInt {

    public static void main(String[] args) {
        String nombre, leer;
        int edad, nacimiento;

        nombre = JOptionPane.showInputDialog("Ingressa tu nombre");
        leer = JOptionPane.showInputDialog("Ingressa tu fecha de nascimiento");
        nacimiento = Integer.parseInt(leer);

        edad = 2020 - nacimiento;

        JOptionPane.showMessageDialog(null, "Hola, " + nombre + " el año de nacimiento es: " + nacimiento
                + ", tu edade es: " + edad + ", años.");

    }

}
