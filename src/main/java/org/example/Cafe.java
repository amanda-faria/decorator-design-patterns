package org.example;

public class Cafe extends PadariaDecorator {

    public Cafe(Salgado cafe) {
        super(cafe);
    }

    public String getTipo() {
        return "Café gelado";
    }

    public String getNomePedido() {
        return "Café";
    }
}
