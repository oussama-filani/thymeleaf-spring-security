package net.oussama.thymeleafspringsecurity.repository;

import net.oussama.thymeleafspringsecurity.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
