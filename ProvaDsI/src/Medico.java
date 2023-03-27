
public class Medico extends Funcionario{
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, Double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, Setor.SAUDE, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crm = crm;
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
                "\nCRM: "+ this.crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
}
