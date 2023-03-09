package Componetes;

public class Moeda {
    int valor = 0;
    String moedaAtual = "REAIS";

    public Moeda(int valor) {
        this.valor = valor;
    }

    public Moeda(int valor, String moedaAtual) {
        this.valor = valor;
        this.moedaAtual = moedaAtual;
    }
}
