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
import merc.Classes.ClienteClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class Cliente {
    
    public boolean insert(ClienteClasse cliente){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into cliente (nome,e_mail,telefone,cpf) values (?,?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,cliente.getNome());
           pStatement.setString(2,cliente.getE_mail());
           pStatement.setString(3,cliente.getTelefone());
           pStatement.setString(4,cliente.getCpf());
           
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
    
    public ArrayList<ClienteClasse> select(){
        
        String sql = "select id,nome,email,telefone,email from cliente";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ClienteClasse> clientes = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet clientesSelect = pStatement.executeQuery(sql);
           
           if(clientesSelect != null){
               clientes =  new ArrayList<>();
               
               while(clientesSelect.next()){
                   ClienteClasse clienteObjeto = new ClienteClasse();
                   clienteObjeto.setNome(clientesSelect.getString("nome"));
                   clienteObjeto.setE_mail(clientesSelect.getString("email"));
                   clienteObjeto.setTelefone(clientesSelect.getString("telefone"));
                   clienteObjeto.setId(clientesSelect.getInt("id"));
                   clienteObjeto.setCpf(clientesSelect.getString("cpf"));
                   clientes.add(clienteObjeto);
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
          
       return fornecedores;
        
    }
    
        public FornecedorClasse update(FornecedorClasse fornecedor){
        
      String sql = "UPDATE fornecedor SET nome = ?, email = ?, telefone = ?, cnpj = ? WHERE fornecedor.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,fornecedor.getNome());
           pStatement.setString(2,fornecedor.getEmail());
           pStatement.setString(3,fornecedor.getTelefone());
           pStatement.setString(4,fornecedor.getCnpj());
           pStatement.setInt(5,fornecedor.getId());
           
           
           boolean fornecedoresUpdate = pStatement.execute();
           

   
            return fornecedor;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        FornecedorClasse returnFornecedor =  new FornecedorClasse();
        
        return returnFornecedor;
        
        
    }
        
         public boolean remove(FornecedorClasse fornecedor){
        
      String sql = "DELETE FROM fornecedor WHERE fornecedor.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,fornecedor.getId());
           
           
           boolean fornecedoresDelete = pStatement.execute();
           
           System.out.println(fornecedoresDelete);
           

         if(fornecedoresDelete == false){
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
       
        FornecedorClasse returnFornecedor =  new FornecedorClasse();
        
        return false;
        
        
    }
        

    
}
