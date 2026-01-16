package pl.edu.vistula.second_task_product_api.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.vistula.second_task_product_api.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}


