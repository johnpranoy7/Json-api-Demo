package com.john.graphite.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.john.graphite.bean.MovieWithAnnotations;

@Repository
public interface MovieRepo extends PagingAndSortingRepository<MovieWithAnnotations, String>{

}
