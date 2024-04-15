package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PadariaTest {

    @Test
    void deveRetornarSalgado() {
        Padaria padaria = new Salgado("salgado");

        assertEquals("salgado", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarPaoComSalgado() {
        Padaria padaria = new Pao(new Salgado("morango/Pão Francês"));

        assertEquals("morango/Pão Francês/Pão Francês", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComBolo() {
        Padaria padaria = new Bolo(new Salgado("salgado"));

        assertEquals("salgado/Bolo normal", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComCafe() {
        Padaria padaria = new Cafe(new Salgado("salgado"));

        assertEquals("salgado/Café gelado", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComPaoMaisBolo() {
        Padaria padaria = new Pao(new Bolo(new Salgado("salgado")));

        assertEquals("salgado/Bolo normal/Pão Francês", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComPaoMaisCafe() {
        Padaria padaria = new Pao(new Cafe(new Salgado("salgado")));

        assertEquals("salgado/Café gelado/Pão Francês", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComBoloMaisCafe() {
        Padaria padaria = new Bolo(new Cafe(new Salgado("salgado")));

        assertEquals("salgado/Café gelado/Bolo normal", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComEstagioMaisBoloMaisCafe() {
        Padaria padaria = new Pao(new Bolo(new Cafe(new Salgado("salgado"))));

        assertEquals("salgado/Café gelado/Bolo normal/Pão Francês", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarPedido() {
        Padaria padaria = new Salgado();

        assertEquals("Salgado", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComPao() {
        Padaria padaria = new Pao(new Salgado());

        assertEquals("Salgado/Pão", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComBolo() {
        Padaria padaria = new Bolo(new Salgado());

        assertEquals("Salgado/Bolo de Cenoura", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComCafe() {
        Padaria padaria = new Cafe(new Salgado());

        assertEquals("Salgado/Café", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComPaoMaisBolo() {
        Padaria padaria = new Pao(new Bolo (new Salgado()));

        assertEquals("Salgado/Bolo de Cenoura/Pão", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComPaoMaisCafe() {
        Padaria padaria = new Pao(new Cafe (new Salgado()));

        assertEquals("Salgado/Café/Pão", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComBoloMaisCafe() {
        Padaria padaria = new Bolo(new Cafe (new Salgado()));

        assertEquals("Salgado/Café/Bolo de Cenoura", padaria.getPedido());
    }

    @Test
    void deveRetornarTipoComPaoMaisBoloMaisCafe() {
        Padaria padaria = new Pao (new Bolo(new Cafe (new Salgado())));

        assertEquals("Salgado/Café/Bolo de Cenoura/Pão", padaria.getPedido());
    }
}