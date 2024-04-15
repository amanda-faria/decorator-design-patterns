package org.example;
public class Pao extends PadariaDecorator{

    public Pao(Padaria padaria) {
        super(padaria);
    }

    public String getTipo() {
        return "Pão Francês";
    }

    public String getNomePedido() {
        return "Pão";
    }
}
