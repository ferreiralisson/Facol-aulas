package br.com.facol.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.facol.domain.Conta;

public class ContaDAO {

	private static List<Conta> contas = new ArrayList<>();

	static {
		Conta conta1 = new Conta(9999);
		Conta conta2 = new Conta(8888);
		contas.add(conta1);
		contas.add(conta2);
	}

	public List<Conta> listarContas() {
		return contas;
	}

}
