package main.model.repository;

import main.model.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SessionRepository extends JpaRepository <Session, Integer> {
}
