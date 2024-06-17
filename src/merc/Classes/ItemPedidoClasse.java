/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.Classes;

/**
 *
 * @author bsbru
 */
public class ItemPedidoClasse {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Integer produto_id) {
        this.produto_id = produto_id;
    }

    public Integer getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Integer pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Integer getValor_item() {
        return valor_item;
    }

    public void setValor_item(Integer valor_item) {
        this.valor_item = valor_item;
    }
    
    private Integer id;
    private Integer produto_id;
    private Integer pedido_id;
    private Integer qtde;
    private Integer valor_item;
    
    
}
