package br.com.facol.bank.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.com.facol.bank.domain.Conta;

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

	public Conta cadastrarConta(Conta conta) {
		contas.add(conta);

		return conta;
	}

	public Conta atualizarConta(Map<String, Integer> contasMap) {

		Conta contaEncontrada = buscarConta(contasMap.get("nunero-conta"));
		Conta conta = new Conta(null);

		if (contas.contains(contaEncontrada)) {
			contas.remove(contaEncontrada);
			conta = new Conta(contasMap.get("numero-conta-atualizar"));
			contas.add(conta);
		}

		return conta;
	}

	public Conta buscarConta(Integer numeroConta) {
		Optional<Conta> contaFiltrada = contas.stream()
				.filter(contaStream -> contaStream.getNumeroConta().compareTo(numeroConta) == 0).findFirst();

		if (contaFiltrada.isPresent()) {
			return contaFiltrada.get();
		}

		return new Conta(null);
	}

}
