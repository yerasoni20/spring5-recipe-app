package guru.springframework.repositories;

import guru.springframework.domain.Unit_of_Measure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Spliterator;

public interface UnitOfMeasureRepository extends CrudRepository<Unit_of_Measure,Long> {
    Optional<Unit_of_Measure> findByDescription(String description);
}
