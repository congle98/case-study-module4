package com.app.service.shop;

import com.app.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ShopService implements IShopService{
    @Autowired
    IShopService shopService;

    @Override
    public Iterable<Shop> findAll() {
        return shopService.findAll();
    }

    @Override
    public Optional<Shop> findById(Long id) {
        return shopService.findById(id);
    }

    @Override
    public void save(Shop shop) {
        shopService.save(shop);
    }

    @Override
    public void remove(Long id) {
        shopService.remove(id);
    }
}
