package dev.arthurvitor.financial.manager.domain.repository;

import dev.arthurvitor.financial.manager.domain.entity.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<ExampleEntity, Long> {
}
