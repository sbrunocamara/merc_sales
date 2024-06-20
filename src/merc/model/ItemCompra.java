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
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class ItemCompra {
    
    public Integer insert(ItemCompraClasse itemCompra){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into item_compra (compra_id,produto_id,qtde,valor) values (?,?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pStatement.setInt(1,itemCompra.getCompra_id());
           pStatement.setInt(2,itemCompra.getProduto_id());
           pStatement.setInt(3,itemCompra.getQtde());
           pStatement.setInt(4,itemCompra.getValor());
           
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
    
    public ArrayList<ItemCompraClasse> select(){
        
        String sql = "select * from item_compra";
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ItemCompraClasse> itemsCompra = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet itemsCompraSelect = pStatement.executeQuery(sql);
           
           if(itemsCompraSelect != null){
               itemsCompra =  new ArrayList<>();
               
               while(itemsCompraSelect.next()){
                   ItemCompraClasse itemsCompraObjeto = new ItemCompraClasse();
                   itemsCompraObjeto.setId(itemsCompraSelect.getInt("id"));
                   itemsCompraObjeto.setCompra_id(itemsCompraSelect.getInt("compra_id"));
                   itemsCompraObjeto.setProduto_id(itemsCompraSelect.getInt("produto_id"));
                   itemsCompraObjeto.setQtde(itemsCompraSelect.getInt("qtde"));
                   itemsCompraObjeto.setValor(itemsCompraSelect.getInt("valor"));
            
                   itemsCompra.add(itemsCompraObjeto);
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
          
       return itemsCompra;
        
    }
    
    public ArrayList<ItemCompraClasse> selectCompra(Integer compraId){
        
       String sql = "select item_compra.id,item_compra.compra_id,item_compra.produto_id,item_compra.qtde,item_compra.valor, produto.descricao as produto_descricao,produto.valor_unitario as produto_un from item_compra inner join produto on produto.id = item_compra.produto_id where item_compra.compra_id ="+compraId;
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ItemCompraClasse> itemsCompra = null;
       
           
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
//           pStatement.setInt(1,compraId);
           ResultSet itemsCompraSelect = pStatement.executeQuery(sql);
       ;
           if(itemsCompraSelect != null){
               itemsCompra =  new ArrayList<>();
               
               while(itemsCompraSelect.next()){
                   ItemCompraClasse itemsCompraObjeto = new ItemCompraClasse();
                   itemsCompraObjeto.setId(itemsCompraSelect.getInt("id"));
                   itemsCompraObjeto.setCompra_id(itemsCompraSelect.getInt("compra_id"));
                   itemsCompraObjeto.setProduto_id(itemsCompraSelect.getInt("produto_id"));
                   itemsCompraObjeto.setQtde(itemsCompraSelect.getInt("qtde"));
                   itemsCompraObjeto.setValor(itemsCompraSelect.getInt("valor"));
                    itemsCompraObjeto.setValorUn(itemsCompraSelect.getInt("produto_un"));
                   itemsCompraObjeto.setNome_produto(itemsCompraSelect.getString("produto_descricao"));
                   
            
                   itemsCompra.add(itemsCompraObjeto);
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
          
       return itemsCompra;
        
    }
    
        public ItemCompraClasse update(ItemCompraClasse itemCompra){
        
      String sql = "UPDATE item_compra SET compra_id = ?, produto_id = ?, qtde = ?, valor = ? WHERE item_compra.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
            System.out.println(itemCompra.getQtde());
            System.out.println(itemCompra.getValorUn());
            System.out.println(itemCompra.getQtde()*itemCompra.getValorUn());
            
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setInt(1,itemCompra.getCompra_id());
           pStatement.setInt(2,itemCompra.getProduto_id());
           pStatement.setInt(3,itemCompra.getQtde());
           pStatement.setInt(4,itemCompra.getQtde()*itemCompra.getValorUn());
           pStatement.setInt(5,itemCompra.getId());

              
           
           boolean itemCompraUpdate = pStatement.execute();
           

   
            return itemCompra;
       
             
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ItemCompraClasse returnItemCompra =  new ItemCompraClasse();
        
        return returnItemCompra;
        
        
    }
        
         public boolean remove(ItemCompraClasse itemCompra){
        
      String sql = "DELETE FROM item_compra WHERE item_compra.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,itemCompra.getId());
           
           
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
