import java.util.Scanner;
public class CriaParametro {
    
    private Scanner scanner;

    public CriaParametro(){

        scanner = new Scanner(System.in);
    }

    public String CriandoParametroString(String mensagem){

        System.out.print(mensagem);
        return scanner.next();

    }

    public int CriandoParametroInt(String mensagem ){

        int numero = 0 ;
        while(true){
            System.out.print(mensagem);
            if (scanner.hasNextInt()){
                numero = scanner.nextInt();
                break;

            }else{
                System.out.println("Por favor digite um número!");            
                scanner.nextLine();
            }
        }
        return numero;
    }

    public double CriandoParametroDouble(String mensagem){
        double numero = 0.0;
        while(true){
            System.out.print(mensagem);
            if (scanner.hasNextDouble()){
                numero = scanner.nextDouble();
                break;
            }else{
                System.out.println("Por favor digite um número!");
                scanner.nextLine();
            }
            
        }
        return numero;
    }
}

