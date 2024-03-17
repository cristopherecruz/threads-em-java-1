package br.dev.cristopher;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("isso é o thread main!");

        Multiplicacao multiplicacao = new Multiplicacao(2, 3);
        Thread thread = new Thread(multiplicacao, "Thread Multiplicação");
        thread.start();

        System.out.println("isso é o thread main de novo!");
    }

}
