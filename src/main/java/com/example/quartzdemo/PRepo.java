package com.example.quartzdemo;

import org.springframework.data.repository.CrudRepository;

public interface PRepo extends CrudRepository<MyUser, Long> {

    public MyUser findByFirstName(String firstName);
}
