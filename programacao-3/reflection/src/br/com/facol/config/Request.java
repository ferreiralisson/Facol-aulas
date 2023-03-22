package br.com.facol.config;

public class Request {

    private String nomeController;
    private String nomeMetodo;

    public Request(String url){
        String[] partsUrl = url.replaceFirst("/", "")
                .split("/");

        this.nomeController = Character.toUpperCase(partsUrl[0].charAt(0)) +
                partsUrl[0].substring(1) + "Controller";

        this.nomeMetodo = partsUrl[1];
    }

    public String getNomeController(){
        return this.nomeController;
    }

    public String getNomeMetodo(){
        return this.nomeMetodo;
    }
}
