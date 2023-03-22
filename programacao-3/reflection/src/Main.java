import br.com.facol.config.RequestHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // /controlador/metodo

        try (Scanner scanner = new Scanner(System.in)){
            String url = scanner.nextLine();
            RequestHandler requestHandler = new RequestHandler("br.com.facol.controller.");

            while (!url.equals("exit")){
                Object response = requestHandler.executa(url);
                System.out.println("Response: " + response);

                url = scanner.nextLine();
            }
        }
    }
}