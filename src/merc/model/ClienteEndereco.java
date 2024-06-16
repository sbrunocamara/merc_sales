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
import merc.Classes.EnderecoClienteClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class ClienteEndereco {
    
         public boolean insert(EnderecoClienteClasse enderecoCliente){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into cliente_endereco (cliente_id,endereco_id) values (?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setInt(1,enderecoCliente.getCliente_id());
           pStatement.setInt(2,enderecoCliente.getEndereco_id());

           
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
    
    public ArrayList<EnderecoClienteClasse> select(){
        
        String sql = "select * from cliente_endereco";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<EnderecoClienteClasse> enderecoCliente = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet enderecoClienteSelect = pStatement.executeQuery(sql);
           
           if(enderecoClienteSelect != null){
               enderecoCliente =  new ArrayList<>();
               
               while(enderecoClienteSelect.next()){
                   EnderecoClienteClasse enderecoClienteObjeto = new EnderecoClienteClasse();
                   enderecoClienteObjeto.setId(enderecoClienteSelect.getInt("id"));
 
                   enderecoClienteObjeto.setEndereco_id(enderecoClienteSelect.getInt("endereco_id"));
 
                   enderecoClienteObjeto.setCliente_id(enderecoClienteSelect.getInt("cliente_id"));
 
                   enderecoCliente.add(enderecoClienteObjeto);
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
          
       return enderecoCliente;
        
    }
    
        public EnderecoClasse update(EnderecoClienteClasse enderecoCliente){
        
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
        
         public boolean remove(EnderecoClienteClasse enderecoCliente){
        
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
