package br.com.facol.bank.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.bank.dao.ContaDAO;
import br.com.facol.bank.domain.Conta;

@WebServlet(urlPatterns = "/listar-contas")
public class ListarContasServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		ContaDAO dao = new ContaDAO();

		List<Conta> contas = dao.listarContas();

		req.setAttribute("contas", contas);
		RequestDispatcher rd = req.getRequestDispatcher("/listaContas.jsp");
		rd.forward(req, resp);

	}

}