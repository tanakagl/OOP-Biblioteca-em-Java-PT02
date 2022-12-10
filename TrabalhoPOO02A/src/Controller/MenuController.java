
package Controller;

import Model.DAO.Banco;
import View.buscaUsuario;
import View.cadastroLivro;
import View.cadastroUser;
import View.comprarLivro;
import View.menu;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class MenuController {
    
    private final menu view;

    public MenuController(menu view) {
        this.view = view;
    }
    
        public void navegarParaCadastroUser(){
        cadastroUser cadUser = new cadastroUser();
        cadUser.setVisible(true);
    }
        public void navegarParaCadastroLivro(){
        cadastroLivro cadLivro = new cadastroLivro();
        cadLivro.setVisible(true);
    }
        public void navegarParaComprarLivro(){
        comprarLivro compLivro = new comprarLivro();
        compLivro.setVisible(true);
    }
        public void navegarBuscarUser(){
        buscaUsuario buscaUser = new buscaUsuario();
        buscaUser.setVisible(true);
        }
       
        }
