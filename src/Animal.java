class Animal {
    //properties
    private String cor;
    private double tamanho;
    private int peso;

    //Constructor
    Animal(){}

    //methods
    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        if (cor.length() >= 3) {
            this.cor = cor;
        } else {
            System.out.println("COR INVALIDA");
        }
    }

    void dormir() {
        System.out.println("Estou dormindo não me acorde Humano");
    }
    void acordar() {
        System.out.println("Querrrrrrrrooooooooo doooooooorrrrrmmmmiiiiirrrr");
    }
}
