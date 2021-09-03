
public class Livro {

    private String name;
    private Autor autor;
    private double price;
    private int qtyInStock;

    public Livro(String n, Autor a, double p, int qty) {
        name = n;
        autor = a;
        price = p;
        qtyInStock = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
    
    @Override
    public String toString() {
        return "Nome do livro: " + name + "\n"
                + "Autor: " + autor.toString() + "\n" +
                "Preço: " + price + "    Qtd em estoque: " + qtyInStock;
    }

}
