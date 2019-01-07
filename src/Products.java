public class Products {
    private String name;
    private int quantiti;
    private double price;

    public Products(String name, int quantiti, double price) {
        this.name = name;
        this.quantiti = quantiti;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantiti() {
        return quantiti;
    }

    public void setQuantiti(int quantiti) {
        this.quantiti = quantiti;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
