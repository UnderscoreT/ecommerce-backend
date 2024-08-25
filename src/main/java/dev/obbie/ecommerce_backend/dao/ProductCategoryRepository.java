package dev.obbie.ecommerce_backend.dao;


import dev.obbie.ecommerce_backend.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel ="productCategory",//name of json entry
path = "product-category") //path /product-category
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
