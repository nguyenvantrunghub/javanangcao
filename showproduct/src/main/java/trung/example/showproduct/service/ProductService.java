package trung.example.showproduct.service;

import org.springframework.stereotype.Service;

import trung.example.showproduct.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Dell XPS", 1500.0, "Mỏng nhẹ, hiệu năng cao"));
        products.add(new Product(2, "iPhone 15 Pro", 1200.0, "Camera chuyên nghiệp"));
        products.add(new Product(3, "Bàn phím cơ AKKO", 80.0, "Gõ cực sướng, thiết kế đẹp"));
        return products;
    }
}