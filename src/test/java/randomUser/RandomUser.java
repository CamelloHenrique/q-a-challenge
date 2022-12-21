package randomUser;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RandomUser {
    private String fullName;
    private String email;
    private String password;

    public RandomUser() {
        ExtractableResponse<Response> response = given().when().get("https://randomuser.me/api/").then().extract();
        fullName = response.path("results.name.first[0]")+" "+response.path("results.name.last[0]");
        //password pode ser o mesmo em todas as execuções do testes
        password = "ASDqwe123!@#";
        email = response.path("results.email[0]");
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
