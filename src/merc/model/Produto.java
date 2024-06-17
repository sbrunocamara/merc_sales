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
import merc.Classes.ItemPedidoClasse;
import merc.Classes.PedidoClasse;
import merc.Classes.ProdutoClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class Produto {
    
     public Integer insert(ProdutoClasse pedido){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into pedido (descricao,valor_unitario,qtde_estoque) values (?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pStatement.setString(1,pedido.getDescricao());
           pStatement.setInt(1,pedido.getValor_unitario());
           pStatement.setInt(3,pedido.getQtde_estoque());
           
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
    
    public ArrayList<ProdutoClasse> select(){
        
        String sql = "select * from produto";
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ProdutoClasse> produtos = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet produtosSelect = pStatement.executeQuery(sql);
           
           if(produtos != null){
               produtos =  new ArrayList<>();
               
               while(produtosSelect.next()){
                   ProdutoClasse produtosObjeto = new ProdutoClasse();
                   produtosObjeto.setId(produtosSelect.getInt("id"));
                   produtosObjeto.setDescricao(produtosSelect.getString("descricao"));
                   produtosObjeto.setValor_unitario(produtosSelect.getInt("valor_unitario"));
                   produtosObjeto.setQtde_estoque(produtosSelect.getInt("qtde_estoque"));
            
                   produtos.add(produtosObjeto);
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
          
       return produtos;
        
    }
    
        public ProdutoClasse update(ProdutoClasse produto){

      String sql = "UPDATE produto SET descricao = ?, valor_unitario = ?, qtde_estoque = ? WHERE produto.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
           pStatement.setString(1,produto.getDescricao());
           pStatement.setInt(2,produto.getValor_unitario());
           pStatement.setInt(3,produto.getQtde_estoque());
           pStatement.setInt(4,produto.getId());
           

              
           
           boolean produtoUpdate = pStatement.execute();
           

   
            return produto;
       
             
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ProdutoClasse returnProduto =  new ProdutoClasse();
        
        return returnProduto;
        
        
    }
        
         public boolean remove(ProdutoClasse produto){
        
      String sql = "DELETE FROM produto WHERE produto.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     
        
           pStatement.setInt(1,produto.getId());
           
           
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
         
              public ProdutoClasse decrementaQuantidade(ProdutoClasse produto){

      String sql = "UPDATE produto SET qtde_estoque = qtde_estoque - ? WHERE produto.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     

           pStatement.setInt(1,produto.getQtde_estoque());
           pStatement.setInt(2,produto.getId());
           

              
           
           boolean produtoUpdate = pStatement.execute();
           

   
            return produto;
       
             
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ProdutoClasse returnProduto =  new ProdutoClasse();
        
        return returnProduto;
        
        
    }
         
       
    public ProdutoClasse incrementaQuantidade(ProdutoClasse produto){

      String sql = "UPDATE produto SET qtde_estoque = qtde_estoque + ? WHERE produto.id = ?";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     

           pStatement.setInt(1,produto.getQtde_estoque());
           pStatement.setInt(2,produto.getId());
           

              
           
           boolean produtoUpdate = pStatement.execute();
           

   
            return produto;
       
             
       }catch(SQLException e){
            e.printStackTrace();
       }finally{
           try{
           if(pStatement != null){pStatement.close();}
           }catch(SQLException e){
            e.printStackTrace();
           
       }
       }
       
        ProdutoClasse returnProduto =  new ProdutoClasse();
        
        return returnProduto;
        
        
    }

    
}
