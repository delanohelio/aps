import model.Documento;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento();
        doc.editar("Novo documento");

        //Vai gerar um erro
        doc.publicar();

        doc.revisar();

        //Vai gerar um erro
        doc.editar("Alterando documento");

        doc.publicar();

        //vai gerar algum erro
        doc.editar("Outra coisa");
        doc.revisar();
        doc.publicar();
    }
}