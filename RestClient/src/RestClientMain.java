import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.client.ClientProtocolException;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

public class RestClientMain {

	
		public static void main(String[] args) {
			  try {

				ClientRequest request = new ClientRequest(
						"http://localhost:8080/javaMonkey/rest/xml/user/get");
				request.accept("application/xml");
				
		
				
				
				ClientResponse<User> response = request.get(User.class);

				if (response.getStatus() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
				}

//				BufferedReader br = new BufferedReader(new InputStreamReader(
//					new ByteArrayInputStream(response.getEntity().getBytes())));
//
//				String output;
//				System.out.println("Output from Server .... \n");
//				while ((output = br.readLine()) != null) {
//					System.out.println(output);
//				}

				
				  User user = response.getEntity();
//				  String userName=response.getEntity().getUsername();
//				  String passWord= response.getEntity().getPassword();
//				  String pin =response.getEntity().getPin();
//				  
//				     User user=new User();
//				     user.setUsername(userName);
//				     user.setPassword(passWord);
//				     user.setPin(pin);
				    //verify the user object
				    System.out.println(user.getUsername());
				    System.out.println(user.getPassword());
				    System.out.println(user.getPin());
				
				
			  } catch (ClientProtocolException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  } catch (Exception e) {

				e.printStackTrace();

			  }

			}


}
