
package model;


public class Item {
    
    private Livro livro;
    private float valorItem;
    private int quantidade;
    private int numero;

    public Item() {
    }

    public Item(Livro livro) {
        this.livro = livro;
    }
    
    public void calcularValorItem()
    {
        valorItem = livro.getValor() * quantidade;
    }
    
    public String toString()
    {
        
        String str = "";
        str += "\nTitulo do Livro: " + livro.getTitulo();
        str += "\nValor unitario: " + livro.getValor();
        str += "\nEm estoque: " + livro.getEstoque();
        str += "\nQuantidade: " + quantidade;
        str += "\nValor do item: " + valorItem;    
        str += "\n ############################## \n";
        return str;
        
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
    
}
