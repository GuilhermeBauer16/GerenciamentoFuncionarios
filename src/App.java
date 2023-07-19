import javax.rmi.ssl.SslRMIClientSocketFactory;

public class App {
    public static void main(String[] args) throws Exception {
        // Conexao conexao = new Conexao();
        while (true){
            System.out.println(titulo("Gerenciamento de funcionarios", 40));
            CriaParametro criaParametro = new CriaParametro();
            String nome = criaParametro.CriandoParametroString("Nome: ");
            double salario = criaParametro.CriandoParametroDouble("Salario: ");
            int idade = criaParametro.CriandoParametroInt("Idade: ");
            String cpf = criaParametro.CriandoParametroString("cpf: ");
            String sexo = criaParametro.CriandoParametroString("Sexo: ");
            String endereco = criaParametro.CriandoParametroString("Endereço: ");
            funcionario funcionario = new funcionario(nome , salario , idade , cpf , sexo , endereco);
            funcionario.mostraFuncionario();
            System.out.println("seu salário com a comição ficou:R$ " + funcionario.GanhoComicao());
    }
    }

    public static String titulo(String mensagem , int numero){
        String linha = "--".repeat(numero);
        return linha + "\n "+ mensagem + "\n" + linha;
    }
}
