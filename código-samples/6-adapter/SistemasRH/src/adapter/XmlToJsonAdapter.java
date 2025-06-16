package adapter;

import models.JSONObject;
import models.XMLDocument;

/**
 * O Adaptador. Sua responsabilidade é converter um objeto
 * incompatível (models.XMLDocument) para um tipo que o cliente espera (models.JSONObject).
 */
public class XmlToJsonAdapter {
    private final XMLDocument xmlDoc;

    public XmlToJsonAdapter(XMLDocument xmlDoc) {
        this.xmlDoc = xmlDoc;
    }

    public JSONObject converter() {
        // Lógica de conversão simplificada para o exemplo
        String xml = xmlDoc.getConteudoXML();

        System.out.println("Adaptador: iniciando conversão de XML para JSON...");

        String nome = extrairValor(xml, "nome");
        String cargo = extrairValor(xml, "cargo");

        JSONObject json = new JSONObject();
        json.put("nome", nome);
        json.put("cargo", cargo);

        System.out.println("Adaptador: conversão concluída.");
        return json;
    }

    // Método auxiliar privado apenas para simular a extração dos dados
    private String extrairValor(String xml, String tag) {
        try {
            return xml.split("<" + tag + ">")[1].split("</" + tag + ">")[0];
        } catch (Exception e) {
            return "N/A";
        }
    }
}