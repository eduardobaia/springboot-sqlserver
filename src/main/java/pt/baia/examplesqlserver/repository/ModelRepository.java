package pt.baia.examplesqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.baia.examplesqlserver.model.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
