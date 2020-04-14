package poo;

import javax.swing.JOptionPane;

public class MetodosDois {

    public static void main(String[] args) {

        double numero1, numero2;

        for (int c = 1; c <= 5; c++) {
            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero de la suma : " + c));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero de la suma : " + c));

            sumaDosNumero(numero1, numero2, c);
        }
    }

    public static void sumaDosNumero(double numero1, double numero2, int numeroSuma) {

        JOptionPane.showMessageDialog(null, "El valor de la suma" + numeroSuma + "es: " + (numero1 + numero2));

    }

    /*
     JOptionPane.showMessageDialog(null, "El valor de la suma 1 es: " + sumaDosNumeros());
     JOptionPane.showMessageDialog(null, "El valor de la suma 2 es: " + sumaDosNumeros());
     JOptionPane.showMessageDialog(null, "El valor de la suma 3 es: " + sumaDosNumeros());
     JOptionPane.showMessageDialog(null, "El valor de la suma 4 es: " + sumaDosNumeros());
     JOptionPane.showMessageDialog(null, "El valor de la suma 5 es: " + sumaDosNumeros());

     }

     public static double sumaDosNumeros() {
     double numero1, numero2;

     numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero: "));
     numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero: "));

     return numero1 + numero2;
               
     }
     */
}


