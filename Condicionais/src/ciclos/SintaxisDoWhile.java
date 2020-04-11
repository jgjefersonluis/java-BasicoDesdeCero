package ciclos;

public class SintaxisDoWhile {

    /**
     *
     * do { instrucciones; }while(condicion(es));
     *
     * @param args
     */

    public static void main(String[] args) {

        int c = 1;

        do {
            System.out.println("Hola, mundo!" + 10);
            c++;
        } while (c <= 10);

    }

}
