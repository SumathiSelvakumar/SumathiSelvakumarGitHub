package APITestingGetPostPutDelete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class HttpURLConnectionExample { //using Java.Net - use all libraries for practice - Unirest ,restassure,google, Apache, http client
	
	public void getRequest() throws IOException{
	
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employeees");
	
	    HttpURLConnection connection =(HttpURLConnection)url.openConnection();
	  
		connection.setRequestMethod("GET");
		connection.connect();
		int statuscode = connection.getResponseCode();
		
		System.out.println("Status code is:"+statuscode);
		
		String message =connection.getResponseMessage();
		System.out.println("Response Message:" +message);
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputstream);
		BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		
		while ((line=bufferedReader.readLine())!=null){
			
			buffer.append(line);
			
		}
		System.out.println(line);
		
	}
	
	public void postRequest() throws IOException {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type" ,"application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Sumi\",\"salary\":\"100000\",\"age\":\"1\"}";
		byte[] inputJson=jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		System.out.println("Response code:"+connection.getResponseCode());
		System.out.println("Response code:"+connection.getResponseMessage());
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputstream);
		BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		
		while ((line=bufferedReader.readLine())!=null){
			
			buffer.append(line);
			
		}
		System.out.println(line);
		
	}
	public void putRequest() throws IOException {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/26081");
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type" ,"application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Sumi\",\"salary\":\"100000\",\"age\":\"27\"}";
		byte[] inputJson=jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		System.out.println("Response code:"+connection.getResponseCode());
		System.out.println("Response code:"+connection.getResponseMessage());
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputstream);
		BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		
		while ((line=bufferedReader.readLine())!=null){
			
			buffer.append(line);
			
		}
		System.out.println(line);
		
	}
    public void deleteRequest() throws IOException {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/26081");
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type" ,"application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Sumi\",\"salary\":\"100000\",\"age\":\"27\"}";
		byte[] inputJson=jsonBody.getBytes();
		
		
		System.out.println("Response code:"+connection.getResponseCode());
		System.out.println("Response code:"+connection.getResponseMessage());
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputstream);
		BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		
		while ((line=bufferedReader.readLine())!=null){
			
			buffer.append(line);
			
		}
		System.out.println(line);
		
	}


	public static void main(String[] args) throws IOException {
		
		HttpURLConnectionExample connectionRequest =new HttpURLConnectionExample();
		connectionRequest.getRequest();
		
		connectionRequest.postRequest();
		
		connectionRequest.putRequest();
		

	}

}
