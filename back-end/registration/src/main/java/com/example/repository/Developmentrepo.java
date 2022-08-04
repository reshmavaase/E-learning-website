package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Devlopment;
@Repository
public interface Developmentrepo extends JpaRepository<Devlopment,Long> {
	void deleteCourseById(Long id);

    Optional<Devlopment> findCourseById(Long id);
}
