package org.example;

public class Bolo extends PadariaDecorator {
    public Bolo(Padaria padaria) {
        super(padaria);
    }

    public String getTipo() {return "Bolo normal";}

    public String getNomePedido() {
        return "Bolo de Cenoura";
    }
}
