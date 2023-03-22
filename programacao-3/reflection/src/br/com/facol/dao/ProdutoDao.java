package br.com.facol.dao;

import br.com.facol.domain.Produto;
import br.com.facol.domain.ProdutoMock;

import java.util.List;

public class ProdutoDao {

    public Produto listarProduto(){
        return ProdutoMock.listarProduto();
    }

    public List<Produto> listarProdutos(){
        return ProdutoMock.listarProdutos();
    }

}
