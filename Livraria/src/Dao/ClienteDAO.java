/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wagner
 */
public class ClienteDAO {
    private List<Cliente> lista = null;

    public ClienteDAO() {
        lista = new ArrayList<Cliente>();
    }
    
    public void inserirCliente(Cliente cliente)
    {
        lista.add(cliente);
    }
    
}