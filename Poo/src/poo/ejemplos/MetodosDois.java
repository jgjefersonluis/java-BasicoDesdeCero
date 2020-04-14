package poo.ejemplos;

import javax.swing.JOptionPane;

public class MetodosDois {

    public static void main(String[] args) {

        double catetoOpuesto, catetoAdyascente, hipotenusa;

        catetoOpuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del cateto oposto"));
        catetoAdyascente = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del cateto adyascente"));

    }

    public static double calculoHipotenusa(double co, double ca) {
        return Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
    }

}
