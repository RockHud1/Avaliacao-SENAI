
public class Main {

  
    public static void main(String[] args) {
       Juridica juridica1 = new Juridica("21313218", "354651651", 1231, "Hudson", "7194455954", "asudnaj@gmail.com", new Endereco("rua da alma", "8", "abc", "405165-545", "Salvador", UnidadeFederativa.ACRE));
       
        System.out.println(juridica1.toString());
    
        Cliente cliente1 = new Cliente(21321, 32, Genero.FEMININO, 123156, "Mary", "5465-5456", "adja@mail.com", new Endereco("rua da alma", "8", "abc", "405165-545", "Salvador", UnidadeFederativa.ACRE));
         
        System.out.println(cliente1.toString());
    
        Engenheiro funcionario1 = new Engenheiro("2316545", "1234651", "65465451", "165465", 3000.0, 22, Genero.FEMININO, 32, "Thayla", "4544-5465", "asjdha@mail.com", new Endereco("rua da alma", "8", "abc", "405165-545", "Salvador", UnidadeFederativa.ACRE));
        
        Medico funcionario2 = new Medico("2316545", "1234651", "65465451", "165465", 3000.0, 22, Genero.FEMININO, 32, "Thayla", "4544-5465", "asjdha@mail.com", new Endereco("rua da alma", "8", "abc", "405165-545", "Salvador", UnidadeFederativa.ACRE));
    
        Advogado funcionario3 = new Advogado("2316545", "1234651", "65465451", "165465", 3000.0, 22, Genero.FEMININO, 32, "Thayla", "4544-5465", "asjdha@mail.com", new Endereco("rua da alma", "8", "abc", "405165-545", "Salvador", UnidadeFederativa.ACRE));   
       
        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
    }
    
}
