import javax.rmi.ssl.SslRMIClientSocketFactory;

public class App {
    public static void main(String[] args) throws Exception {
        // Conexao conexao = new Conexao();
        CriaParametro criaParametro = new CriaParametro();
        while (true){
            System.out.println(titulo("Gerenciamento de funcionarios", 40));
            System.out.println("[1]Novo funcionario");
            System.out.println("[2]Novo Gerente");
            System.out.println("[3]Sair");
            int opcao = criaParametro.CriandoParametroInt("Sua opção: ");
             
            if (opcao == 1) {
                    funcionario funcionario = new funcionario();
                    System.out.println(titulo("Novo funcionario", 40));
                    funcionario.criaFuncionario();
            }else if ( opcao == 2){
                genente gerente = new genente();
                int senha = criaParametro.CriandoParametroInt("Sua senha:");
                if (gerente.TestaSenha(senha)){
                    System.out.println(titulo("Novo gerente", 40));
                    gerente.criaFuncionario();
                }
            }else if( opcao == 3){
                System.out.println("Saindo...");
                Thread.sleep(1000);
                break;
            }
            else{
                    
                  System.out.println("Por favor digite uma opção valida");

                     }
                
            }

            // funcionario.mostraFuncionario();
            // System.out.println("seu salário com a comição ficou:R$ " + funcionario.GanhoComicao());
    }
    public static String titulo(String mensagem , int numero){
        String linha = "--".repeat(numero);
        return linha + "\n "+ mensagem + "\n" + linha;
    }

    }


