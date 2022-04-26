package sit.int221.projectintegrate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int221.projectintegrate.Entities.Event;

public interface EventRepository extends JpaRepository<Event,Integer> {
}
