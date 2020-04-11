package poo;

import javax.swing.JOptionPane;

/**
 *
 * METODOS
 *
 * No solicitan parametros y no retorna valores
 *
 * No solicitan parametros y retornan valores
 *
 * Solicitam parametros y no retornan valores
 *
 * Solicitam parametros y retornan valores
 */
public class Metodos {

    public static void main(String[] args) {
        sumaDosNumeros();
    }

    public static void sumaDosNumeros() {
        double numero1, numero2;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        JOptionPane.showInputDialog(null, "El valor de la suma es: " + (numero1 + numero2));

    }

}
