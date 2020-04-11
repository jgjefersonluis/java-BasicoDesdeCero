package ciclos;

import javax.swing.JOptionPane;

public class EjercicioFor {

    public static void main(String[] args) {

        int totalFrutas;

        //String frutas[] = {"Manzzana", "Pera", "Melon", "Cereza", "Uva", "Toronja", "Mango", "Durazno", "Piña", "Mandarina"};

        /*
         String frutas[] = new String[6];
         frutas[0] = "Manzzana";
         frutas[1] = "Pera";
         frutas[2] = "Melon";
         frutas[3] = "Cereza";
         frutas[4] = "Uva";
         frutas[5] = "Toronja";
         frutas[6] = "Mango";
         frutas[7] = "Durazno";
         frutas[8] = "Piña";
         frutas[9] = "Mandarina";
         int totalFrutas;
         */
        do {
            totalFrutas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de frutas que deseas: "));
            if (totalFrutas <= 0) {
                JOptionPane.showMessageDialog(null, "ERROR\nIngressa un valor mayor a 0.");
            }
        } while (totalFrutas <= 0);

        String frutas[];
        frutas = new String[totalFrutas];

        for (int c = 0; c < frutas.length; c++) {
            frutas[c] = JOptionPane.showInputDialog("Ingresa o nombre de la fruta" + (c + 1));
        }

        for (String fruta : frutas) {
            System.out.println(fruta);

            /*
             for (int c = 0; c <= 5; c++) {
             System.out.println(frutas[c]);
             }

             for (int c = 0; c <= 10; c++) {
             System.out.println(frutas[c]);
             }
        
             for (int c = 0; c < frutas.length; c++) {
             System.out.println(frutas[c]);
             }
             */
        }

    }
}
