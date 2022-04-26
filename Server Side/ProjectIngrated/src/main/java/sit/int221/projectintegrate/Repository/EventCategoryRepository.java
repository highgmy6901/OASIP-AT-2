package sit.int221.projectintegrate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int221.projectintegrate.Entities.Eventcategory;

import java.util.List;

public interface EventCategoryRepository extends JpaRepository<Eventcategory,String> {
List<Eventcategory> findByeventCategoryName(String eventName);
}
