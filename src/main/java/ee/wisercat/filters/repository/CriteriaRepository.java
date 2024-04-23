package ee.wisercat.filters.repository;

import ee.wisercat.filters.model.Criteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaRepository extends JpaRepository<Criteria, Integer> {
}
