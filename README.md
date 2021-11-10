"# musical-octo-chainsaw" 
import java.io.*;
import java.net.*;
import java.util.*;

public class EchoClient
{
public static void main(String args[])
{
System.out.println("Echo Client");
try
{
InetAddress localhost=InetAddress.getLocalHost();
Socket socket=new Socket(localhost,8000);
PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
BufferedReader buffer=new BufferedReader(new InputStreamReader(socket.getInputStream()));
System.out.println("WE r connected with server");
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("please enter text");
String input=sc.nextLine();
if("exit".equalsIgnoreCase(input))
{
break;
}
out.println(input);
String response=buffer.readLine();
System.out.println("server reponse is :"+response);
}
}
catch(Exception e1)
{
e1.printStackTrace();
}


}
}
g
