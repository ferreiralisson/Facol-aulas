package br.com.facol.controller;

import br.com.facol.dao.ProdutoDao;
import br.com.facol.domain.Produto;

import java.util.List;

public class ProdutoController {

    ProdutoDao dao = new ProdutoDao();

    public Produto listarProduto(){
        return dao.listarProduto();
    }

    private List<Produto> listarProdutos(){
        return List.of(dao.listarProduto(), dao.listarProduto(), dao.listarProduto());
    }


}
