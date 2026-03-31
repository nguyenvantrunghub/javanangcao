package trung.example.showproduct.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;

    // Constructors
    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters
    // (Bạn có thể dùng Generate của IDE hoặc dùng @Data của Lombok)
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
}