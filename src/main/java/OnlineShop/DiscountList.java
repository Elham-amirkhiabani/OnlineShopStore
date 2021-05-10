package OnlineShop;

import java.sql.Timestamp;
import java.util.List;

public class DiscountList {
    private Long id;
    private String code;
    private Timestamp start;
    private Timestamp end;
    private Double discountRate;
    private int usingCount;
    private List<DiscountedUser> discountedUserList;


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "DiscountListSequenceGenerator")
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

    @Column(name = "START", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    @Column(name = "END", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    @Column(name = "DISCOUNTRATE", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    @Column(name = "USINGCOUNT", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public int getUsingCount() {
        return usingCount;
    }

    public void setUsingCount(int usingCount) {
        this.usingCount = usingCount;
    }

    @Column(name = "DISCOUNTEDUSERLIST", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public List<DiscountedUser> getDiscountedUserList() {
        return discountedUserList;
    }

    public void setDiscountedUserList(List<DiscountedUser> discountedUserList) {
        this.discountedUserList = discountedUserList;
    }
}
