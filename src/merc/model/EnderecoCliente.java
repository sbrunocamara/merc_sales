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
public class EnderecoCliente {
    
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
    
        public EnderecoClienteClasse update(EnderecoClienteClasse enderecoCliente){
        
      String sql = "UPDATE endereco_cliente SET endereco_id = ?, cliente_id = ? WHERE cliente_endereco.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setInt(1,enderecoCliente.getEndereco_id());
           pStatement.setInt(2,enderecoCliente.getCliente_id());
           pStatement.setInt(3,enderecoCliente.getId());
           

           
           
           boolean enderecoUpdate = pStatement.execute();
           

   
            return enderecoCliente;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        EnderecoClienteClasse returnEndereco =  new EnderecoClienteClasse();
        
        return returnEndereco;
        
        
    }
        
         public boolean remove(EnderecoClienteClasse enderecoCliente){
        
      String sql = "DELETE FROM cliente_endereco WHERE cliente_endereco.endereco_id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,enderecoCliente.getId());
           
           
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
