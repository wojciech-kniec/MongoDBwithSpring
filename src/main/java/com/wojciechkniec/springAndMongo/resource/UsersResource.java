package com.wojciechkniec.springAndMongo.resource;

import com.wojciechkniec.springAndMongo.document.Users;
import com.wojciechkniec.springAndMongo.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersRepository usersRepository;

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Users read(@PathVariable String id) {
        return usersRepository.findOne(Integer.valueOf(id));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        usersRepository.delete(Integer.valueOf(id));
    }
}