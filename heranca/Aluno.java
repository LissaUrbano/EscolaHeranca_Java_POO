public class Aluno extends Pessoa { //Subclasse Aluno é uma especialização de Pessoa

    //atributo
    private String curso;
    private int matricula;

    //construtor

    //metodo
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno");
    }

    //métodos getters e setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
