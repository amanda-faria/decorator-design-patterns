package org.example;

public abstract class PadariaDecorator implements Padaria {

    private Padaria padaria;
    public String nomePedido;
    private String pedido;

    public PadariaDecorator(Padaria padaria) {
        this.padaria = padaria;
    }

    public Padaria getPadaria() {
        return padaria;
    }

    public void setPadaria(Padaria padaria) {
        this.padaria = padaria;
    }

    public abstract String getTipo();

    public String getTipoPedido() {
        return this.padaria.getTipoPedido() + "/" + this.getTipo();
    }

    public abstract String getNomePedido();

    public String getPedido() {
        return this.padaria.getPedido() + "/" + this.getNomePedido();
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
