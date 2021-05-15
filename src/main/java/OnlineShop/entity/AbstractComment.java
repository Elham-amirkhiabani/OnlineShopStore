package OnlineShop.entity;

import OnlineShop.enumeration.StatusEnum;
import javax.persistence.*;

@MappedSuperclass
public class AbstractComment {
    private Long id;
    private Person person;
    private Product product;
    private String description;
    private StatusEnum commentStatus;
    private boolean buyer;


    public AbstractComment() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PersonSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", foreignKey = @ForeignKey(name = "FK_PERSON_COMMENT"))
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", foreignKey = @ForeignKey(name = "FK_PERSON_PRODUCT"))
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "CommentStatus")
    public StatusEnum getCommentStatus() { return commentStatus; }

    public void setCommentStatus(StatusEnum commentStatus) { this.commentStatus = commentStatus; }

    @Column(name = "BUYER")
    public boolean isBuyer() { return buyer; }

    public void setBuyer(boolean buyer) { this.buyer = buyer; }
}
