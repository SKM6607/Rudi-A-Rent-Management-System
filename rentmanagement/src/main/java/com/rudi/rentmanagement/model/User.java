package com.rudi.rentmanagement.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Entity
@Table(name = "USER_TBL")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String phone;
    private String user_details;
    private String role;
    @Column(nullable = false,updatable = false)
    private LocalDate account_created_date;
    @Column(nullable = false,updatable = false)
    private LocalTime account_created_time;
    private Long contributions;
    private String interested_in;
}
