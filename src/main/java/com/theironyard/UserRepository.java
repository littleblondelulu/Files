package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by lindseyringwald on 10/6/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
