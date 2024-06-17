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
public class CompraClasse {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getFornecedor_id() {
        return fornecedor_id;
    }

    public void setFornecedor_id(Integer fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public ArrayList<ItemCompraClasse> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemCompraClasse> items) {
        this.items = items;
    }
    
    private Integer id;
    private String data;
    private Integer fornecedor_id;
    private String nomeFornecedor;
    private ArrayList<ItemCompraClasse> items;
    
}
