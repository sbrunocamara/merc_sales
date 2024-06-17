/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.ClienteClasse;
import merc.Classes.EnderecoClasse;
import merc.Classes.EnderecoClienteClasse;
import merc.Classes.FornecedorClasse ;
import merc.model.Cliente;
import merc.model.Fornecedor;

/**
 *
 * @author bsbru
 */
public class ClienteController {
            

        public boolean newCliente(String nome, String email, String telefone, String cpf,String endereco, String cep){
        

        ClienteClasse cliente = new ClienteClasse();
        
        cliente.setNome(nome);
        cliente.setE_mail(email);
        cliente.setTelefone(telefone);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setCep(cep);
        
        
        Cliente clienteModel =  new Cliente();
        Integer clienteInsert = clienteModel.insert(cliente);
        
        
        if(clienteInsert > 0){
            
            boolean insertEndereco = this.newEndereco(endereco,cep,clienteInsert);
            
            if(clienteInsert > 0 && insertEndereco == true ){
                    return true;
            }
            
           
        
        }else{
            return false;
        }        
         return false;
    }
        
    public boolean newEndereco(String endereco, String cep,Integer id){
        
        ClienteClasse cliente = new ClienteClasse();
        
 
        cliente.setEndereco(endereco);
        cliente.setCep(cep);
        cliente.setId(id);
        
        EnderecoController enderecoController =  new EnderecoController();
        Integer insert = enderecoController.newEndereco(cliente.getEndereco(),cliente.getCep());
        
        
        
        if(insert > 0){
            
          EnderecoClienteController enderecoClienteController = new EnderecoClienteController();
          Boolean insertEnderecoCliente = enderecoClienteController.newEnderecoCliente(cliente.getId(), insert);
          
            if(insert > 0 && insertEnderecoCliente == true){
                
                return true;
            
        }
            
        }
        
        return false;
        
      
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
            
             ClienteClasse clienteReturn = new ClienteClasse();
            
            if(update.getId() != 0){
                
                System.out.println(cliente.getEndereco());
                System.out.println(cliente.getEndereco_id());
                
              EnderecoClasse updateEndereco = this.updateEndereco(cliente.getEndereco(), cliente.getCep(), cliente.getEndereco_id());
              
             clienteReturn.setEndereco(updateEndereco.getDescricao());
             clienteReturn.setCep(updateEndereco.getCep());
             clienteReturn.setEndereco_id(updateEndereco.getId());
                
            }
            
                      
            
            clienteReturn.setCep(cliente.getCep());
            clienteReturn.setCpf(cliente.getCpf());
            clienteReturn.setE_mail(cliente.getE_mail());
            clienteReturn.setNome(cliente.getNome());
            clienteReturn.setTelefone(cliente.getTelefone());
     
            
             
        
            return update;
            
            
            
            
        
             
          }catch(Exception e){

          }
          
         return cliente;
        
        
    }
    
    public EnderecoClasse updateEndereco(String descricao, String cep,Integer id){
        
         EnderecoClasse endereco = new EnderecoClasse();
        
 
        endereco.setDescricao(descricao);
        endereco.setCep(cep);
        endereco.setId(id);

        
        EnderecoController enderecoController =  new EnderecoController();
        EnderecoClasse update = enderecoController.update(endereco);
        
        
              
        return update;
        
    }
    
    public boolean remove(ClienteClasse cliente){
                

            Boolean removeAssosiation = this.removeAssosiation(cliente.getEndereco_id());
  
            
            if(removeAssosiation == true){
                
               Cliente clienteModel =  new Cliente();
            
         boolean remove = clienteModel.remove(cliente);         
      
           return remove;
                
            }else{
                return false;
            }
 
     
    }
    
    public boolean removeAssosiation(Integer id){
        
        EnderecoClienteClasse enderecoClienteClasse = new EnderecoClienteClasse();
        enderecoClienteClasse.setId(id);
        
          EnderecoClienteController enderecoCliente =  new EnderecoClienteController();
           Boolean removeAssosiation = enderecoCliente.remove(enderecoClienteClasse);
            
            return removeAssosiation;
        
    }

    
}
