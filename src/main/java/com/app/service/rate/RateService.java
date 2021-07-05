package com.app.service.rate;

import com.app.entity.Rate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RateService implements IRateService{
    @Autowired
    IRateService rateService;

    @Override
    public Iterable<Rate> findAll() {
        return rateService.findAll();
    }

    @Override
    public Optional<Rate> findById(Long id) {
        return rateService.findById(id);
    }

    @Override
    public void save(Rate rate) {
        rateService.save(rate);
    }

    @Override
    public void remove(Long id) {
        rateService.remove(id);
    }
}
