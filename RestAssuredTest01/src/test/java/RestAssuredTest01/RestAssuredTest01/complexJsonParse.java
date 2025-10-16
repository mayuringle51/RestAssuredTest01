package RestAssuredTest01.RestAssuredTest01;

import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {

	public static void main(String[] args) {
		JsonPath js = new JsonPath(payload.CoursePrice());

		// print no of courses returned by API
		int totalCourses = js.getInt("courses.size()");
		System.out.println(totalCourses);

		// print purchased amount
		int purchasedAmount = js.getInt("Dashboard.purchaseAmount");
		System.out.println(purchasedAmount);

		// print Title of the first Course
		String firstCourseTitle = js.getString("courses[0].title");
		System.out.println(firstCourseTitle);

		// Print All courses titles and their respective prices
		for (int i = 0; i < totalCourses; i++) {
			System.out
					.println(js.getString("courses[" + i + "].title") + " " + js.getString("courses[" + i + "].price"));
		}

		// Number of copies sold by RPA Course
		int RPACopies = js.getInt("courses[2].copies");
		System.out.println(RPACopies);

		// Verify if Sum of all course price matches with purchase Amount
		int sum = 0;
		for (int i = 0; i < totalCourses; i++) {
			int price = js.getInt("courses[" + i + "].price");
			int copies = js.getInt("courses[" + i + "].copies");
			sum = sum + (price * copies);
		}

		Assert.assertEquals(sum, purchasedAmount);

	}

}
