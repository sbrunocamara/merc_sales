/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.ClienteClasse;
import merc.Classes.FornecedorClasse ;
import merc.model.Cliente;
import merc.model.Fornecedor;

/**
 *
 * @author bsbru
 */
public class ClienteController {
    
    public boolean newCliente(String nome, String email, String telefone, String cpf){
        

        
        ClienteClasse cliente = new ClienteClasse();
        
        cliente.setNome(nome);
        cliente.setE_mail(email);
        cliente.setTelefone(telefone);
        cliente.setCpf(cpf);
        
        
        Cliente clienteModel =  new Cliente();
        
        if(clienteModel.insert(cliente)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<ClienteClasse> select(){
        
          Cliente clienteModel =  new Cliente();
          ArrayList<ClienteClasse> clientes = null;
          
          try{
             clientes = clienteModel.select();
             
        
            return clientes;
        
             
          }catch(Exception e){

          }
          
         return clientes;
        
        
    }
    
        
    public  ClienteClasse update(ClienteClasse cliente){
        
         Cliente clienteModel =  new Cliente();
            
          
          try{
              
            ClienteClasse update = clienteModel.update(cliente);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return cliente;
        
        
    }
    
    public boolean remove(ClienteClasse cliente){
        
             Cliente clienteModel =  new Cliente();
 
  
              
            boolean remove = clienteModel.remove(fornecedor);
             
        
            return remove;
        
            
          
        
    }

    
}
