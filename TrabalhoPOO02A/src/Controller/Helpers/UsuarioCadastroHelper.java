package Controller.Helpers;

import Model.Usuario;
import View.cadastroUser;

/**
 *
 * @author mathe
 */
public class UsuarioCadastroHelper implements IHelper{
    
    private final cadastroUser view;

    public UsuarioCadastroHelper(cadastroUser view) {
        this.view = view;
    }
    
    public void setarModelo(Usuario usuario){
        String nome = usuario.getNome();
        String ender = usuario.getEnder();
        String cpf = usuario.getCpf();
        String tipoUser = usuario.getTipoUser();
        view.getTextName().setText(nome);
        view.getTextEnder().setText(ender);
        view.getTextCPF().setText(cpf);
        view.getTextTipo().setText(tipoUser);
    }
    
    @Override
    public Usuario obterModelo(){
        String id = view.getTextId().getText();
        String nome = view.getNomeText().getText();
        String ender = view.getTextEnder().getText();
        String cpf = view.getTextCPF().getText();
        String tipoUser = view.getTextTipo().getText();
        Usuario usuario = new Usuario(id, nome, ender, cpf, tipoUser);
       
        return usuario;
    }
    
    @Override
    public void limparTela(){
        view.getTextId().setText("");
        view.getNomeText().setText("");
        view.getTextEnder().setText("");
        view.getTextCPF().setText("");
        view.getTextTipo().setText("");
        view.getTextDataCad().setText("");
    }
}
