package Dao;

import java.util.ArrayList;
import java.util.List;
import Model.Cliente;
import Model.Venda;


public class VendaDAO {
    private List<Venda> lista = null;

    public VendaDAO() {
        lista = new ArrayList<Venda>();
    }
    
    public void inserirVenda(Venda venda)
    {
        lista.add(venda);
    }
    
    public Venda buscarVenda(int numero)
    {
        Venda v = null;
        for(Venda venda: lista)
        {
            if(venda.getNumero() == numero)
                v = venda;
        }
        
        return v;
    }
    
    public void removerVenda(int numero)
    {
        Venda venda = buscarVenda(numero);
        if(venda != null)
        {
            lista.remove(venda);
        }
    }
    
    public void alterarVenda(int numero)
    {
        Venda venda = buscarVenda(numero);
        if(venda != null)
        {
            int pos = lista.indexOf(venda);
            lista.set(pos, venda);
        }
    }
    
    public List<Venda> todosVendas()
    {
        return lista;
    }
    
    
}
