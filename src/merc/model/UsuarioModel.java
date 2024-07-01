/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import merc.Classes.UsuarioClasse;
import java.sql.Connection;
import java.sql.ResultSet;
import merc.Classes.FornecedorClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class UsuarioModel {
    
     public boolean insert(UsuarioClasse usuario){
        
         PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into usuarios (nome,email,senha,situacao) values (?,?,MD5(?),?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,usuario.getNome());
           pStatement.setString(2,usuario.getEmail());
           pStatement.setString(3,usuario.getSenha());
           pStatement.setString(4,usuario.getSituacao());
           
          boolean insert = pStatement.execute();
  
  
              
          
       }catch(SQLException e){
            e.printStackTrace();
           
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
       return true;
       
       
    }
    
    public ArrayList<UsuarioClasse> select(){
        
        String sql = "select id,nome,email,situacao from usuarios";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<UsuarioClasse> usuarios = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet usuariosSelect = pStatement.executeQuery(sql);
           
           if(usuariosSelect != null){
               usuarios =  new ArrayList<>();
               
               while(usuariosSelect.next()){
                   UsuarioClasse usuarioObjeto = new UsuarioClasse();
                   usuarioObjeto.setNome(usuariosSelect.getString("nome"));
                   usuarioObjeto.setEmail(usuariosSelect.getString("email"));
                   usuarioObjeto.setSituacao(usuariosSelect.getString("situacao"));
                   usuarioObjeto.setId(usuariosSelect.getInt("id"));
                   usuarios.add(usuarioObjeto);
               } 
           }
           
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
          
       return usuarios;
        
    }
        public UsuarioClasse autenticaUsuario(String email, String senha){
        
        String sql = "select id,nome,email,situacao,senha from usuarios where email='"+email+"' AND senha=MD5('"+senha+"')";

       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       UsuarioClasse usuario = new UsuarioClasse();
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet usuariosSelect = pStatement.executeQuery(sql);
           
         
           
           if(usuariosSelect.next()){
 
                   usuario.setNome(usuariosSelect.getString("nome"));
                   usuario.setEmail(usuariosSelect.getString("email"));
                   usuario.setSituacao(usuariosSelect.getString("situacao"));
                   usuario.setId(usuariosSelect.getInt("id"));
               
           }
           
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
          
       return usuario;
        
    }
        
    
            public UsuarioClasse update(UsuarioClasse usuario){
 
      String sql = "UPDATE usuarios SET nome = ?, email = ?, senha = MD5(?), situacao = ? WHERE usuarios.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,usuario.getNome());
           pStatement.setString(2,usuario.getEmail());
           pStatement.setString(3,usuario.getSenha());
           pStatement.setString(4,usuario.getSituacao());
           pStatement.setInt(5,usuario.getId());
           
           
           boolean fornecedoresUpdate = pStatement.execute();
           

   
            return usuario;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        UsuarioClasse returnUsuario =  new UsuarioClasse();
        
        return returnUsuario;
        
        
    }
        
         public boolean remove(UsuarioClasse usuario){
        
      String sql = "DELETE FROM usuarios WHERE usuarios.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,usuario.getId());
           
           
           boolean usuarioDelete = pStatement.execute();
          
           

         if(usuarioDelete == false){
          return true;
                  } 
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
         
        return false;
        
        
    }
    
}
