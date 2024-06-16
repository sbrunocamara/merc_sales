/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.EnderecoClasse;
import merc.Classes.EnderecoClienteClasse;
import merc.model.Endereco;
import merc.model.EnderecoCliente;


/**
 *
 * @author bsbru
 */
public class EnderecoClienteController {
    
    public boolean newEnderecoCliente(Integer cliente_id, Integer endereco_id){
        

        
        EnderecoClienteClasse enderecoCliente = new EnderecoClienteClasse();
        
        enderecoCliente.setCliente_id(cliente_id);
        enderecoCliente.setEndereco_id(endereco_id);
        
        
        EnderecoCliente enderecoClienteModel =  new EnderecoCliente();
        
        if(enderecoClienteModel.insert(enderecoCliente)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<EnderecoClienteClasse> select(){
        
          EnderecoCliente enderecoClienteModel =  new EnderecoCliente();
          ArrayList<EnderecoClienteClasse> enderecosCliente = null;
          
          try{
             enderecosCliente = enderecoClienteModel.select();
             
        
            return enderecosCliente;
        
             
          }catch(Exception e){

          }
          
         return enderecosCliente;
        
        
    }
    
        
    public  EnderecoClienteClasse update(EnderecoClienteClasse enderecoCliente){
        
        EnderecoCliente enderecoClienteModel =  new EnderecoCliente();
            
          
          try{
              
            EnderecoClienteClasse update = enderecoClienteModel.update(enderecoCliente);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return enderecoCliente;
        
        
    }
    
    public boolean remove(EnderecoClienteClasse enderecoCliente){
        
         EnderecoCliente enderecoClienteModel =  new EnderecoCliente();
 
  
              
            boolean remove = enderecoClienteModel.remove(enderecoCliente);
             
        
            return remove;
        
            
          
        
    }

    
}
