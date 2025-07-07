import commands.Comando;
import commands.DesligarLuzComando;
import commands.LigarLuzComando;
import invokers.ControleRemoto;
import receivers.Luz;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Criar os receivers
        Luz luzDaCozinha = new Luz();

        // 2. Criar os comandos, associando-os aos receivers
        Comando ligarLuz = new LigarLuzComando(luzDaCozinha);
        Comando desligarLuz = new DesligarLuzComando(luzDaCozinha);

        // 3. Criar o invoker
        ControleRemoto controle = new ControleRemoto();

        // 4. Configurar e usar o invoker
        controle.setComando(ligarLuz);
        controle.botaoPressionado(); // Saída: Luz está acesa.

        controle.setComando(desligarLuz);
        controle.botaoPressionado(); // Saída: Luz está apagada.

        // 5. Demonstrando o Desfazer
        System.out.println("\n--- Testando o Undo ---");
        controle.setComando(ligarLuz);
        controle.botaoPressionado();      // Liga a luz
        controle.botaoDesfazerPressionado(); // Desfaz, desligando a luz
    }
}