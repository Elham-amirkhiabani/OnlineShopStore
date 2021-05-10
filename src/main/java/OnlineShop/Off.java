package OnlineShop;

import java.sql.Timestamp;
import java.util.*;

public class Off {
    private Long id;
    private String code;
    private List<Product> productList;
    private  StatusEnum offState;
    private Timestamp start;
    private Timestamp end;
    private Double discountRate;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "OffSequenceGenerator")
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

    @Column(name = "PRODUCTLIST", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Column(name = "OFFSTATE", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public StatusEnum getOffState() {
        return offState;
    }

    public void setOffState(StatusEnum offState) {
        this.offState = offState;
    }

    @Column(name = "START", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    @Column(name = "END", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    @Column(name = "DISCOUNTRATE", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }
}
