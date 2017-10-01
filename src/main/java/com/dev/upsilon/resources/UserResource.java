package com.dev.upsilon.resources;

import com.dev.upsilon.model.User;
import com.dev.upsilon.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("api/user")
public class UserResource {

    UserService service = new UserService();

    @GET
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @GET
    @Path("/{userId}")
    public User getUser(@PathParam("userId") String id) {
        return service.getUserById(id);
    }
}
