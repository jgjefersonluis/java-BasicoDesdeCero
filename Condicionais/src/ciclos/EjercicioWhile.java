package ciclos;

import javax.swing.JOptionPane;

public class EjercicioWhile {

    public static void main(String[] args) {
        int c = 1;
        double califacionActual, mayor = 0, menor = 0;

        while (c <= 10) {
            califacionActual = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificaion" + c)
            );

            if (califacionActual > mayor) {
                mayor = califacionActual;
            }
            if (califacionActual < menor) {
                menor = califacionActual;
            }
            System.out.println("Calificaion " + c + ":" + califacionActual);
            c++;
        }
        System.out.println("La calificacion mayor es: " + mayor);
        System.out.println("La calificacion menor es: " + menor);

    }
}
