package br.com.facol;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.dao.ContaDAO;
import br.com.facol.domain.Conta;

@WebServlet(urlPatterns = "/listar-contas")
public class ListarContasServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");

		ContaDAO dao = new ContaDAO();
		
		List<Conta> contas = dao.listarContas();

		for (Conta conta : contas) {
			out.println("<li>" + conta.getNumeroConta() + "</li>");
		}

		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");

	}

}