package gift.doamin.product.repository;

import gift.doamin.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<Product, Long>, ProductRepository {

    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByCategoryId(Long categoryId, Pageable pageable);
}
