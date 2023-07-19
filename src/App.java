import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class App {
    public static void main(String[] args) throws Exception {

        LimpaTerminal limpaTerminal = new LimpaTerminal();
        CriaParametro criaParametro = new CriaParametro();
        
        ArrayList <funcionario> listaFuncionario = new ArrayList<funcionario>();
        ArrayList <gerente> listaGenente = new ArrayList<gerente>();

        while (true){

            System.out.println(titulo("Gerenciamento de funcionarios", 40));
            System.out.println("[1]Novo funcionario");
            System.out.println("[2]Novo Gerente");
            System.out.println("[3]Mostra Funcionarios");
            System.out.println("[4]Mostra Gerentes");
            System.out.println("[5]Sair");
            System.out.println(linha(40));
            int opcao = criaParametro.CriandoParametroInt("Sua opção: ");
            limpaTerminal.ApagaTerminal();

            if (opcao == 1) {

                    funcionario funcionarios = new funcionario();
                    System.out.println(titulo("Novo funcionario", 40));
                    funcionarios.criaFuncionario();

                    System.out.println(titulo("Funcionario" ,40)); 
                    funcionarios.mostraFuncionario();
                    System.out.println(linha(40));

                    Thread.sleep(1500);
                    limpaTerminal.ApagaTerminal();
                    
                    listaFuncionario.add(funcionarios);

            }else if ( opcao == 2){

                gerente gerentes = new gerente();
                int senha = criaParametro.CriandoParametroInt("Sua senha: ");
                if (gerentes.TestaSenha(senha)){
                    limpaTerminal.ApagaTerminal();
                    System.out.println(titulo("Novo gerente", 40));
                    gerentes.criaFuncionario();

                    limpaTerminal.ApagaTerminal();

                    System.out.println(titulo("Gerente" ,40)); 
                    gerentes.mostraFuncionario();
                    System.out.println(linha(40));

                    Thread.sleep(1500);
                    limpaTerminal.ApagaTerminal();
                    
                    listaGenente.add(gerentes);
                }
            }else if ( opcao == 3 ){

                System.out.println(titulo("Funcionarios", 40));

                for (funcionario funcionarios : listaFuncionario){
                    funcionarios.mostraFuncionario();
                    System.out.println(linha(40));
                }
                    
            }else if (opcao == 4){

                CriaParametro criaParametros = new CriaParametro();
                
                int senhaMostraGerente = criaParametros.CriandoParametroInt("sua senha: ");
                limpaTerminal.ApagaTerminal();
                System.out.println(titulo("Gerentes", 40));

                for (gerente genente : listaGenente){
                    if (genente.TestaSenha(senhaMostraGerente)) {

                        genente.mostraFuncionario();
                        System.out.println(linha(40));
                    }else{
                        System.out.println("senha incorreta!");
                    }
                }
 
            }else if( opcao == 5){

                System.out.println("Saindo...");
                Thread.sleep(1000);
                break;
            }
            else{
                    
                  System.out.println("Por favor digite uma opção valida");

                     }
                
            }


    }
    public static String titulo(String mensagem , int numero){
        String linha = "--".repeat(numero);
        return linha + "\n "+ mensagem + "\n" + linha;
    }
    public static String linha(int numero){ 
        return "--".repeat(numero);
    }
    }


