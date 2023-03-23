package br.com.facol.dao;

import java.util.List;

import br.com.facol.domain.Produto;

public class ProdutoMock implements ProdutoDao {
    public Produto listarProduto(){
        return new Produto(1, "MousePad", "Multilaser");
    }

    public List<Produto> listarProdutos(){
        return List.of(
                new Produto(1, "MOUSEPAD", "MULTILASER"),
                new Produto(2, "TECLADO", "MANCER"),
                new Produto(3, "MONITOR", "AOC")
        );
    }
}
