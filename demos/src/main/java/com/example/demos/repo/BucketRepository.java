package com.example.demos.repo;

import com.example.demos.models.Bucket;
import com.example.demos.models.User;
import org.springframework.data.repository.CrudRepository;

public interface BucketRepository extends CrudRepository <Bucket, Long> {
}
