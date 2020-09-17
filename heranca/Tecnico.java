public class Tecnico extends Aluno { //Subclasse Tecnico é uma especialização de Aluno
    
    //atributos
    private String registroProfissional;
    
    //metodos
    public void praticar(){
        System.out.println("Praticando " + this.getCurso());
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}

