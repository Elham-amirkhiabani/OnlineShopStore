package OnlineShop.view;

import OnlineShop.entity.Category;
import OnlineShop.service.CategoryService;

public class Main {
    public static void main(String[] args) {
        Category category = new Category();
        category.setName("Book");
        category.setCode(12356L);

        CategoryService service = new CategoryService();
        service.create(category);


    }
}
