import java.util.Scanner;

import br.com.facol.config.RequestHandler;
import br.com.facol.dao.ProdutoDao;
import br.com.facol.dao.ProdutoMock;

public class Main {
    public static void main(String[] args) {
        // /controlador/metodo
    	// /produto/listarProdutos
    	// /produto/listarProdutos?nome=mousepad&marca=multilaser

        try (Scanner scanner = new Scanner(System.in)){
            String url = scanner.nextLine();
            RequestHandler requestHandler = new RequestHandler("br.com.facol.controller.");
            requestHandler.registra(ProdutoDao.class, ProdutoMock.class);

            while (!url.equals("exit")){
                Object response = requestHandler.executa(url);
                System.out.println("Response: " + response);

                url = scanner.nextLine();
            }
        }
    }
}