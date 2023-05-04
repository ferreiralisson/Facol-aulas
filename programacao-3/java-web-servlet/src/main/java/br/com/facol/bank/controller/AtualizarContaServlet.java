package br.com.facol.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.bank.dao.ContaDAO;
import br.com.facol.bank.domain.Conta;

@WebServlet(urlPatterns = "/atualizar-conta")
public class AtualizarContaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String numeroConta = req.getParameter("numero-conta");
		String numeroContaAtualizar = req.getParameter("numero-conta-atualizar");

		Integer numConta = Integer.valueOf(numeroConta);
		Integer numContaAtualizar = Integer.valueOf(numeroContaAtualizar);
		

		Map<String, Integer> contaMap = new HashMap<>();
		contaMap.put("nunero-conta", numConta);
		contaMap.put("numero-conta-atualizar", numContaAtualizar);

		ContaDAO dao = new ContaDAO();
		Conta contaSalva = dao.atualizarConta(contaMap);

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");

		out.println("Conta: " + contaSalva.getNumeroConta() + " atualizada com sucesso");

		out.println("</body>");
		out.println("</html>");
	}

}
