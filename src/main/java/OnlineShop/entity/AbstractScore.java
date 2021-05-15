package OnlineShop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
public class AbstractScore {
    private Long id;
    private Set<Person> personId;
    private Double scoreNumber;
    private Set<Product> productId;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ScoreSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    @OneToMany
    @JoinColumn(name = "", foreignKey = @ForeignKey(name = "FK_SCORE_PERSON"))
    public Set<Person> getPersonId() {return personId;}

    public void setPersonId(Set<Person> personId) {this.personId = personId;}

    @Column(name = "SCORENUMBER", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getScoreNumber() {return scoreNumber;}

    public void setScoreNumber(Double scoreNumber) {this.scoreNumber = scoreNumber;}

    @OneToMany
    @JoinColumn(name = "PRODUCTID",foreignKey = @ForeignKey(name = "FK_SCORE_PRODUCT") )
    public Set<Product> getProductId() {return productId;}

    public void setProductId(Set<Product> productId) {this.productId = productId;}
}
