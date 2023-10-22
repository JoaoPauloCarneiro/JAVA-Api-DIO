package me.dio.SantanderBootcamp2023.model;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (unique = true)
    private  String number;
    private String agency;
    @Column (precision = 12, scale = 2)
    private BigDecimal balance;
    @Column (name = "additional_limit", precision = 12, scale = 2)
    private BigDecimal limit;

    public Long getId() {return id;}
    public void setId (Long id) {this.id = id;}

    public String getNumber() {return number; }
    public void setNumber (String number) {this.number = number; }

    public String getAgency () {return agency; }
    public void setAgency () {this.agency = agency; }

    public BigDecimal getBalance() {return balance; }
    public void setBalance () {this.balance = balance; }

    public BigDecimal getLimit () {return limit; }
    public void setLimit () {this.limit = limit; }

}










