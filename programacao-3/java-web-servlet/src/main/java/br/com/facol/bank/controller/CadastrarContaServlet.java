package br.com.facol.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.bank.dao.ContaDAO;
import br.com.facol.bank.domain.Conta;

@WebServlet(urlPatterns = "/cadastrar-conta")
public class CadastrarContaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String numeroConta = req.getParameter("numero-conta");

		Integer numConta = Integer.valueOf(numeroConta);

		Conta conta = new Conta(numConta);
		ContaDAO dao = new ContaDAO();

		Conta contaSalva = dao.cadastrarConta(conta);

		// chamo o jsp
		RequestDispatcher rd = req.getRequestDispatcher("/novaContaCriada.jsp");
		req.setAttribute("numConta", contaSalva.getNumeroConta());
		rd.forward(req, resp);

	}

}
