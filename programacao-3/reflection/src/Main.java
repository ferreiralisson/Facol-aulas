import br.com.facol.config.Request;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // /controlador/metodo

        try (Scanner scanner = new Scanner(System.in)){
            String url = scanner.nextLine();
            Request request = new Request("br.com.facol.controller.");

            while (!url.equals("exit")){
                Object response = request.executa(url);
                System.out.println("Response: " + response);

                url = scanner.nextLine();
            }
        }
    }
}