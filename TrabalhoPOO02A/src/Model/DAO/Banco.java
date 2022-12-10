/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;
import Model.Usuario;
import java.util.ArrayList;


public class Banco {
    
    public static ArrayList<Usuario> usuario;
    
    
    public static void inicia(){
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
    }
   
    
    
}
