package neu.atp;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;
import neu.atp.domain.Owner;
import neu.atp.domain.Pet;
import neu.atp.repositories.OwnerRepository;
import neu.atp.repositories.PetRepository;

import javax.transaction.Transactional;
import java.util.Arrays;

@Singleton
public class Application {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;

    public Application(OwnerRepository ownerRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
    }

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
    @EventListener
    @Transactional
    void init(StartupEvent event){
        //cleaning up existing data and delete input
        petRepository.deleteAll();
        ownerRepository.deleteAll();

        Owner billylee = new Owner("BillyLee");
        billylee.setAge(27);

        Owner james = new Owner("James");
        james.setAge(39);

        ownerRepository.saveAll(Arrays.asList(billylee, james));

        Pet max = new Pet("Max", billylee);
        Pet ruby = new Pet("Ruby", james);
        Pet bella = new Pet("Bella", billylee);

        ruby.setType(Pet.PetType.CAT);
        max.setType(Pet.PetType.DOG);

        petRepository.saveAll(Arrays.asList(max, ruby, bella));

    }

}
