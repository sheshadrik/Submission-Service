package com.forge.submission.respository;

import com.forge.submission.model.Submission;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends PagingAndSortingRepository<Submission,Long> {
}
