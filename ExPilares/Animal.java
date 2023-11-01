//escapsulamento
class Animal {
    private String nome;
    private String raca;
    private int idade;
    private String cor;

    public Animal(String nome, String raca, int idade, String cor) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    public int getIdade() {
        return idade;
    }
    public String getCor() {
        return cor;
    }

    //abstração
    public void fazerSom() {
        System.out.println("\nTodos os animais fazem sons.");
    }
}
