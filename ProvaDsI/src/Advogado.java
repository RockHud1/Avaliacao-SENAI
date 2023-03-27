
public class Advogado extends Funcionario{
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, Double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, Setor.JURIDICO, salario, idade, genero, id, nome, telefone, email, endereco);
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\nNome: "+ super.nome+
                "\nId: "+ super.id+
                "\nTelefone: "+ super.telefone+
                "\nEmail: "+ super.email+
                "\nCpf: "+ super.cpf+
                "\nRG: "+ super.rg+
                "\nMatrícula: "+ super.matricula+
                "\nSetor: "+ super.setor+
                "\nSalário: "+ super.salario+
                "\nIdade: "+ super.idade+
                "\nGenero: "+ super.genero+
                "\nOAB: "+ this.oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    
    
}
