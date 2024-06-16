/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import merc.Classes.EnderecoClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class Endereco {
    
     public boolean insert(EnderecoClasse endereco){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into endereco (descricao,cep) values (?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,endereco.getDescricao());
           pStatement.setString(2,endereco.getCep());

           
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
    
    public ArrayList<EnderecoClasse> select(){
        
        String sql = "select id,descricao,cep from endereco";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<EnderecoClasse> endereco = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet enderecoSelect = pStatement.executeQuery(sql);
           
           if(enderecoSelect != null){
               endereco =  new ArrayList<>();
               
               while(enderecoSelect.next()){
                   EnderecoClasse enderecoObjeto = new EnderecoClasse();
                   enderecoObjeto.setDescricao(enderecoSelect.getString("descricao"));
                   enderecoObjeto.setCep(enderecoSelect.getString("cep"));
                   enderecoObjeto.setId(enderecoSelect.getInt("id"));
 
                   endereco.add(enderecoObjeto);
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
          
       return endereco;
        
    }
    
        public EnderecoClasse update(EnderecoClasse endereco){
        
      String sql = "UPDATE endereco SET descricao = ?, cep = ? WHERE endereco.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,endereco.getDescricao());
           pStatement.setString(2,endereco.getCep());
           pStatement.setInt(3,endereco.getId());
           

           
           
           boolean enderecoUpdate = pStatement.execute();
           

   
            return endereco;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        EnderecoClasse returnEndereco =  new EnderecoClasse();
        
        return returnEndereco;
        
        
    }
        
         public boolean remove(EnderecoClasse endereco){
        
      String sql = "DELETE FROM endereco WHERE endereco.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,endereco.getId());
           
           
           boolean enderecoDelete = pStatement.execute();
           
    
         if(enderecoDelete == false){
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
