/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Giuliano
 */
public class Endereco {
    private String logradouro;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, String complemento, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    
     public Endereco() {
    }
    
}
