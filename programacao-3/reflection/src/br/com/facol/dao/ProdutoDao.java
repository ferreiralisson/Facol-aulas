package br.com.facol.dao;

import java.util.List;

import br.com.facol.domain.Produto;

public interface ProdutoDao {
	
	public Produto listarProduto();
	public List<Produto> listarProdutos();

}
