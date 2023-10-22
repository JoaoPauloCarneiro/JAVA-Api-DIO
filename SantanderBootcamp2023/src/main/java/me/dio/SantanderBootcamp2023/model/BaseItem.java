package me.dio.SantanderBootcamp2023.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    private String description;

    public Long getId() {return id ;}
    public void setId() {this.id = id; }

    public String getNumber() {return icon;}
    public void setNumber() {this.icon = icon; }

    public String getLimit() {return description; }
    public void setLimit() {this.description = description; }
}
