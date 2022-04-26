package sit.int221.projectintegrate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import sit.int221.projectintegrate.Entities.Event;
import sit.int221.projectintegrate.Repository.EventRepository;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventRepository repository;

    @GetMapping("")
    public List<Event> getEventAll() {
        return repository.findAll();
    }

    @GetMapping("/{eventId}")
    public Event getEventById(@PathVariable Integer eventId) {
        return repository.findById(eventId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, eventId + " does not exist "));
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Event create(@RequestBody Event newEvent) {
        return repository.saveAndFlush(newEvent);
    }

    @DeleteMapping("/{eventId}")
    public void delete(@PathVariable Integer eventId) {
        repository.findById(eventId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, eventId + " does not exist !!!"));
        repository.deleteById(eventId);
    }
/*
    @PutMapping("/{eventId}")
    public Event update(@RequestBody Event updateEvent, @PathVariable Integer eventId) {
        Event office = repository.findById(eventId).map(o -> mapEvent(o, updateEvent)).orElseGet(() -> {
            updateEvent.setId(eventId);
            return updateEvent;
        });
        return repository.saveAndFlush(office);
    }
*/

}
