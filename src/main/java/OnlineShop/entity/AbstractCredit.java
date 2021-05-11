package OnlineShop.entity;

import javax.persistence.*;

@MappedSuperclass
public class AbstractCredit {
    private Long id;
    private String amount;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CreditSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "AMOUNT", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
