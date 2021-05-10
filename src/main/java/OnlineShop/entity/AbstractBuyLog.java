package OnlineShop.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

public class AbstractBuyLog {
    private Long id;
    private String code;
    private Date date;
    private Double amount;
    private Double payment;
    private Double discountAmount;
    private List<AbstractShopping> shoppingList;
    private String sellerName;
    private boolean deliverStatus;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "BuyLogSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CODE", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "DATE", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "AMOUNT", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Column(name = "PAYMENT", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    @Column(name = "DISCOUNTAMOUNT", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDate(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Column(name = "SHOPPINGLIST", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public List<AbstractShopping> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<AbstractShopping> shoppingList) {
        this.shoppingList = shoppingList;
    }

    @Column(name = "SELLERNAME", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Column(name = "DELIVERSTATUS", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public boolean isDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(boolean deliverStatus) {
        this.deliverStatus = deliverStatus;
    }
}
