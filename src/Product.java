import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Product name= " + name + ", price=" + price;
    }

    public boolean equals(Object o) {
        if (this == o) return true; // porównujemy ten sam obiekt w pamięci więc jest true
        if (o == null || getClass() != o.getClass()) return false; //jeśli jest null lub inna klasa jest false
        Product product = (Product) o; // porównujemy te dwa produkty
        return price == product.price && Objects.equals(name, product.name);
    }

    public int hashCode() {         // sety/mapy najpierw uzywaja hashcode a dopiero potem equals wiec hash tez tu ma byc
        return Objects.hash(name, price); // musza byc razem (equals i hash) zeby zachowywaly sie dobrze, a nie losowo

    }
}
