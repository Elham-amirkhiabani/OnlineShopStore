package OnlineShop.dao;

import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class AbstractDao<T> implements Serializable {

    private Class<T> entityClass;

    public AbstractDao(Class<T> entityClass) {this.entityClass=entityClass;}

    public AbstractDao(){};

    public abstract EntityManager getEntityManager();

}