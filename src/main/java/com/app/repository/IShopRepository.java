package com.app.repository;

import com.app.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShopRepository extends JpaRepository<Shop,Long> {
}
