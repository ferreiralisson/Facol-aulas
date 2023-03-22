package br.com.facol.controller;

import br.com.facol.dao.ProdutoDao;
import br.com.facol.domain.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoController {

    ProdutoDao dao = new ProdutoDao();

    public Produto listarProduto(){
        return dao.listarProduto();
    }

    private List<Produto> listarProdutos(String nome, String marca){
        return dao.listarProdutos()
                .stream().filter(p -> p.getNome().equals(nome.toUpperCase()) &&
                        p.getMarca().equals(marca.toUpperCase())).collect(Collectors.toUnmodifiableList());
    }

    private List<Produto> listarProdutos(){
        return dao.listarProdutos();
    }


}
