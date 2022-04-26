package sit.int221.projectintegrate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import sit.int221.projectintegrate.Entities.Eventcategory;
import sit.int221.projectintegrate.Repository.EventCategoryRepository;

import java.util.List;

@RestController
@RequestMapping("/api/eventCategory")
public class EventCategoryController {
    @Autowired
    private EventCategoryRepository repository;

    @GetMapping("")
    public List<Eventcategory> getEventCategoryAll() {
        return repository.findAll();
    }

    @GetMapping("/{categoryName}")
    public List<Eventcategory> getEventCategoryName(@PathVariable String categoryName) {
        return repository.findByeventCategoryName(categoryName);
    }

/*
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public EventCategoryRepository create(@RequestBody EventCategoryRepository newEventCategory) {
        return repository.saveAndFlush(newEventCategory);
    }

    @DeleteMapping("/{eventCategoryName}")
    public void delete(@PathVariable String eventCategoryName) {
        repository.findById(eventCategoryName).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, eventCategoryName + " does not exist !!!"));
        repository.deleteById(eventCategoryName);
    }
/*
    @PutMapping("/{}")
    public Event update(@RequestBody EventCategory updateOffice, @PathVariable String officeCode) {
        Event office = repository.findById(officeCode).map(o -> mapOffice(o, updateOffice)).orElseGet(() -> {
            updateOffice.setId(officeCode);
            return updateOffice;
        });
        return repository.saveAndFlush(office);
    }
*/
}
