package OnlineShop.service;

import OnlineShop.dao.CategoryDao;
import OnlineShop.entity.Category;

public
class CategoryService {

    public Category create(Category category) {
        CategoryDao dao = new CategoryDao();
        dao.create(category);
        return category;
    }

}
