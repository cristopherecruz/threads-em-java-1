package br.dev.cristopher;

public class Multiplicacao implements  Runnable {

    private int a;
    private int b;

    public Multiplicacao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("O resultado da multiplicação é: " + (a * b));
    }

}
