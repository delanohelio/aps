package models;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Uma representação simplificada de um objeto JSON para nosso exemplo.
 * Funciona como o "Tipo Alvo" que nosso sistema moderno espera.
 */
public class JSONObject {
    private final Map<String, Object> mapa = new LinkedHashMap<>();

    public void put(String chave, Object valor) {
        mapa.put(chave, valor);
    }

    public Object get(String chave) {
        return mapa.get(chave);
    }

    // Método para imprimir o JSON de forma legível
    public String toString(int indentacao) {
        StringBuilder sb = new StringBuilder("{\n");
        for (Map.Entry<String, Object> entry : mapa.entrySet()) {
            sb.append(" ".repeat(indentacao));
            sb.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\",\n");
        }
        // Remove a última vírgula e nova linha
        if (!mapa.isEmpty()) {
            sb.setLength(sb.length() - 2);
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}