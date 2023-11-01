//herança
    class Passaro extends Animal {
        public Passaro(String nome, String raca, int idade, String cor) {
            super(nome, raca, idade, cor);
        }

        @Override
        public void fazerSom() {
            //polimorfismo
            System.out.println("\nO passaro " + getNome() + " fala, dá o pé Louro!!");
        }
    }