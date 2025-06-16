package sistema;

import models.JSONObject;

/**
 * A classe "cliente" que usa os dados. Ela só entende models.JSONObject.
 */
public class SistemaDeAnalise {
    public void processarDados(JSONObject dadosJson) {
        System.out.println("Processando os seguintes dados no sistema novo:");
        // Usamos o toString(4) para uma impressão formatada
        System.out.println(dadosJson.toString(4));
    }
}