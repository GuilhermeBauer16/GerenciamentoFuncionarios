
public class App {
    public static void main(String[] args) throws Exception {
        
        CriaParametro criaParametro = new CriaParametro();
        String nome = criaParametro.CriandoParametroString("Nome: ");
        double salario = criaParametro.CriandoParametroDouble("Salario: ");
        int idade = criaParametro.CriandoParametroInt("Idade: ");
        String cpf = criaParametro.CriandoParametroString("cpf: ");
        String sexo = criaParametro.CriandoParametroString("Sexo: ");
        String endereco = criaParametro.CriandoParametroString("Endereço: ");
        System.out.println("O nome digitado foi  " + nome);
        System.out.println("O salario digitado foi " + salario);
        funcionario funcionario = new funcionario(nome , salario , idade , cpf , sexo , endereco);
        System.out.println(funcionario.imformacoesGerais);
        funcionario.mostraFuncionario();
    }
}
