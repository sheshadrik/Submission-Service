package com.forge.submission.controller;

import com.forge.submission.dto.SubmissionDto;
import com.forge.submission.model.Submission;
import com.forge.submission.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @GetMapping
    public List<SubmissionDto> getAllSubmissions() {
        return submissionService.getAllSubmissions();
    }

    @PostMapping
    public ResponseEntity<SubmissionDto> createSubmission(@RequestBody SubmissionDto submissionDto) {
        SubmissionDto createdSubmission = submissionService.createSubmission(submissionDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSubmission);
    }

}
