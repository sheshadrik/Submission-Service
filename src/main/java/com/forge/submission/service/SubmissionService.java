package com.forge.submission.service;

import com.forge.submission.dto.SubmissionDto;
import com.forge.submission.model.Submission;
import com.forge.submission.respository.SubmissionRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubmissionService {
    @Autowired
    private SubmissionRepository submissionRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<SubmissionDto> getAllSubmissions() {
        List<Submission> submissions = new ArrayList<>();
        Iterable<Submission> iterable = submissionRepository.findAll();
        iterable.forEach(submissions::add);
        return submissions.stream().map(submission -> modelMapper.map(submission,SubmissionDto.class)).collect(Collectors.toList());
    }

    public SubmissionDto createSubmission(SubmissionDto submissionDto) {
        Submission submission = modelMapper.map(submissionDto, Submission.class);
        Submission  submissionResponse = submissionRepository.save(submission);
        SubmissionDto response = modelMapper.map(submissionResponse,SubmissionDto.class);
        return response;
    }


}
