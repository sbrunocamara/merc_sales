/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.FornecedorClasse;
import merc.Classes.UsuarioClasse;
import merc.model.Fornecedor;
import merc.model.UsuarioModel;

/**
 *
 * @author bsbru
 */
public class UsuarioController {
    
        public boolean newUser(String nome, String email, String senha, String situacao){
        

        
        UsuarioClasse usuario = new UsuarioClasse();
        
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setSituacao(situacao);
   
        
        UsuarioModel usuarioModel =  new UsuarioModel();
        
        if(usuarioModel.insert(usuario)){
            return true;
        }else{
            return false;
        }        
        
    }
    
    public  ArrayList<UsuarioClasse> select(){
        
          UsuarioModel usuarioModel =  new UsuarioModel();
          ArrayList<UsuarioClasse> usuarios = null;
          
          try{
             usuarios = usuarioModel.select();
             
        
            return usuarios;
        
             
          }catch(Exception e){

          }
          
         return usuarios;
        
        
    }
    
        public  UsuarioClasse update(UsuarioClasse usuario){
        
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
