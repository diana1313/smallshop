package com.epam.demoapi.smallshop.repo;

import com.epam.demoapi.smallshop.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Order, Integer> {
}
