
public class App {
    public static void main(String[] args) throws Exception {

        CriaParametro criaParametro = new CriaParametro();
        double numero = 0;
        numero = criaParametro.CriandoParametroDouble("Digite um número: ");
        System.out.println("O numero foi " + numero);
        
    }
}
