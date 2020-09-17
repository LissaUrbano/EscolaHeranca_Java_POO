public class Bolsista extends Aluno {//Subclasse Bolsista é uma especialização de Aluno
    
    //atributo
    private float bolsa;

    //metodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override // polimorfismo
    public void pagarMensalidade() {
        System.out.println(this.getNome() + "é bolsista! Pagamento facilitado.");
    }

    //setters e getters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
