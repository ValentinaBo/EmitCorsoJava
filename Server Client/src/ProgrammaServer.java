import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProgrammaServer {

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(5000)) {
			Socket s = ss.accept();
			echo(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void echo(Socket s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String messaggio = br.readLine();
		System.out.println(messaggio);
		
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		pw.println("echo: " + messaggio);
	}

}
