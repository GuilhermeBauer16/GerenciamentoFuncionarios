public class gerente extends funcionario {
    private int senha = 8888; 

    
    public  boolean TestaSenha(int senha){
        
        if (this.senha == senha){
            System.out.println("Acesso para criação ou visualização de gerentes consedida" );
            return true;
        }else{
            System.out.println("A senha digitada esta errada!");
            return false;
        }
            
    
    }

    @Override
    public void mostraFuncionario(){
        super.mostraFuncionario();
    }
}