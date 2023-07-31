package com.forge.submission.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class VendorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private Long phone;
    private String email;
    private String companyName;
    private String recruiterName;
    @OneToOne(mappedBy = "vendorDetails")
    private Submission submission;
}
