package edu.dio.sintaxeDoJava;

public class Operadores {
    /*int numero = -10;
        System.out.println("- com - fica positivo: " + -numero);

        numero--;
        System.out.println("numero-- => (-10) - 1: " + numero);

        System.out.println("numero++ Incrementa depois que a execução passa por ele: " + numero++);

        System.out.println("Incrementou: " + numero);

        System.out.println("++numero Incrementa no mesmo momento que passa por ele: " + ++numero);

        boolean verdadeiro = true;
        System.out.println("Original " + verdadeiro);
        System.out.println("! Inverteu " + !verdadeiro);*/

        /*String nome1 = "JAVA";
        String nome2 = new String ("JAVA");
        System.out.println(nome1 == nome2); //true*/

    int a = 5;
    int b = 7;
    boolean myBool1 = true;
    boolean myBool2 = false;

//        System.out.println((a < b) | myBool1 && myBool2); // false
    // Usando com somente um '|' ainda verifica o resto

//        System.out.println((a < b) || myBool1 && !myBool2); // true
    // Usando com dois '||' não verifica resto se a primeira condição é verdadeira

//        System.out.println((a > b) && myBool1 | !myBool2); // false
    // Usando duas vezes "&&" ele ignora o resto se a primeira condição for falsa

//        System.out.println(((a > b) & myBool1 || !myBool2)); // true
    // Usando uma vez "&" ele verifica o resto se a primeira condição for falsa ou verdadeira

//        System.out.println((a > b) && myBool1 || !myBool2); // true
    // Usando duas vezes "&&" ignora a próxima condição se a primeira é falsa,
    // mas colocando "||" duas vezes na 3º condição não ignora e retorna verdadeiro
}
