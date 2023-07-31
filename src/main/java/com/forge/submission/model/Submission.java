package com.forge.submission.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(of = { "id" })
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date submissionDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor_id",referencedColumnName = "id")
    private VendorDetails vendorDetails;
    private String implementationPartner;
    private String endClient;
    private int payRatePerHour;
    private int contractDurationInMonths;


}
