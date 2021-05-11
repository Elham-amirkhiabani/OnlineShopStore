package OnlineShop.entity;

import javax.persistence.*;
import java.util.*;

@MappedSuperclass
public class AbstractSaleLog {
    private Long id;
    private String code;
    private Date date;
    private Double amount;
    private Double receiveAmount;
    private Double discountAmount;
    private List<AbstractBuy> buyList;
    private String buyerName;
    private boolean sendStatus;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SaleLogSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CODE", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "DATE", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
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

    @Column(name = "RECEIVEAMOUNT", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(Double receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    @Column(name = "DISCOUNTAMOUNT", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Column(name = "BUYLIST", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public List<AbstractBuy> getBuyList() {
        return buyList;
    }

    public void setBuyList(List<AbstractBuy> buyList) {
        this.buyList = buyList;
    }

    @Column(name = "BUYERNAME", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Column(name = "SENDSTATUS", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public boolean isSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(boolean sendStatus) {
        this.sendStatus = sendStatus;
    }
}
