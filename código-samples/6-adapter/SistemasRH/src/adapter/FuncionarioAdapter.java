package adapter;

import models.JSONObject;
import models.XMLDocument;

public class FuncionarioAdapter {

    public JSONObject toJSON(XMLDocument xmlDoc) {
        JSONObject json = new JSONObject();

        String xml = xmlDoc.getConteudoXML();

        String nome = extrairValor(xml, "nome");
        String cargo = extrairValor(xml, "cargo");

        json.put("nome", nome);
        json.put("cargo", cargo);

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
