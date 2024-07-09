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
    
        public  ArrayList<UsuarioClasse> selectName(String nome){
        
          UsuarioModel usuarioModel =  new UsuarioModel();
          ArrayList<UsuarioClasse> usuarios = null;
          
          try{
             usuarios = usuarioModel.selectName(nome);
             
        
            return usuarios;
        
             
          }catch(Exception e){

          }
          
         return usuarios;
        
        
    }
    
        public  UsuarioClasse autenticaUsuario(String email, String senha){
        
          UsuarioModel usuarioModel =  new UsuarioModel();
          UsuarioClasse usuarios = null;
          
          try{
             usuarios = usuarioModel.autenticaUsuario(email,senha);
             
        
            return usuarios;
        
             
          }catch(Exception e){

          }
          
         return usuarios;
        
        
    }
    
        public  UsuarioClasse update(UsuarioClasse usuario){
        
          UsuarioModel usuarioModel =  new UsuarioModel();
            
          
          try{
              
            UsuarioClasse update = usuarioModel.update(usuario);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return usuario;
        
        
    }
    
    public boolean remove(UsuarioClasse usuario){
        
         UsuarioModel usuarioModel =  new UsuarioModel();
 
  
              
            boolean remove = usuarioModel.remove(usuario);
             
        
            return remove;
        
            
          
        
    }  
           
    
    
}
