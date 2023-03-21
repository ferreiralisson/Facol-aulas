package br.com.facol.dao;

import java.util.List;

import br.com.facol.domain.conta.Conta;
import br.com.facol.infra.Banco;

public class ContaDao {

	private List<AcaoPosCriacaoBanco> acoes;

	
	public ContaDao(List<AcaoPosCriacaoBanco> acoes) {
		this.acoes = acoes;
	}
	
	public ContaDao() {
		
	}

	public void execute(Conta conta) {
		acoes.forEach(acao -> acao.executarAcao(conta));
	}

	public List<Conta> listarContas() {
		return Banco.getContasImposto();
	}

}
