package OnlineShop.dao;

import OnlineShop.entity.Category;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

//@Stateless
public class CategoryDao {

    public Category findByName(Category category) {

        try {
            Query query = createNamedQuery("findCategoryByName");
            query.setParameter("name",category.getName());
            return (Category) query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    private
    Query createNamedQuery(String findCategoryByName) {
    }

    public
    List<Category> findAllSortedByCode(){
        try {
            Query query = createNamedQuery("findAllSortedByCode");
            return query.getResultList();
        }catch (NoResultException e){
            return new ArrayList<>(0);
        }catch (NullPointerException e){
            return new ArrayList<>(0);
        }
    }

    public Category findByCode(Category category){

        try {
            Query query = createNamedQuery("findCategoryByCode");
            query.setParameter("code",category.getCode());
            return (Category) query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }

    public long countByName(Category category){
        try{
            Query query = createNamedQuery("countCategoryByName");
            query.setParameter("name",category.getName());
            return (long) query.getSingleResult();
        }catch (NoResultException e){
            return 0l;
        }catch (NullPointerException e){
            return 0l;
        }
    }

}
