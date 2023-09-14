
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome, "Felidae");
    }

    public void descricao() {
        System.out.println("==================================================================================================================");
        System.out.println(getNome() + ", o Gato. É um mamífero quadrúpede da família dos Felídeos (Felidae).");
        System.out.println(getNome() + ", o Gato. É um animal independente e consegue passar grandes períodos sozinho.");
        System.out.println(getNome() + ", o Gato. É um animal afetuoso e procura formas de demonstrar carinho aos seus donos.");
        System.out.println(getNome() + ", o Gato. É um animal crepuscular que é mais ativo ao anoitecer/amanhecer e tira sonecas durante o dia.");
        emitirSom("miau miau");
        System.out.println(getNome() + ", o Gato é um ótimo animal de estimação!");
        System.out.println("==================================================================================================================");
    }
}
