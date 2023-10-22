package me.dio.SantanderBootcamp2023.model;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity (name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    @Column (name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Long getId() {return id ;}
    public void setId() {this.id = id; }

    public String getNumber() {return number;}
    public void setNumber() {this.number = number; }

    public BigDecimal getLimit() {return limit; }
    public void setLimit() {this.limit = limit; }

}
