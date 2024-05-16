package com.springframework.PetClinic.service;

import com.springframework.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
