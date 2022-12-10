package Controller;

import Controller.Helpers.UsuarioCadastroHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.cadastroUser;
import java.util.ArrayList;

public class UsuarioCadastro {
    

        private final cadastroUser view;
        private UsuarioCadastroHelper helper;
        
        public UsuarioCadastro(cadastroUser view){
            this.view = view;
            this.helper = new UsuarioCadastroHelper(view);
}
        
     public void atualizaUsuario(){
         UsuarioDAO usuarioDAO = new UsuarioDAO();
//         ArrayList<Usuario> usuarios = usuarioDAO.selectAll();
     }   
   
    public void cadastrarUsuario(){
        Usuario usuario = helper.obterModelo();
        new UsuarioDAO().insert(usuario);
        helper.limparTela();
    }
    
    
}
