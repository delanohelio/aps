import adapter.FuncionarioAdapter;
import adapter.XmlToJsonAdapter;
import models.JSONObject;
import models.XMLDocument;
import sistema.SistemaDeAnalise;

public class Main {
    public static void main(String[] args) {
        // 1. Recebemos os dados do sistema legado no formato XML.
        String dadosEmXml = """
            <funcionario>
                <nome>Maria Joaquina</nome>
                <cargo>Gerente de Projetos</cargo>
            </funcionario>
        """;
        XMLDocument xml = new XMLDocument(dadosEmXml);
        System.out.println("Dados recebidos do sistema legado (XML): " + xml.getConteudoXML());
        System.out.println("--------------------------------------------------------------------");

        // 2. Nosso sistema moderno não entende XML, então criamos o adaptador.
        // O adaptador "envolve" o objeto XML.
        XmlToJsonAdapter adaptador = new XmlToJsonAdapter(xml);

        // 2.1 Adaptador transformador
        FuncionarioAdapter funcionarioAdapter = new FuncionarioAdapter();
        JSONObject dadosJson2 = funcionarioAdapter.toJSON(xml);

        // 3. Usamos o adaptador para fazer a conversão para o formato esperado (JSON).
        JSONObject dadosJson = adaptador.converter();
        System.out.println("--------------------------------------------------------------------");

        // 4. Agora, com os dados no formato correto, podemos usá-los no nosso sistema.
        SistemaDeAnalise sistema = new SistemaDeAnalise();
        sistema.processarDados(dadosJson);
    }
}