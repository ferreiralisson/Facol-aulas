package br.com.facol.dao;

import br.com.facol.domain.Produto;
import br.com.facol.domain.ProdutoMock;

public class ProdutoDao {

    public Produto listarProduto(){
        return ProdutoMock.listarProduto();
    }
}
