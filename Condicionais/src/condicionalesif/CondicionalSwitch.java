package condicionalesif;

import javax.swing.JOptionPane;


public class CondicionalSwitch {

    public static void main(String[] args) {

        int dato, figura;
        double base, altura, lado = 0, radio, area, perimetro;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Que deseas calcular?\n " + "1.-Area\n2.-Perimetro\n(Escribe solo el numero)"));

        if (dato == 1) {
            figura = Integer.parseInt((JOptionPane.showInputDialog("De que figura"
                    + "deseas calcular el area?\n1.-Triangulo\n.-Cuadrado\n"
                    + "3.-Rectangulo\n4.-Circulo\n(Esecribe solo el numero")));

            switch (figura) {
                case 1:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base: "));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));

                    area = (base * altura) / 2;
                    
                    JOptionPane.showMessageDialog(null, "La area del triangulo es: " + area);

                    break;

                case 2:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lel lado: "));

                    area = lado * lado;
                    
                    JOptionPane.showMessageDialog(null, "La area del cuadrado es: " + area);

                    break;

                case 3:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base: "));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));

                    area = base * altura;
                    
                    JOptionPane.showMessageDialog(null, "La area del retangulo es: " + area);

                    break;

                case 4:
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lel radio: "));

                    area = 3.1416 * Math.pow(radio, 2);
                    
                    JOptionPane.showMessageDialog(null, "La area del circulo es: " + area);

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "La opcion que escogiste no es valida!");
                    break;
            }

        } else if (dato == 2) {
            
            figura = Integer.parseInt((JOptionPane.showInputDialog("De que figura"
                    + "deseas calcular el perimetro?\n1.-Triangulo\n.-Cuadrado\n"
                    + "3.-Rectangulo\n4.-Circulo\n(Esecribe solo el numero")));

            switch (figura) {
                case 1:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lel lado del triangulo equilatero: "));
                    
                    perimetro = lado * 3;
                    
                    JOptionPane.showMessageDialog(null, "Lo perimetro del triangulo es: " + perimetro);

                    break;

                case 2:
                    perimetro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lel perimetro: "));

                    perimetro = lado * 4;
                    
                    JOptionPane.showMessageDialog(null, "La area del cuadrado es: " + perimetro);

                    break;

                case 3:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base: "));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));

                    perimetro = base*2 + altura*2;
                    
                    JOptionPane.showMessageDialog(null, "Lo perimetro del retangulo es: " + perimetro);

                    break;

                case 4:
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lel radio: "));

                    perimetro = 3.1416 * radio * 2;
                    
                    JOptionPane.showMessageDialog(null, "Lo perimetro del circulo es: " + perimetro);

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "La opcion que escogiste no es valida!");
                    break;
            }

            

        } else {
            JOptionPane.showMessageDialog(null, "La opcion no es valida");
        }

    }
}
