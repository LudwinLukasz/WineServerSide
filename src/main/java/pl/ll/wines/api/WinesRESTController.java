package pl.ll.wines.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.ll.wines.model.Wine;
import pl.ll.wines.model.WineCRUDRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 07.02.2018.
 */
@Controller
public class WinesRESTController {

    private static final Logger log = LoggerFactory.getLogger(WinesRESTController.class);

    @Autowired
    private WineCRUDRepository wineCRUDRepository;

    @GetMapping(value = "/api/wines" )
    @ResponseBody
    public List<Wine> getAllWines() {
        List<Wine> wines = new ArrayList<>();
        log.info("Full wine list requested");
        for (Wine iterWine : wineCRUDRepository.findAll()) {
            wines.add(iterWine);
        }
        return wines;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "api/wine")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void saveWine(@RequestBody Wine wine) throws IllegalAccessException {
        log.info("New wine added {}",wine);
        wineCRUDRepository.save(wine);
    }
}
