import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// https://stackoverflow.com/questions/38069719/setting-custom-header-using-httpurlconnection/40254565

public class GETPOSTExampleToken {
    private final String USER_AGENT = "Mozilla/5.0";

    private final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVkM2Y5Y2RhY2YwMDM4MTcxZmQyMzc3YSIsImlhdCI6MTU2NDQ1MDA0NCwiZXhwIjoxNTY0NDUzNjQ0fQ.mQ_q1wChN06ed-Rc3cjvOMEyMeiWYOAhIYZO_Z0Rlkc";

    public static void main(String[] args) throws Exception {
        System.out.println("Testing 1 - Send Http GET request");
        GETPOSTExampleToken restRequest = new GETPOSTExampleToken();

        restRequest.sendGetForAllUsers();
    }

    private void sendGetForAllUsers() throws Exception {
        String url = "http://localhost:3000/movies";
        String response = sendGetWithToken(url);

        System.out.println("response is: " + response);

        int a = 5 + 123;
    }

    private String sendGetWithToken(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("SparkRestExample.User-Agent", USER_AGENT);

        // for token
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("x-access-token", token);


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
