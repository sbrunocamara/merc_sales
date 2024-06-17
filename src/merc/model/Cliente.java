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
    
    public Integer insert(ClienteClasse cliente){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into cliente (nome,e_mail,telefone,cpf) values (?,?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pStatement.setString(1,cliente.getNome());
           pStatement.setString(2,cliente.getE_mail());
           pStatement.setString(3,cliente.getTelefone());
           pStatement.setString(4,cliente.getCpf());
           
         boolean insert = pStatement.execute();
          int id;
          
        ResultSet rs = pStatement.getGeneratedKeys(); 
        if (rs.next()) { 
            id = rs.getInt(1); 
          return id;
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
       
       return 0;
       
       
    }
    
    public ArrayList<ClienteClasse> select(){
        
        String sql = "select cliente.id,cliente.nome,cliente.e_mail,cliente.telefone,cliente.cpf,endereco.descricao as endereco,endereco.cep as cep,endereco.id as endereco_id from cliente\n" +
"inner join cliente_endereco ON cliente.id = cliente_endereco.cliente_id\n" +
"inner join endereco on endereco.id = cliente_endereco.endereco_id";
        
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
                   clienteObjeto.setE_mail(clientesSelect.getString("e_mail"));
                   clienteObjeto.setTelefone(clientesSelect.getString("telefone"));
                   clienteObjeto.setId(clientesSelect.getInt("id"));
                   clienteObjeto.setCpf(clientesSelect.getString("cpf"));
                   clienteObjeto.setEndereco(clientesSelect.getString("endereco"));
                   clienteObjeto.setCep(clientesSelect.getString("cep"));
                   clienteObjeto.setEndereco_id(clientesSelect.getInt("endereco_id"));
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
          
       return clientes;
        
    }
    
        public ClienteClasse update(ClienteClasse cliente){
        
      String sql = "UPDATE cliente SET nome = ?, e_mail = ?, telefone = ?, cpf = ? WHERE cliente.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,cliente.getNome());
           pStatement.setString(2,cliente.getE_mail());
           pStatement.setString(3,cliente.getTelefone());
           pStatement.setString(4,cliente.getCpf());
           pStatement.setInt(5,cliente.getId());
              
           
           boolean fornecedoresUpdate = pStatement.execute();
           

   
            return cliente;
       
             
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ClienteClasse returnCliente =  new ClienteClasse();
        
        return returnCliente;
        
        
    }
        
         public boolean remove(ClienteClasse cliente){
        
      String sql = "DELETE FROM cliente WHERE cliente.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,cliente.getId());
           
           
           boolean clienteDelete = pStatement.execute();
           

         if(clienteDelete == false){
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
       
        ClienteClasse returnCliente =  new ClienteClasse();
        
        return false;
        
        
    }
        

    
}
