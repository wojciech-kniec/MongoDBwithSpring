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

    @PostMapping(value = "/create")
    public List<Users> create(@RequestBody List<Users> users){
        return usersRepository.save(new Users()));
    }

}
