import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Usuários {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "BEM VINDO AO CADASTRO DE USUÁRIOS");
       // System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
        
        //System.out.println("Digite os dados: "+"\nNome ");
		//JOptionPane.showMessageDialog(null, "Digite os dados: "+"\nNome ");
		JOptionPane.showInputDialog("Digite os dados: "+"\nNome ");
		
       // String nome = l.nextLine();
        
        JOptionPane.showInputDialog("Login desejado ");
        
        //String login = l.nextLine();
        
        JOptionPane.showInputDialog("Cargo ");
        
        //String cargo = l.nextLine();
        
        JOptionPane.showInputDialog("Senha de acesso");
        
        //int senha = l.nextInt();
        
        
        Dados usuario;
        
        usuario = new Dados();
        
       // usuario.setNome(nome);
        //usuario.setLogin(login);
        //usuario.setCargo(cargo);
        
        
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        
        usuarios.add(usuario);
        
        //System.out.println(usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo());
        JOptionPane.showMessageDialog(null,usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo());
     }
}
