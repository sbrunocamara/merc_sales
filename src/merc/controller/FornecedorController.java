/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.FornecedorClasse ;
import merc.model.Fornecedor;

/**
 *
 * @author bsbru
 */
public class FornecedorController {
    
    public boolean newFornecedor(String nome, String email, String telefone, String cnpj){
        

        
        FornecedorClasse fornecedor = new FornecedorClasse();
        
        fornecedor.setNome(nome);
        fornecedor.setEmail(email);
        fornecedor.setTelefone(telefone);
        fornecedor.setCnpj(cnpj);
        
        
        Fornecedor fornecedorModel =  new Fornecedor();
        
        if(fornecedorModel.insert(fornecedor)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<FornecedorClasse> select(){
        
          Fornecedor fornecedorModel =  new Fornecedor();
          ArrayList<FornecedorClasse> fornecedores = null;
          
          try{
             fornecedores = fornecedorModel.select();
             
        
            return fornecedores;
        
             
          }catch(Exception e){

          }
          
         return fornecedores;
        
        
    }
    
        
    public  FornecedorClasse update(FornecedorClasse fornecedor){
        
          Fornecedor fornecedorModel =  new Fornecedor();
            
          
          try{
              
            FornecedorClasse update = fornecedorModel.update(fornecedor);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return fornecedor;
        
        
    }
    
    public boolean remove(FornecedorClasse fornecedor){
        
         Fornecedor fornecedorModel =  new Fornecedor();
 
  
              
            boolean remove = fornecedorModel.remove(fornecedor);
             
        
            return remove;
        
            
          
        
    }

    
}
