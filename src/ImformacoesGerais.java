public class ImformacoesGerais {
    private int  idade ;
    private String cpf;
    private String sexo;
    private String endereco;

    public ImformacoesGerais(int idade , String cpf , String sexo , String endereco){
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public ImformacoesGerais(){

    }

    public int getIdade(){
        return this.idade;
        
    }

    public String getCpf(){
        return this.cpf;
        
    }

    public String getSexo(){
        return this.sexo;
        
    }

    public String getEndereco(){
        return this.endereco;
        
    }

    public void setIdade(int idade){
        this.idade = idade; 
    
    }
    public void setCfp(String cpf){
        this.cpf = cpf;
        
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
        
    }   
    public void setEndereco(String endereco){
        this.endereco = endereco;
        
    }   

    public static String ObterCpfUsuario(){
        CriaParametro criaParametro = new CriaParametro();
        String cpf;
        while (true){
        cpf = criaParametro.CriandoParametroString("digite seu CPF: ");
        cpf = cpf.replaceAll("[^0-9]" , "");
        
        if (cpf.length() == 11){
            break;
        }else {
            System.out.println("O CPF deve conter 11 numeros!");
        }
    }
        return cpf ;
    }
        
    
}
