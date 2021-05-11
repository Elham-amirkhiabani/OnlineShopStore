package OnlineShop.entity;

import org.dom4j.tree.AbstractComment;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
public class AbstractProduct {
    private Long id;
    private boolean status;
    private String name;
    private String companyName;
    private Double price;
    private Long sellerId;
    private Double count;
    private Long categoryId;
    private String categoryInfo;
    private String description;
    private Long buyerAvgScore;
    private List<AbstractComment> commentlist;

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

    @Column(name = "SELLERID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    @Column(name = "COUNT", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    @Column(name = "CATEGORYID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
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

    @Column(name = "COMMENTLIST", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public List<AbstractComment> getCommentlist() {
        return commentlist;
    }

    public void setCommentlist(List<AbstractComment> commentlist) {
        this.commentlist = commentlist;
    }
}
