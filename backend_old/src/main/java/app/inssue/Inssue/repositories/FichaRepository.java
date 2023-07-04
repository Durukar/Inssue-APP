package app.inssue.Inssue.repositories;

import app.inssue.Inssue.entities.Ficha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichaRepository extends JpaRepository <Ficha, Long> {
}
