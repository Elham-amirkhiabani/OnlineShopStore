package OnlineShop.dao;

import javax.persistence.*;
import java.io.Serializable;

public abstract class AbstractDao<T> implements Serializable {

    private Class<T> entityClass;

    public AbstractDao(Class<T> entityClass) {this.entityClass=entityClass;}

    public AbstractDao(){};

    private EntityManagerFactory getEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("shop");
    }

    public T create(T entity) {
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = getEntityManagerFactory().createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            em.persist(entity);

            tx.commit();
        } finally {
            em.close();
        }
        return entity;
    }
}