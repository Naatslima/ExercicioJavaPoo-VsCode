//herança
    class Cachorro extends Animal {
        public Cachorro(String nome, String raca, int idade, String cor) {
            super(nome, raca, idade, cor);
        }

        @Override
        public void fazerSom() {
            //polimorfismo
            System.out.println("\nO cachorro " + getNome() + " faz au au!!");
        }
    }