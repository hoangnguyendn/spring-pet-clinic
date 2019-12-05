package hoangnguyen.springpetclinic.services;

import hoangnguyen.springpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {
    
    Owner findByLastName(String lastName);

    Owner findByFirstName(String fistName);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> finAll();
}
