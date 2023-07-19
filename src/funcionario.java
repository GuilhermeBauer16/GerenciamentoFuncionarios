public class funcionario  {
    
    private String nome;
    private double salario;
    private double comicao = 0.0 ;
    ImformacoesGerais imformacoesGerais = new ImformacoesGerais() ;

    public void criaFuncionario(){

        CriaParametro criaParametro = new CriaParametro();
        String nome = criaParametro.CriandoParametroString("Nome: ");
        double salario = criaParametro.CriandoParametroDouble("Salario: ");
        int idade = criaParametro.CriandoParametroInt("Idade: ");
        String cpf = criaParametro.CriandoParametroString("cpf: ");
        String sexo = criaParametro.CriandoParametroString("Sexo: ");
        String endereco = criaParametro.CriandoParametroString("Endereço: ");
        this.nome = nome;
        this.salario = salario;
        imformacoesGerais.setIdade(idade);
        imformacoesGerais.setCfp(cpf);
        imformacoesGerais.setSexo(sexo);
        imformacoesGerais.setEndereco(endereco);
        
    }

    public funcionario(){}

    public  void mostraFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário:R$ " + this.salario);
        System.out.println("Idade: " + imformacoesGerais.getIdade());
        System.out.println("Cpf: " + imformacoesGerais.getCpf());
        System.out.println("Sexo: " + imformacoesGerais.getSexo());
        System.out.println("Endereço: " + imformacoesGerais.getEndereco());
        System.out.println();
    }

    public double GanhoComicao(){
        return this.comicao = this.salario + (this.salario * 10) /100 ;
    }
}