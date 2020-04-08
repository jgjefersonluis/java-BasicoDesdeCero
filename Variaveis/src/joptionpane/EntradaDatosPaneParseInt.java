package joptionpane;

import javax.swing.JOptionPane;

public class EntradaDatosPaneParseInt {

    public static void main(String[] args) {
        String nombre, leer;
        int edad, nacimiento;

        nombre = JOptionPane.showInputDialog("Ingressa tu nombre");
        nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingressa tu fecha de nascimiento"));

        edad = 2020 - nacimiento;

        JOptionPane.showMessageDialog(null, "Hola, " + nombre + " el año de nacimiento es: " + nacimiento
                + ", tu edade es: " + edad + ", años.");

    }

}
