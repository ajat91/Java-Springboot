package com.programming.springbootjpapostgres.model;

import jakarta.persistence.*;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.Entity;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name="master_merchant")


public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="store_id")
    private List<Store> stores;
}







