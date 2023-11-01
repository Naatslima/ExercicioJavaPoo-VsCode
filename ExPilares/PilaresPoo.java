public class PilaresPoo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "Desconhecido", 0, "Não definida");
        Passaro passaro = new Passaro("José", "Papagaio", 2, "Verde");
        Cachorro cachorro = new Cachorro("Brutus", "Bulldog", 4, "Cinza");
        
        System.out.println("Informações do Animal:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Raça: " + animal.getRaca());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Cor: " + animal.getCor());

        System.out.println("\nRGA do Pet:");
        System.out.println("Nome: " + passaro.getNome());
        System.out.println("Raça: " + passaro.getRaca());
        System.out.println("Idade: " + passaro.getIdade() + " anos");
        System.out.println("Cor: " + passaro.getCor());
        
        System.out.println("\nRGA do Pet:");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");
        System.out.println("Cor: " + cachorro.getCor());

        animal.fazerSom();
        passaro.fazerSom();
        cachorro.fazerSom();
    }
}