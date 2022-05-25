package ai.lexoro.demo.inheritancejpajackson.repositories;

import ai.lexoro.demo.inheritancejpajackson.model.Filter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepository extends JpaRepository<Filter,Long> {
}
