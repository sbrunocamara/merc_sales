/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.Classes;

/**
 *
 * @author bsbru
 */
public class ItemCompraClasse {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompra_id() {
        return compra_id;
    }

    public void setCompra_id(Integer compra_id) {
        this.compra_id = compra_id;
    }

    public Integer getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Integer produto_id) {
        this.produto_id = produto_id;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    private Integer id;
    private Integer compra_id;
    private Integer produto_id;
    private Integer qtde;
    private Integer valor;
   
}
