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
public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private String estadoCivil;
    private Endereco endereco;

    public Cliente(String cpf, String nome, String telefone, String email, String estadoCivil, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }
    
    
}
