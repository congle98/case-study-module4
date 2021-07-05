package com.app.repository;

import com.app.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRateRepository extends JpaRepository<Rate,Long> {
}
