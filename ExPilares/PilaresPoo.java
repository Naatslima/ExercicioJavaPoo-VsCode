//escapsulamento
class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //abstração
    public void fazerSom() {
        System.out.println("Todos os animais fazem sons.");
    }
}
    //herança
    class Cachorro extends Animal {
        public Cachorro(String nome) {
            super(nome);
        }

        @Override
        public void fazerSom() {
            //polimorfismo
            System.out.println("\nO cachorro " + getNome() + " faz au au!!");
        }
    }

    public class PilaresPoo {
        public static void main(String[] args) {
            Animal animal = new Animal("Animal");
            Cachorro cachorro = new Cachorro("Brutus");

            animal.fazerSom();
            cachorro.fazerSom();
        }
    }