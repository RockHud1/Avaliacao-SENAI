
public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, Double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, Setor.ENGENHARIA, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crea = crea;
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
                "\nCREA: "+ this.crea;
    }


    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    
}
