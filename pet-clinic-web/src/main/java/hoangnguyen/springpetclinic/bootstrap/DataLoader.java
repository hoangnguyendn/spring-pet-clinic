package hoangnguyen.springpetclinic.bootstrap;

import hoangnguyen.springpetclinic.models.Owner;
import hoangnguyen.springpetclinic.models.Vet;
import hoangnguyen.springpetclinic.services.OwnerService;
import hoangnguyen.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFistName("Hoang");
        owner1.setLastName("Nguyen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFistName("David");
        owner2.setLastName("Smith");

        ownerService.save(owner2);

        System.out.println("Loading owners...");

        Vet vet1 = new Vet();
        vet1.setFistName("Kaka");
        vet1.setLastName("Kun");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFistName("Chen");
        vet2.setLastName("Long");

        vetService.save(vet2);

        System.out.println("Loading vets...");

    }
}
