public class Pedido {

    private String sanduiche;
    private String acompanhamento;
    private String bebida;
    private String brinquedo;
    private float desconto;

    public Pedido(String sanduiche, String acompanhamento, String bebida, String brinquedo, float desconto) {
        this.sanduiche = sanduiche;
        this.acompanhamento = acompanhamento;
        this.bebida = bebida;
        this.brinquedo = brinquedo;
    }

    public void exibir() {
        System.out.println("Pedido:");
        System.out.println("Sanduíche: " + sanduiche);
        System.out.println("Acompanhamento: " + acompanhamento);
        System.out.println("Bebida: " + bebida);
        System.out.println("Brinquedo: " + (brinquedo != null ? brinquedo : "Nenhum"));
    }

}
