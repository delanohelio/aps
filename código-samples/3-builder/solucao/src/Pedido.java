public class Pedido {
    private String sanduiche;
    private String acompanhamento;
    private String bebida;
    private String brinquedo;
    private float desconto;

    private Pedido(Builder builder) {
        this.sanduiche = builder.sanduiche;
        this.acompanhamento = builder.acompanhamento;
        this.bebida = builder.bebida;
        this.brinquedo = builder.brinquedo;
        this.desconto = builder.desconto;
    }

    public void exibir() {
        System.out.println("Pedido:");
        System.out.println("Sanduíche: " + sanduiche);
        System.out.println("Acompanhamento: " + acompanhamento);
        System.out.println("Bebida: " + bebida);
        System.out.println("Brinquedo: " + (brinquedo != null ? brinquedo : "Nenhum"));
        System.out.println("Desconto: " + desconto);
    }

    public static class Builder {
        private String sanduiche;
        private String acompanhamento;
        private String bebida;
        private String brinquedo;
        public float desconto;

        public Builder sanduiche(String sanduiche) {
            this.sanduiche = sanduiche;
            return this;
        }

        public Builder acompanhamento(String acompanhamento) {
            this.acompanhamento = acompanhamento;
            return this;
        }

        public Builder bebida(String bebida) {
            this.bebida = bebida;
            return this;
        }

        public Builder brinquedo(String brinquedo) {
            this.brinquedo = brinquedo;
            return this;
        }

        public Builder desconto(float desconto) {
            this.desconto = desconto;
            return this;
        }

        public Pedido build() {
            if (this.sanduiche == null
            && this.acompanhamento == null
            && this.bebida == null
            && this.brinquedo == null) {
                throw new RuntimeException("Sanduiche, acompanhamento, or bebida should be provided");
            }
            return new Pedido(this);
        }
    }
}