package br.com.facol.config;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Request {

    private String pacoteBasico;

    public Request(String pacoteBasico) {
        this.pacoteBasico = pacoteBasico;
    }

    public Object executa(String url){
          //  controller/method

        String[] partsUrl = url.replaceFirst("/", "")
                .split("/");

        String nomeController = Character.toUpperCase(partsUrl[0].charAt(0)) +
                partsUrl[0].substring(1) + "Controller";

        // /ProdutoController/method

        String nomeMetodo = partsUrl[1];

        //ProdutoController/listarProduto


        try {
            Class<?> classController = Class.forName(pacoteBasico + nomeController);
            Object instanceController = classController.getDeclaredConstructor().newInstance();

            Method metodo = instanceController.getClass().getDeclaredMethod(nomeMetodo);
            metodo.setAccessible(true);
            Object response = metodo.invoke(instanceController);

            return response;
        } catch (ClassNotFoundException |
                 InvocationTargetException |
                 InstantiationException |
                 IllegalAccessException |
                 NoSuchMethodException
                e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
