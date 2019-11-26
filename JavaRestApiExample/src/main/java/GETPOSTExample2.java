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

public class GETPOSTExample2 {
    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {
        System.out.println("Testing 2 - Send Http GET request");
        GETPOSTExample2 restRequest = new GETPOSTExample2();

        // http://www.mocky.io/v2/5d3e6a78320000771d6e562a
        restRequest.sendGetAndParse();
    }

    private void sendGetAndParse() throws Exception {
        String url = "http://www.mocky.io/v2/5d3e6a78320000771d6e562a";
        String response = sendGet(url);

        CustomResponse customResponse = new Gson().fromJson(response, CustomResponse.class);

        Type StringListType = new TypeToken<ArrayList<String>>(){}.getType();

        // phones
        JsonElement phonesArray = customResponse.phones;
        List<String> phoneList = new Gson().fromJson(phonesArray, StringListType);

        // Address
        Address address = customResponse.address;
        JsonElement facilitiesArray = address.facilities;
        List<String> facilitiesList = new Gson().fromJson(facilitiesArray, StringListType);

        // EmergencyContact
        JsonElement emergencyContactsArray = customResponse.emergencyContacts;
        Type emergencyContactsListType = new TypeToken<ArrayList<EmergencyContact>>(){}.getType();
        List<EmergencyContact> emergencyContactsList = new Gson().fromJson(emergencyContactsArray, emergencyContactsListType);

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

class CustomResponse {
    String firstName;
    String lastName;
    String emailId;
    JsonElement phones;
    Address address;
    JsonElement emergencyContacts;
}

class Address {
    int id;
    String roadNumber;
    String houseNumber;
    String section;
    JsonElement facilities;
}

class EmergencyContact {
    String name;
    String phone;
    String relationship;
}
