package br.com.facol.domain;

import java.util.List;

public class ProdutoMock {
    public static Produto listarProduto(){
        return new Produto(1, "MousePad", "Multilaser");
    }

    public static List<Produto> listarProdutos(){
        return List.of(
                new Produto(1, "MOUSEPAD", "MULTILASER"),
                new Produto(2, "TECLADO", "MANCER"),
                new Produto(3, "MONITOR", "AOC")
        );
    }
}
