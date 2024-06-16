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
import merc.Classes.FornecedorClasse;
import merc.database.ConnectionDB;


/**
 *
 * @author bsbru
 */
public class Fornecedor {
   
    
    public boolean insert(FornecedorClasse fornecedor){
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       String sql = "insert into fornecedor (nome,email,telefone,cnpj) values (?,?,?,?)";
       
       try{
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           pStatement.setString(1,fornecedor.getNome());
           pStatement.setString(2,fornecedor.getEmail());
           pStatement.setString(3,fornecedor.getTelefone());
           pStatement.setString(4,fornecedor.getCnpj());
           
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
    
    public ArrayList<FornecedorClasse> select(){
        
        String sql = "select id,nome,email,telefone,cnpj from fornecedor";
        
       PreparedStatement pStatement =  null;
       Connection connection = null;
       
       ArrayList<FornecedorClasse> fornecedores = null;
       
       try{
           
           connection = new ConnectionDB().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet fornecedoresSelect = pStatement.executeQuery(sql);
           
           if(fornecedoresSelect != null){
               fornecedores =  new ArrayList<>();
               
               while(fornecedoresSelect.next()){
                   FornecedorClasse fornecedorObjeto = new FornecedorClasse();
                   fornecedorObjeto.setNome(fornecedoresSelect.getString("nome"));
                   fornecedorObjeto.setEmail(fornecedoresSelect.getString("email"));
                   fornecedorObjeto.setTelefone(fornecedoresSelect.getString("telefone"));
                   fornecedorObjeto.setId(fornecedoresSelect.getInt("id"));
                   fornecedorObjeto.setCnpj(fornecedoresSelect.getString("cnpj"));
                   fornecedores.add(fornecedorObjeto);
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
