package RestAssuredTest01.RestAssuredTest01;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import files.ReUsableMethods;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class Basics {

	public static void main(String[] args) {
		

		//Given: all input details
		//When: submit the API- resource, http method
		//Then: validate response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		/**************************************************************************************************************************************/
		/*********Add Place Value**************************************************************************************************************/
		/**************************************************************************************************************************************/
		String response= 
				
		//Given
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace())
		
		//When
		.when().post("maps/api/place/add/json")
		
		//Then
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		//For Parsing Json
		JsonPath js = new JsonPath(response); 
		
		String placeId = js.getString("place_id");
		String newAddress = "Aasan Galli Risod";
		
		/**************************************************************************************************************************************/
		/*********Update Place Value***********************************************************************************************************/
		/**************************************************************************************************************************************/
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(payload.UpdatePlace(placeId,newAddress))
		.when().put("/maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		/**************************************************************************************************************************************/
		/*********Get Place Value***********************************************************************************************************/
		/**************************************************************************************************************************************/
		
		String getPlaceResponse = 
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = ReUsableMethods.rawToJson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		
		
		Assert.assertEquals(newAddress, actualAddress);
		
		
	}

}
