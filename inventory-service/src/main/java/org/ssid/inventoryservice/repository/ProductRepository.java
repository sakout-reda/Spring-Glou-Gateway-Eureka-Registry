package org.ssid.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.ssid.inventoryservice.entity.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
}
