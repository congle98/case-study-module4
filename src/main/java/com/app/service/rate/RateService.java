package com.app.service.rate;

import com.app.entity.Rate;
import com.app.repository.IRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RateService implements IRateService{
    @Autowired
    IRateRepository rateRepository;

    @Override
    public Iterable<Rate> findAll() {
        return rateRepository.findAll();
    }

    @Override
    public Optional<Rate> findById(Long id) {
        return rateRepository.findById(id);
    }

    @Override
    public void save(Rate rate) {
        rateRepository.save(rate);
    }

    @Override
    public void remove(Long id) {
        rateRepository.deleteById(id);
    }
}
