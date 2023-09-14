public abstract class Animal {
    private String nome;
    private String familia;

    public Animal(String nome, String familia) {
        this.nome = nome;
        this.familia = familia;
    }

    public String getNome() {
        return nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void emitirSom(String som) {
        System.out.println(getNome() + " emite o som: " + som);
    }

    public abstract void descricao();
}