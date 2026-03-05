package com.rudi.rentmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "locality_id", nullable = false)
    private Locality locality;

    @Column(nullable = false)
    private String property_type; // apartment, house, pg, studio, etc.

    private String bhk_type; // 1BHK, 2BHK, etc.

    private String furnishing_type; // unfurnished, semi, fully

    private Double area;

    @Column(nullable = false)
    private String addresses;

    private Integer floorNumber;
    private Integer totalFloors;

    private Boolean parkingAvailable;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
