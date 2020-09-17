public abstract class Pessoa { //uma classe abstrata não pode ser instanciada(criar um objeto), serve apenas de progenitora(pode ter classes filhas).
    
    //atributo
    private String nome;
    private int idade;
    private String sexo;

    //construtor

    //metodo
    public void fazerAniversario(){
        this.idade++;
    }

    //métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
}
