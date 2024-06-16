/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.EnderecoClasse;
import merc.model.Endereco;


/**
 *
 * @author bsbru
 */
public class EnderecoController {
    
    public boolean newEndereco(String descricao, String cep){
        

        
        EnderecoClasse endereco = new EnderecoClasse();
        
        endereco.setDescricao(descricao);
        endereco.setCep(cep);
        
        
        Endereco enderecoModel =  new Endereco();
        
        if(enderecoModel.insert(endereco)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<EnderecoClasse> select(){
        
          Endereco enderecoModel =  new Endereco();
          ArrayList<EnderecoClasse> enderecos = null;
          
          try{
             enderecos = enderecoModel.select();
             
        
            return enderecos;
        
             
          }catch(Exception e){

          }
          
         return enderecos;
        
        
    }
    
        
    public  EnderecoClasse update(EnderecoClasse endereco){
        
          Endereco enderecoModel =  new Endereco();
            
          
          try{
              
            EnderecoClasse update = enderecoModel.update(endereco);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return endereco;
        
        
    }
    
    public boolean remove(EnderecoClasse endereco){
        
         Endereco enderecoModel =  new Endereco();
 
  
              
            boolean remove = enderecoModel.remove(endereco);
             
        
            return remove;
        
            
          
        
    }

    
}
