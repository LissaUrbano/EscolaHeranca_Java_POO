public class Professor extends Pessoa{
    
    //atributo
    private String especialidade;
    private int salario;

    //construtor

    //metodo
    public void receberAumento(int aumento){
        this.salario += aumento;
    }

    //getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
    }

}
