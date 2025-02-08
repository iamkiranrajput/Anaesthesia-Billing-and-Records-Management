package com.guardians.ABRM.repository;

import com.guardians.ABRM.entity.Cases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasesRepository extends JpaRepository<Cases, Integer> {
}