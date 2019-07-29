import SparkRestExample.StandardResponse;
import SparkRestExample.User;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// https://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/

public class GETPOSTExample {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {
        System.out.println("Testing 1 - Send Http GET request");
        GETPOSTExample restRequest = new GETPOSTExample();

        restRequest.sendGetForSpecificUser();
        restRequest.sendGetForAllUsers();
    }

    private void sendGetForAllUsers() throws Exception {
        String url = "http://localhost:8889/users";
        String response = sendGet(url);

        StandardResponse standardResponse = new Gson().fromJson(response, StandardResponse.class);

        JsonElement jsonElement = standardResponse.getData();

        Type listType = new TypeToken<ArrayList<User>>(){}.getType();
        List<User> userList = new Gson().fromJson(jsonElement, listType);

        int a = 5 + 123;
    }

    private void sendGetForSpecificUser() throws Exception {
        String url = "http://localhost:8889/users/1";
        String response = sendGet(url);

        StandardResponse standardResponse = new Gson().fromJson(response, StandardResponse.class);

        JsonElement jsonElement = standardResponse.getData();
        User user = new Gson().fromJson(jsonElement, User.class);
        int a = 5 + 123;
    }

    private String sendGet(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("SparkRestExample.User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("Sending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader (new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());
        return response.toString();
    }
}
