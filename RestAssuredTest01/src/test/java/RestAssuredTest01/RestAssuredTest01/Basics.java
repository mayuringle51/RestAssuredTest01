package RestAssuredTest01.RestAssuredTest01;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import files.payload;


public class Basics {

	public static void main(String[] args) {
		

		//Given: all input details
		//When: submit the API- resource, http method
		//Then: validate response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		//Given
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace())
		
		//When
		.when().post("maps/api/place/add/json")
		
		//Then
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)");
		
	}

}
