package dec12.MavenRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Restfirstscript {


	@Test
	
	public  void testme() {
	
	
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
		
Response res=	given().
		param("location","51.503186,-0.126446").
		param("radius","5000").
		param("key","AIzaSyBEh5zAdl3cctYOQaT8JKSLc8GUQfYmOeI").
		when().
		get("maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("results[0].name",equalTo("London")).and().body("results[0].place_id",equalTo("ChIJdd4hrwug2EcRmSrV3Vo6llI")).and().
		  header("server", "scaffolding on HTTPServer2").extract().response();
		
		System.out.println("passed");
		
String str=		res.asString();

JsonPath js= new JsonPath(str);

System.out.println(js.get("next_page_token").toString());

		System.out.println(str);
	}

}
