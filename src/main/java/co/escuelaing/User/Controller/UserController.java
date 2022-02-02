package co.escuelaing.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.escuelaing.User.Data.User;
import co.escuelaing.User.Dto.UserDTO;
import co.escuelaing.User.Service.UserInterface;

@RestController
@RequestMapping( "/v1/user" )
public class UserController {
    
    private final UserInterface userService;

	 public UserController(@Autowired UserInterface userService) {
		 this.userService = userService;
	 }

     @GetMapping
     public ResponseEntity<List<User>> getAll() {
         //TODO implement this method using UserService
         return null;
     }
    
     @GetMapping( "/{id}" )
     public ResponseEntity<User> findById( @PathVariable String id ) {
        //TODO implement this method using UserService
        return null;
     }
    
    
     @PostMapping
     public ResponseEntity<User> create( @RequestBody UserDTO userDto ) {
          //TODO implement this method using UserService
          return null;
     }
    
     @PutMapping( "/{id}" )
     public ResponseEntity<User> update( @RequestBody UserDTO userDto, @PathVariable String id ) {
          //TODO implement this method using UserService
          return null;
     }

     @DeleteMapping( "/{id}" )
     public ResponseEntity<Boolean> delete( @PathVariable String id ) {
          //TODO implement this method using UserService
         return null;      
     }
}
