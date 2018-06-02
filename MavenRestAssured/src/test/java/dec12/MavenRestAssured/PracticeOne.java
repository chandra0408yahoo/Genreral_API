package dec12.MavenRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.testng.annotations.Test;
public class PracticeOne {

	
	@Test
	
	public static void prc() {

		String ConsumerKey="CJ7Vmd3inq8WHXa4Q7Zg51H9w";
		String ConsumerSecret="tsnxpEsA1h7z5LCWJD7iYdywLE0JhdVOEl1NrlYipflmpyuk2B";
		String Token="854978658905186304-6Iyjh0uNwvFrQDerxItqKRFmvmqwFi4";
		String TokenSecret="hAYIRSFV8NjWK2RYa8qJ5Vij45gPJiLSkeppiJCVLSipa";
		String id;
	
		
		Response res=RestAssured.given().auth().oauth(ConsumerKey, ConsumerSecret, Token, TokenSecret).queryParam("count","1").when().
		get().then().assertThat().statusCode(200).extract().response();
		
		String str= res.asString();
		System.out.println(str);
     
         
         
         
         
         
         
		
		
	}}
