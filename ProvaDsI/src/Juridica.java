
public class Juridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }


    @Override
    public String toString() {
        return "\nNome: "+ super.nome+
                "\nId: "+ super.id+
                "\nTelefone: "+ super.telefone+
                "\nemail: "+ super.email+
                "\nCnpj: "+ this.cnpj+
                "\nInascrição Estadual: "+ this.inscricaoEstadual;
    }
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
