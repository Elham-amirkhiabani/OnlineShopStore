package OnlineShop.dao;

import OnlineShop.entity.Category;

import javax.persistence.EntityManager;

public class CategoryDao extends AbstractDao<Category>{
    public CategoryDao() {super(Category.class);}

}
