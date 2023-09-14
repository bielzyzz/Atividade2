
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome, "Canidae");
    }

    public void descricao() {
        System.out.println("========================================================================================");
        System.out.println(getNome() + ", o Cachorro. É um mamífero quadrúpede da família dos Canídeos (Canidae).");
        System.out.println(getNome() + ", o Cachorro. É um animal muito sociável e carinhoso que gosta de interagir.");
        System.out.println(getNome() + ", o Cachorro. É muito leal ao seu companheiro e tem vínculos emocionais.");
        System.out.println(getNome() + ", o Cachorro. Necessita de exercícios e cuidados com a saúde.");
        emitirSom("au-au");
        System.out.println(getNome() + " é um ótimo animal de estimação!");
        System.out.println("========================================================================================");
    }
}
