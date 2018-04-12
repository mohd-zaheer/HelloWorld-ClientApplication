package helloworldstandaloneclientapp;

import java.util.Scanner;
import com.me.HelloService;
import com.me.HelloService_Service;
import com.me.Sayhello;
/**
 *
 * @author zaheer
 */

public class HelloWorldStandaloneClientApp 
{
 public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HelloService_Service service = new HelloService_Service();
        HelloService port = service.getHelloServicePort();
        System.out.print("Enter Your SweetName: ");
        String name=sc.next();
        System.out.println(port.sayhello(name));
    }      
}