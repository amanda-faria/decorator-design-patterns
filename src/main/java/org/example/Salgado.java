package org.example;

public class Salgado implements Padaria {

    public String tipoPedido;

    public Salgado() {
    }

    public Salgado(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    @Override
    public String getPedido() {
        return "Salgado";
    }

    public String getNomePedido() {
        return "Salgado";
    }
}
