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
import merc.Classes.ProdutoClasse;
import merc.database.ConnectionDB;

/**
 *
 * @author bsbru
 */
public class Produto {
    
     public Integer insert(ProdutoClasse produto){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into produto (descricao,valor_unitario,qtde_estoque) values (?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
           pStatement.setString(1,produto.getDescricao());
           pStatement.setInt(2,produto.getValor_unitario());
           pStatement.setInt(3,produto.getQtde_estoque());
           
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
        
        String sql = "select id,descricao,valor_unitario,qtde_estoque from produto";
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<ProdutoClasse> produtos = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet produtosSelect = pStatement.executeQuery(sql);
           
           
           
           if(produtosSelect != null){
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
    
        public ProdutoClasse selectById(Integer id){
   
       String sql = "select * from produto where id="+id;
       
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
      ProdutoClasse produto = null;
       
       
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet produtosSelect = pStatement.executeQuery(sql);
           
           
                 if(produtosSelect != null){
              
               
               while(produtosSelect.next()){
               produto.setDescricao(produtosSelect.getString("descricao"));
               produto.setQtde_estoque(produtosSelect.getInt("qtde_estoque"));
               produto.setValor_unitario(produtosSelect.getInt("valor_unitario"));
               produto.setId(produtosSelect.getInt("id"));
              

            
               } 
           }
          
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
          
       return produto;
        
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
         
              public ProdutoClasse decrementaQuantidade(ProdutoClasse produto,Integer quantidade){
                  
   
      String sql = "UPDATE produto SET qtde_estoque = qtde_estoque -"+quantidade+" WHERE produto.id ="+produto.getId();
      


       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     

//           pStatement.setInt(1,produto.getQtde_estoque());
//           pStatement.setInt(2,produto.getId());
           

              
           
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
         
       
    public ProdutoClasse incrementaQuantidade(ProdutoClasse produto,Integer quantidade){

      String sql = "UPDATE produto SET qtde_estoque = qtde_estoque +"+quantidade+" WHERE produto.id ="+produto.getId();
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
              
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
     

//           pStatement.setInt(1,produto.getQtde_estoque());
//           pStatement.setInt(2,produto.getId());
//           

              
           
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
