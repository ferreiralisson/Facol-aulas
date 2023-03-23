package br.com.facol.controller;

import java.util.List;
import java.util.stream.Collectors;

import br.com.facol.dao.ProdutoDao;
import br.com.facol.domain.Produto;

public class ProdutoController {

	private ProdutoDao service;

	public ProdutoController(ProdutoDao service) {
		this.service = service;
	}

	public Produto listarProduto() {
		return service.listarProduto();
	}

	private List<Produto> listarProdutos(String nome, String marca) {
		return service.listarProdutos().stream()
				.filter(p -> p.getNome().equals(nome.toUpperCase()) && p.getMarca().equals(marca.toUpperCase()))
				.collect(Collectors.toUnmodifiableList());
	}

	private List<Produto> listarProdutos() {
		return service.listarProdutos();
	}

}
