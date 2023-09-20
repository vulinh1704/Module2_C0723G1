package manager;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    private Map<Integer, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public Map<Integer, Product> getAll() {
        return this.productMap;
    }

    public void delete(int id) {
        productMap.remove(id);
    }
}

class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Bánh cáy", 400);
        Product product2 = new Product(2, "Bánh ghẹ", 400);
        Product product3 = new Product(3, "Bánh trôi", 400);
        Product product4 = new Product(4, "Bánh đa", 400);

        ProductManager store = new ProductManager();
        store.addProduct(product);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.delete(4);

        Map<Integer, Product> map = store.getAll();
        for (Integer key: map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
