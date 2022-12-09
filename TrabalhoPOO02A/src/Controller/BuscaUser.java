package Controller;

import View.menu;

public class BuscaUser {

        private final menu view;
        
        public BuscaUser(menu view){
            this.view = view;
}
    public void cadastrarUsuario(){
      String nome;
            nome = view.getName().getText();
    }    
        
        
        
        
   public void buscarUsuario(){
      this.view.exibirMensagem("Insira o usuário que deseja buscar");
   }   
     
    
}
