package src.creational.factory;

import src.creational.factory.domain.Clothing;
import src.creational.factory.domain.Electronics;
import src.creational.factory.domain.Groceries;
import src.creational.factory.domain.Product;

public class ProductFactory {

    public Product createProduct(String product) throws Exception {

        return switch (product) {
            case "electronics" -> new Electronics();
            case "clothing" -> new Clothing();
            case "groceries" -> new Groceries();
            default -> throw new InternalError("Try to create any available product");
        };
    }

}
