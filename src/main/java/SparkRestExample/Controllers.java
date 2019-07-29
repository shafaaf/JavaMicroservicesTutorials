package SparkRestExample;

import com.google.gson.Gson;

import static spark.Spark.*;

public class Controllers {

    public static void main(String[] args) {

        final UserServiceInterface userService = new UserServiceMapImpl();

        System.out.println("Hello this is controller");

        port(8889);

        // GET requests

        // get all users
        get("/users", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson (
                new StandardResponse (
                    StatusResponse.SUCCESS,
                    new Gson().toJsonTree(userService.getUsers())
                )
            );
        });

        // get user by id
        get("/users/:id", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson (
                new StandardResponse(
                    StatusResponse.SUCCESS,
                    new Gson().toJsonTree(userService.getUser(request.params(":id")))
                ));
        });

        // PUT requests

        // edit a user
        put("/users", (request, response) -> {
            response.type("application/json");
            User toEdit = new Gson().fromJson(request.body(), User.class);
            User editedUser = userService.editUser(toEdit);

            if (editedUser != null) {
                return new Gson().toJson(
                        new StandardResponse(StatusResponse.SUCCESS,new Gson()
                                .toJsonTree(editedUser)));
            } else {
                return new Gson().toJson(
                        new StandardResponse(StatusResponse.ERROR,new Gson()
                                .toJson("SparkRestExample.User not found or error in edit")));
            }
        });

        // POST requests

        // create a user
        post("/users", (request, response) -> {
            response.type("application/json");
            User user = new Gson().fromJson(request.body(), User.class);
            userService.addUser(user);
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
        });

        // DELETE request

        delete("/users/:id", (request, response) -> {
            response.type("application/json");
            userService.deleteUser(request.params(":id"));
            return new Gson().toJson (
                new StandardResponse(StatusResponse.SUCCESS, "user deleted")
            );
        });
    }
}
