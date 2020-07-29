package APITestingGetPostPutDelete;

import java.io.IOException;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.HttpResponse;


import java.net.URL;

public class UniRestHTTPRequest {
	
	public void getRequest() throws UnirestException{
		
		HttpResponse<JsonNode> jsonResponse= Unirest.get("http://dummy.restapiexample.com/api/v1/employeees").asJson();
		
		System.out.println("Status Code:" +jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}

public void postRequest() throws UnirestException{
		
		HttpResponse<JsonNode> jsonResponse= Unirest.post("http://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"Sumi\",\"salary\":\"100000\",\"age\":\"27\"}").asJson();
		
		System.out.println("Status Code:" +jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
		
		
	}
public void putRequest() throws UnirestException{
	
	HttpResponse<JsonNode> jsonResponse= Unirest.put("http://dummy.restapiexample.com/api/v1/update/26171").body("{\"name\":\"Sumi\",\"salary\":\"100000\",\"age\":\"27\"}").asJson();
	
	System.out.println("Status Code:" +jsonResponse.getStatus());
	System.out.println("Status Message:"+jsonResponse.getStatusText());
	System.out.println("Response Body:"+jsonResponse.getBody());
	
	
}
public void deleteRequest() throws UnirestException{
	
	HttpResponse<JsonNode> jsonResponse= Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/26171").body("{\"name\":\"Sumathi\",\"salary\":\"100000\",\"age\":\"27\"}").asJson();
	
	System.out.println("Status Code:" +jsonResponse.getStatus());
	System.out.println("Status Message:"+jsonResponse.getStatusText());
	System.out.println("Response Body:"+jsonResponse.getBody());
	
	
}


	
	public static void main(String[] args) throws UnirestException {
	
		UniRestHTTPRequest uniRestObj= new UniRestHTTPRequest();
	    uniRestObj.getRequest();
		uniRestObj.postRequest();
		uniRestObj.putRequest();
		uniRestObj.deleteRequest();
	}

}
