package com.spring.data.rest.springDataRestFul.repository;

import com.spring.data.rest.springDataRestFul.entity.Hamburger;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "burger", path = "burger")
public interface HamburgerRepository extends PagingAndSortingRepository<Hamburger, Long> {
    List<Hamburger> findByName(@Param("name") String name);
    List<Hamburger> findByStore(@Param("store") String store);
    Hamburger findById(@Param("id")Long id);
}
