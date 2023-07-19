public class genente extends funcionario {
    private int senha = 8888; 

    public  boolean TestaSenha(int senha){
        
        if (this.senha == senha){
            System.out.println("seja bem vindo!" );
            return true;
        }else{
            System.out.println("A senha digitada esta errada!");
            return false;
        }
            
    
    }
}