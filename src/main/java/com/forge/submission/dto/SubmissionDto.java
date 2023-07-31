package com.forge.submission.dto;

import com.forge.submission.model.VendorDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SubmissionDto {

    private Long id;
    private Date submissionDate;
    private VendorDetailsDto vendorDetails;
    private String implementationPartner;
    private String endClient;
    private int payRatePerHour;
    private int contractDuration;

}
