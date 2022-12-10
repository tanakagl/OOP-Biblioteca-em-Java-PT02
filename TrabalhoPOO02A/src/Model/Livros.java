package Model;

public class Livros {
     //Declaracao dos atributos
    public String titulo;
    public String autor;
    public String editora;
    public String categoria;
    public double priceVenda;
    public double priceAluguel;
    public int quant;
    public String selo;
    public float venda;
    public String dataLivro;
    public int historico;
    public int exclusiv;
    

    
    public Livros(String titulo, String autor, String editora, String categoria, double priceVenda, double priceAluguel, int quant, String selo, String dataLivro, int exclusiv){ //Constructor Livros
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.priceVenda = priceVenda;
        this.priceAluguel = priceAluguel;
        this.quant =  quant;   
        this.selo = selo;
        this.dataLivro = dataLivro;
        this.exclusiv = exclusiv;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPriceVenda() {
        return priceVenda;
    }

    public void setPriceVenda(double priceVenda) {
        this.priceVenda = priceVenda;
    }

    public double getPriceAluguel() {
        return priceAluguel;
    }

    public void setPriceAluguel(double priceAluguel) {
        this.priceAluguel = priceAluguel;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public String getDataLivro() {
        return dataLivro;
    }

    public void setDataLivro(String dataLivro) {
        this.dataLivro = dataLivro;
    }

    public int getExclusiv() {
        return exclusiv;
    }

    public void setExclusiv(int exclusiv) {
        this.exclusiv = exclusiv;
    }

    
    
    
    @Override //toString para printar os dados dos livros conforme o pedido do usuario
    public String toString(){
        return "Título: " + titulo + " Autor: " + autor + " Editora: " + editora + " Categoria: " + categoria + " Preço de venda: R$" + priceVenda +" Preço de aluguel: R$" + priceAluguel + " Quantidade Disponível: " + quant + " Selo: " + selo + " Data de Cadastro do Livro: " + dataLivro + " Exclusividade código: " + exclusiv;
    }
    
}