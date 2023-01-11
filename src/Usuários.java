import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

//import utils.Utils;

public class Usuários {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "BEM VINDO AO CADASTRO DE USUÁRIOS");
              
       	String nome = JOptionPane.showInputDialog("Digite os dados: "+"\nNome ");
		        
		String login = JOptionPane.showInputDialog("Login desejado ");
                    
		String cargo  = JOptionPane.showInputDialog("Cargo ");
                
		String senha = JOptionPane.showInputDialog("Senha de acesso");
                
        Dados usuario;
        
        usuario = new Dados();
        
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setCargo(cargo);            
      
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        
        usuarios.add(usuario);
                
        JOptionPane.showMessageDialog(null,usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo());
  
     }
}
