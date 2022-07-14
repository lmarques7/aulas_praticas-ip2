import java.util.ArrayList;

public class Livro {

    private String name;
    private ArrayList<Autor> autores;
    private double price;
    private int qtyInStock;

    public Livro(String n, double p, int qty) {
        name = n;
        price = p;
        qtyInStock = qty;
        this.autores = new ArrayList<>();
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

    public void addAutor(Autor novoAutor) {
        this.autores.add(novoAutor);
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
    
    @Override
    public String toString() {
        return "Nome do livro: " + name +
                " | Autores: " + autores.toString() + "\t" +
                " | Preço: " + price + "\tQtd em estoque: " + qtyInStock;
    }

}
