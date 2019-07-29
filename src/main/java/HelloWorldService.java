import static spark.Spark.*;

// https://github.com/fanatixan/baeldung/tree/master/spark-java/src/main/java/com/baeldung/sparkjava

public class HelloWorldService {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        port(8888);

        get("/hello", (req, res)->"Hello, world");

        get("/hello/:name", (req,res) -> {
            return "Hello, "+ req.params(":name");
        });
    }
}
