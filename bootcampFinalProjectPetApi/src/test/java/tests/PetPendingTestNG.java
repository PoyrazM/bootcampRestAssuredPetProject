package tests;

import Builder.PetApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import datas.IStatus;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import model.Pet;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PetPendingTestNG {

    Response response;
    JSONObject jsonObject;
    int ID;
    String NAME;
    ObjectMapper mapper;


    public PetPendingTestNG(){
        this.mapper = new ObjectMapper();
        this.jsonObject = new JSONObject();
        Faker FAKER = new Faker();
        this.ID = (int) FAKER.number().randomNumber();
        this.NAME = FAKER.animal().name();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step("POST request is starting")
    @Description("Validating to POST request for the PENDING status")
    @Test(priority = 1)
    public void validatePostForPendingStatus() {

        Pet requestPet = new Pet();
        requestPet.setId(this.ID);
        requestPet.setName(this.NAME);
        requestPet.setStatus(IStatus.statusPending);

        this.response = PetApi.post(requestPet);

        assertThat(this.response.getStatusCode(), equalTo(200));

        Pet responsePet = this.response.as(Pet.class);

        assertThat(responsePet.getId(), equalTo(requestPet.getId()));
        assertThat(responsePet.getName(), equalTo(requestPet.getName()));
        assertThat(responsePet.getStatus(), equalTo(requestPet.getStatus()));
        assertThat(this.response.getStatusCode() , equalTo(200));
        assertThat(this.response.getStatusLine(),equalTo("HTTP/1.1 200 OK"));
        assertThat(this.response.getContentType() , equalTo("application/json"));
        assertThat(this.response.getHeader("Connection") , equalTo("keep-alive"));
        assertThat(this.response.getHeader("Transfer-Encoding") , equalTo("chunked"));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step("GET request is starting")
    @Description("Validating to GET request for the PENDING status")
    @Test(priority = 2)
    public void validateGetForPendingStatus(){

        Response response = PetApi.get(this.ID);
        assertThat(response.getStatusCode(),equalTo(200));

        Pet responsePet = response.as(Pet.class);

        assertThat(responsePet.getId() , equalTo(this.ID));
        assertThat(responsePet.getName() , equalTo(this.NAME));
        assertThat(responsePet.getStatus(), equalTo(IStatus.statusPending));
        assertThat(this.response.getStatusCode() , equalTo(200));
        assertThat(this.response.getStatusLine(),equalTo("HTTP/1.1 200 OK"));
        assertThat(this.response.getContentType() , equalTo("application/json"));
        assertThat(this.response.getHeader("Connection") , equalTo("keep-alive"));
        assertThat(this.response.getHeader("Transfer-Encoding") , equalTo("chunked"));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step("GET request is starting for ALL PENDING statuses")
    @Description("Validating to GET request for the ALL PENDING status")
    @Test(priority = 3)
    public void validateGetAllPendingStatuses() {

        this.response = PetApi.getPending();

        String status = this.response.path("status[3]").toString();
        String thirdId = this.response.path("id[3]").toString();

        assertThat(status,equalTo(IStatus.statusPending));
        //assertThat(thirdId,equalTo("764"));
        assertThat(this.response.getStatusCode(),equalTo(200));
        assertThat(this.response.getStatusLine(),equalTo("HTTP/1.1 200 OK"));
        assertThat(this.response.getContentType() , equalTo("application/json"));
        assertThat(this.response.getHeader("Connection") , equalTo("keep-alive"));
        assertThat(this.response.getHeader("Transfer-Encoding") , equalTo("chunked"));


    }

    @Severity(SeverityLevel.CRITICAL)
    @Step("DELETE request is starting ")
    @Description("Validating to DELETE request for the PENDING status")
    @Test(priority = 4)
    public void validateDeleteForPendingStatus(){

        this.response =PetApi.delete(this.ID);

        assertThat(this.response.getStatusCode() , equalTo(200));
        assertThat(this.response.getStatusLine() , equalTo("HTTP/1.1 200 OK"));
        assertThat(this.response.getContentType() , equalTo("application/json"));
        assertThat(this.response.getHeader("Connection") , equalTo("keep-alive"));
        assertThat(this.response.getHeader("Transfer-Encoding") , equalTo("chunked"));
        assertThat(this.response.path("code") , equalTo(200));
        assertThat(this.response.path("type") , equalTo("unknown"));

    }
}
