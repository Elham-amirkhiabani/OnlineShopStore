package OnlineShop.entity;

import org.dom4j.tree.AbstractComment;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@MappedSuperclass
public class AbstractProduct {
    private Long id;
    private boolean status;
    private String name;
    private String companyName;
    private Double price;
    private Set<SaleLog> sellerId;
    private Double count;
    private Set<Category> categoryId;
    private String categoryInfo;
    private String description;
    private Long buyerAvgScore;
    private Set<Comment> commentList;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ProductSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "STATUS", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Column(name = "NAME", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "COMPANYNAME", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Column(name = "PRICE", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @OneToMany
    @JoinColumn(name = "SELLERID",foreignKey = @ForeignKey(name = "FK_PRODUCT_SELLER") )
    public Set<SaleLog> getSellerId() {
        return sellerId;
    }

    public void setSellerId(Set<SaleLog> sellerId) {
        this.sellerId = sellerId;
    }

    @Column(name = "COUNT", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    @OneToMany
    @JoinColumn(name = "CATEGORYID",foreignKey = @ForeignKey(name = "FK_PRODUCT_CATEGORY") )
    public Set<Category> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Set<Category> categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "CATEGORYINFO", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(String categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    @Column(name = "DESCRIPTION", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "BUYERAVGSCORE", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getBuyerAvgScore() {
        return buyerAvgScore;
    }

    public void setBuyerAvgScore(Long buyerAvgScore) {
        this.buyerAvgScore = buyerAvgScore;
    }

    @OneToMany
    @JoinColumn(name = "COMMENTS",foreignKey = @ForeignKey(name = "FK_PRODUCT_COMMENT") )
    public Set<Comment> getCommentList() {
        return commentList;
    }

    public
    void setCommentList(Set<Comment> commentList) {
        this.commentList = commentList;
    }
}
