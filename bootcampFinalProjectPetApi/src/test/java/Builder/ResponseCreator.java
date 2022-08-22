package Builder;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ResponseCreator {
    public static Response post(String path ,Object requestGrocery){

        return given(Build.getRequestSpec()).
                body(requestGrocery).
                when().
                post(path).
                then().
                spec(Build.getResponseSpec()).
                extract().
                response();
    }

    public static Response get(String path){

        return given(Build.getRequestSpec()).
                when().
                get(path).
                then().
                spec(Build.getResponseSpec()).
                extract().
                response();
    }

    public static Response getPending(String path) {

        return given(Build.getRequestSpec()).
                when().
                get(path).
                then().
                spec(Build.getResponseSpec()).
                extract().
                response();
    }

    public static Response getAvailable(String path) {

        return given(Build.getRequestSpec()).
                when().
                get(path).
                then().
                spec(Build.getResponseSpec()).
                extract().
                response();
    }

    public static Response getSold(String path) {

        return given(Build.getRequestSpec()).
                when().
                get(path).
                then().
                spec(Build.getResponseSpec()).
                extract().
                response();
    }



    public static Response update(String path , Object requestGrocery){
        return given(Build.getRequestSpec()).
                body(requestGrocery).
                when().
                put(path).
                then().spec(Build.getResponseSpec()).
                extract().
                response();
    }

    public static Response delete(String path){
        return given(Build.getRequestSpec()).
                when().
                delete(path).
                then().spec(Build.getResponseSpec()).
                extract().
                response();
    }

}
