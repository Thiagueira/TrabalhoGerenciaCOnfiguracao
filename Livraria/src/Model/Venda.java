
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import javafx.scene.chart.PieChart.Data;


public class Venda {
    
    private static int numero=0;
    private Cliente cliente;
    private List<Item> lista;
    private float valorTotal;
    private Date dataVenda;

    public Venda() 
    {
        numero++;
        lista = new ArrayList<Item>();
        dataVenda = new Date();
        
    }
    
     public void inserirItem (Item item)
    {
        lista.add(item);
    }
    
    public Item buscarItem(int codigo)
    {
        Item it = null;
        for(Item item: lista)
        {
            if(item.getLivro().getCodigo() == codigo)
                it = item;
        }
        
        return it;
    }
    
    public void removerItem(int codigo)
    {
        Item item = buscarItem(codigo);
        if(item != null)
        {
            lista.remove(item);
        }
    }
    
    
    public void calcularValorTotal()
    {
        float soma = 0;
        for(Item item: lista)
        {
            soma+= item.getValorItem();
        }
        valorTotal = soma;
    }
    
    public String toString()
    {

        String str = "";
        str += cliente.toString();
        str += "\n---------------------------\n";
        for(Item item: lista)
        {
            str += item.toString();
        }
        str += "\n Data da Venda =  " + dataVenda;
        str += "\n Valor Total = " + valorTotal;
        
        return str;
        
    }