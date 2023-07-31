package com.forge.submission.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VendorDetailsDto {
    private long id;
    private Long phone;
    private String email;
    private String companyName;
    private String recruiterName;
}
