
public enum Genero {
    MASCULINO ('M', "Masculino"),
    FEMININO ('F', "Feminino");
    
    protected char valor;
    protected String texto;

    private Genero(char valor, String texto) {
        this.valor = valor;
        this.texto = texto;
    }
    

    private Genero(char valor) {
        this.valor = valor;
    }

    public char getValor() {
        return valor;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
