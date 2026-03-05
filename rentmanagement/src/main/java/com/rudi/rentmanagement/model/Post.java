package com.rudi.rentmanagement.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "POST_TBL")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "submission_id")
    private Long submissionId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "property_id", nullable = false)
    private Property property;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "rent_amount", nullable = false)
    private Double rentAmount;

    @Column(name = "deposit_amount", nullable = false)
    private Double depositAmount;

    @Column(name = "maintenance_charge")
    private Double maintenanceCharge;

    @Column(name = "availability_status", nullable = false)
    private String availabilityStatus; // available, rented

    @Column(name = "description")
    private String description;

    @Column(name = "submitted_at", nullable = false, updatable = false)
    private LocalDateTime submittedAt;

    @Column(name = "approved_status")
    private String approvedStatus; // pending, approved, rejected

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approved_by")
    private User approvedBy; // nullable

    @Column(name = "approval_date")
    private LocalDateTime approvalDate;
}
