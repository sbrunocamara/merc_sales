/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.Classes;

import java.util.ArrayList;

/**
 *
 * @author bsbru
 */
public class ClienteClasse {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<EnderecoClienteClasse> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<EnderecoClienteClasse> enderecos) {
        this.enderecos = enderecos;
    }
    
    private Integer id;
    private String nome;
    private String e_mail;
    private String cpf;
    private String telefone;
    private ArrayList<EnderecoClienteClasse> enderecos;


    
}
