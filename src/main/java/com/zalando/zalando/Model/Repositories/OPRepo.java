package com.zalando.zalando.Model.Repositories;

import com.zalando.zalando.Model.Entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OPRepo extends JpaRepository<OrderProduct, Integer> {
}
