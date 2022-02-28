import java.io.*;    
import java.net.*;    

public class GetRequestLab1
{
	public static void main(String[] args) {
		try {

            String readJSON;
            URL getURL = new URL("https://jsonplaceholder.typicode.com/posts/");

            HttpURLConnection createdConnection = (HttpURLConnection)getURL.openConnection();  
            
            createdConnection.setRequestMethod("GET");
            createdConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Safari/537.36");
            int getResponseCode = createdConnection.getResponseCode();

            if (getResponseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader inputReader = new BufferedReader(new InputStreamReader(createdConnection.getInputStream()));
                
                StringBuffer response = new StringBuffer();
                while ((readJSON = inputReader.readLine()) != null) {
                    response.append(readJSON);
                }
                inputReader.close();
                
                System.out.println(response.toString());
            } else {
                System.out.println("GET method not working.");
            }

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
