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
import merc.Classes.CompraClasse;
import merc.Classes.FornecedorClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class Compra {
    
    public boolean insert(CompraClasse compra){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into compra (data,fornecedor_id) values (?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,compra.getData());
           pStatement.setInt(2,compra.getFornecedor_id());

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
    
    public ArrayList<CompraClasse> select(){
        
        String sql = "select data,nome,fornecedor_id from compra";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<CompraClasse> compras = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet comprasSelect = pStatement.executeQuery(sql);
           
           if(comprasSelect != null){
               compras =  new ArrayList<>();
               
               while(comprasSelect.next()){
                   CompraClasse compraObjeto = new CompraClasse();
                   compraObjeto.setData(comprasSelect.getString("data"));
                   compraObjeto.setFornecedor_id(comprasSelect.getInt("fornecedor_id"));
                   
                    compras.add(compraObjeto);
               
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
          
       return compras;
        
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
