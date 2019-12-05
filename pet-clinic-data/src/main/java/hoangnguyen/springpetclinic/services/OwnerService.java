package hoangnguyen.springpetclinic.services;

import hoangnguyen.springpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<OwnerService, Long> {

    Owner findByLastName(String lastName);

    Owner findByFirstName(String fistName);
}
