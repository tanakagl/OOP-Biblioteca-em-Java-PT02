package Controller;

import Model.DAO.Banco;
import View.buscaUsuario;
import javax.swing.JOptionPane;
import Model.Usuario;

/**
 *
 * @author mathe
 */
public class BuscarUsuario {
   
    private final buscaUsuario view;

    public BuscarUsuario(buscaUsuario view) {
        this.view = view;
    }
    
    public void buscarUsuarios(String idString){
    idString = view.getTextIdBusca().getText();
    int id = Integer.parseInt(idString);
    JOptionPane.showMessageDialog(null, Banco.usuario.get(id));
    }
    
}
