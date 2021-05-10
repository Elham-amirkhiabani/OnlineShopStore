package OnlineShop;

public class Role {
    private Long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "RoleSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
