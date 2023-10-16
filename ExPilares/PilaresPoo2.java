//escapsulamento
class Feira {
    private String nome;

    public Feira(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //abstração
    public void fazerCompras() {
        System.out.println("Frutas e legumes tem nutrientes.");
    }
}
    //herança
    class Frutas extends Feira {
        public Frutas(String nome) {
            super(nome);
        }

        @Override
        public void fazerCompras() {
            //polimorfismo
            System.out.println("\n" + getNome() + " tem vitamina C!");
        }
    }

    class Legumes extends Feira {
        public Legumes(String nome) {
            super(nome);
        }

        @Override
        public void fazerCompras() {
            System.out.println("\n" + getNome() + " também é rico em vitamina C!");
        }
    }
    public class PilaresPoo2 {
        public static void main(String[] args) {
            Feira feira = new Feira("Feira");
            Frutas frutas = new Frutas("Laranja");
            Legumes legumes = new Legumes("Brócolis");

            feira.fazerCompras();
            frutas.fazerCompras();
            legumes.fazerCompras();
        }
    }