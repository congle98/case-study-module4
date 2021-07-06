package com.app.repository;

import com.app.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRateRepository extends JpaRepository<Rate,Long> {
}
