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
    
    public Integer insert(CompraClasse compra){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into compra (data,fornecedor_id) values (?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pStatement.setString(1,compra.getData());
           pStatement.setInt(2,compra.getFornecedor_id());

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
    
    public ArrayList<CompraClasse> select(){
        
        String sql = "select compra.id,data,fornecedor_id,fornecedor.nome as fornecedor from compra inner join fornecedor on fornecedor_id = compra.fornecedor_id";
        
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
                   compraObjeto.setNomeFornecedor(comprasSelect.getString("fornecedor"));
                   compraObjeto.setFornecedor_id(comprasSelect.getInt("fornecedor_id"));
                   compraObjeto.setId(comprasSelect.getInt("id"));
                   
                   
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
    
    
    
        public CompraClasse update(CompraClasse compra){
        
      String sql = "UPDATE compra SET data = ?, fornecedor_id = ? WHERE compra.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,compra.getData());
           pStatement.setInt(2,compra.getFornecedor_id());
           pStatement.setInt(3,compra.getId());
           
 ;
           
           
           boolean comprasUpdate = pStatement.execute();
           

   
            return compra;
       
           
  
           
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        CompraClasse returnCompra =  new CompraClasse();
        
        return returnCompra;
        
        
    }
        
         public boolean remove(CompraClasse compra){
        
      String sql = "DELETE FROM compra WHERE compra.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,compra.getId());
           
           
           boolean compraDelete = pStatement.execute();

           

         if(compraDelete == false){
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
