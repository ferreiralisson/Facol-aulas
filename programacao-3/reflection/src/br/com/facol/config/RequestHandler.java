package br.com.facol.config;

import br.com.facol.reflexao.Reflexao;

public class RequestHandler {

    private String pacoteBasico;

    public RequestHandler(String pacoteBasico) {
        this.pacoteBasico = pacoteBasico;
    }

    public Object executa(String url){
        // /controller/method
        Request request = new Request(url);
        String nomeController = request.getNomeController();
        String nomeMetodo = request.getNomeMetodo();

        Object retorno = new Reflexao()
                .refleteClasse(pacoteBasico + nomeController)
                .criarInstancia()
                .getMetodo(nomeMetodo)
                .invoca();

        return retorno;
    }
}
