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
import merc.Classes.ItemCompraClasse;
import merc.Classes.ItemPedidoClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class ItemPedido {
    
    public Integer insert(ItemPedidoClasse itemPedido){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into item_pedido (pedido_id,produto_id,qtde,valor_item) values (?,?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pStatement.setInt(1,itemPedido.getPedido_id());
           pStatement.setInt(1,itemPedido.getProduto_id());
           pStatement.setInt(3,itemPedido.getQtde());
           pStatement.setInt(4,itemPedido.getValor_item());
           
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
    
    public ArrayList<ItemPedidoClasse> select(){
        
        String sql = "select * from item_pedido";
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ItemPedidoClasse> itemsPedido = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet itemsPedidoSelect = pStatement.executeQuery(sql);
           
           if(itemsPedidoSelect != null){
               itemsPedido =  new ArrayList<>();
               
               while(itemsPedidoSelect.next()){
                   ItemPedidoClasse itemsPedidoObjeto = new ItemPedidoClasse();
                   itemsPedidoObjeto.setId(itemsPedidoSelect.getInt("id"));
                   itemsPedidoObjeto.setPedido_id(itemsPedidoSelect.getInt("pedido_id"));
                   itemsPedidoObjeto.setProduto_id(itemsPedidoSelect.getInt("produto_id"));
                   itemsPedidoObjeto.setQtde(itemsPedidoSelect.getInt("qtde"));
                   itemsPedidoObjeto.setValor_item(itemsPedidoSelect.getInt("valor_item"));
            
                   itemsPedido.add(itemsPedidoObjeto);
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
          
       return itemsPedido;
        
    }
    
       public ArrayList<ItemPedidoClasse> selectPedido(Integer pedidoId){
        
        String sql = "select * from item_pedido where pedido_id = ?";
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ItemPedidoClasse> itemsPedido = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
             pStatement.setInt(1,pedidoId);
           ResultSet itemsPedidoSelect = pStatement.executeQuery(sql);
           
           if(itemsPedidoSelect != null){
               itemsPedido =  new ArrayList<>();
               
               while(itemsPedidoSelect.next()){
                   ItemPedidoClasse itemsPedidoObjeto = new ItemPedidoClasse();
                   itemsPedidoObjeto.setId(itemsPedidoSelect.getInt("id"));
                   itemsPedidoObjeto.setPedido_id(itemsPedidoSelect.getInt("pedido_id"));
                   itemsPedidoObjeto.setProduto_id(itemsPedidoSelect.getInt("produto_id"));
                   itemsPedidoObjeto.setQtde(itemsPedidoSelect.getInt("qtde"));
                   itemsPedidoObjeto.setValor_item(itemsPedidoSelect.getInt("valor_item"));
            
                   itemsPedido.add(itemsPedidoObjeto);
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
          
       return itemsPedido;
        
    }
    
        public ItemPedidoClasse update(ItemPedidoClasse itemPedido){

      String sql = "UPDATE item_pedido SET pedido_id = ?, produto_id = ?, qtde = ?, valor_item = ? WHERE item_pedido.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setInt(1,itemPedido.getPedido_id());
           pStatement.setInt(2,itemPedido.getProduto_id());
           pStatement.setInt(3,itemPedido.getQtde());
           pStatement.setInt(4,itemPedido.getValor_item());
           pStatement.setInt(5,itemPedido.getId());
           

              
           
           boolean itemCompraUpdate = pStatement.execute();
           

   
            return itemPedido;
       
             
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ItemPedidoClasse returnItemPedido =  new ItemPedidoClasse();
        
        return returnItemPedido;
        
        
    }
        
         public boolean remove(ItemPedidoClasse itemPedido){
        
      String sql = "DELETE FROM item_pedido WHERE item_pedido.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,itemPedido.getId());
           
           
           boolean itemCompraDelete = pStatement.execute();
           

         if(itemCompraDelete == false){
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
