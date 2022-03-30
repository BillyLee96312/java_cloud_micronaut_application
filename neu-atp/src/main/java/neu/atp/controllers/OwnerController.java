package neu.atp.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import neu.atp.domain.Owner;
import neu.atp.repositories.OwnerRepository;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

@Controller("/owners")
@ExecuteOn(TaskExecutors.IO)
public class OwnerController {
    private final OwnerRepository ownerRepository;


    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
    @Get("/")
    List<Owner> all(){
        return ownerRepository.findAll();
    }

    @Get("/{name}")
    Optional<Owner> findByName(@NotBlank String name){
        return ownerRepository.findByName(name);
    }

}
