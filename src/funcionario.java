public class funcionario {
    
    private String nome;
    private double salario;
    ImformacoesGerais imformacoesGerais = new ImformacoesGerais() ;

    public funcionario(String nome , double salario ,int idade , String cpf , String sexo , String endereco){
        this.nome = nome;
        this.salario = salario;
        
        imformacoesGerais.setIdade(idade);
        imformacoesGerais.setCfp(cpf);
        imformacoesGerais.setSexo(sexo);
        imformacoesGerais.setEndereco(endereco);
        
    }

    public funcionario(){}

    public  void mostraFuncionario(){
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(imformacoesGerais.getIdade());
        System.out.println(imformacoesGerais.getCpf());
        System.out.println(imformacoesGerais.getSexo());
        System.out.println(imformacoesGerais.getEndereco());
    }
}