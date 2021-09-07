/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author david
 */
public class Produto {
    private String descricao = null;
    private String estoque = null;
    private String ativo = null;
    private String custo = null;
    private String valor = null;  

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the estoque
     */
    public String getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the custo
     */
    public String getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(String custo) {
        this.custo = custo;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Produto(String descricao, String estoque, String ativo, String custo, String valor){
        setDescricao(descricao);
        setEstoque(estoque);
        setAtivo(ativo);
        setCusto(custo);
        setValor(valor);
        
    }
    public String toString(){
      String ret = null;
      ret = "Descrição.:  [" + getDescricao() + "]\n" +
            "Estoque...:  [" + getEstoque() + "]\n" +
            "Ativo.....:  [" + getAtivo() + "]\n" +
            "Custo.....:  [" + getCusto() + "]\n" +
            "Valor.....:  [" + getValor() + "]\n";
      return ret;
    }
    
    
}
