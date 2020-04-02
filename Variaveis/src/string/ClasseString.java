package string;

public class ClasseString {

    public static void main(String args[]) {
        int num;

        String variable = "HOLA MUNDO, ESTOY PROGRAMANDO EN JAVA";

        System.out.println(variable);
        System.out.println("El texto tiene " + variable.length() + " letras.");
        System.out.println("La frase comienza con la letra " + variable.charAt(0));
        System.out.println("La frase termina com la letra " + variable.charAt(variable.length() - 1));

    }
}
