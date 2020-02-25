package com.cts.training.media.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.media.entity.Media;


@Repository
public interface MediaRepository extends  JpaRepository<Media,Integer> {

}
