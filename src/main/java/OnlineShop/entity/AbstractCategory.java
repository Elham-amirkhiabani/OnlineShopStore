package OnlineShop.entity;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
public class AbstractCategory {
    private Long id;
    private String name;
    private Long code;
    private List<AbstractProduct> productList;


    public AbstractCategory() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CtegorySequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }

    @Column(name = "NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
