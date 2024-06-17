/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.Classes;

/**
 *
 * @author bsbru
 */
public class ProdutoClasse {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Integer valor_unitario) {
        this.valor_unitario = valor_unitario;
    }


    
    private Integer id;
    private String descricao;
    private Integer valor_unitario;

    public Integer getQtde_estoque() {
        return qtde_estoque;
    }

    public void setQtde_estoque(Integer qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }
    private Integer qtde_estoque;
    
    
}
