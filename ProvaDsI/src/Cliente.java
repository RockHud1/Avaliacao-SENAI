
public class Cliente extends Fisica{
    private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(idade, genero, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\nNome: "+ super.nome+
                "\nId: "+ super.id+
                "\nTelefone: "+ super.telefone+
                "\nemail: "+ super.email+
                "\nProtocolo de Atendimento: "+ this.protocoloAtendimento;  
    }



    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
}
