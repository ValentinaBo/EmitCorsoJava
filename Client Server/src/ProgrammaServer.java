

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaServer {
	
	List<Socket> clientConnessi;
	
	public static void main(String[] args) {
		ProgrammaServer prg = new ProgrammaServer();
		prg.avvia();
	}
	
	public void avvia() {
		clientConnessi = new ArrayList<Socket>();
		try (ServerSocket ss = new ServerSocket(5000)) {
			System.out.println("Server avviato sulla porta 5000");
			while(true) {
				Socket s = ss.accept();
				clientConnessi.add(s);
				System.out.println("Nuova connessione da " + s.getRemoteSocketAddress().toString());
				new Thread(() -> {
					try {
						for (Socket i:clientConnessi) {
							//System.out.println(i.getRemoteSocketAddress());
							echo(s, i.getRemoteSocketAddress());
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}).start();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void echo(Socket s, SocketAddress sa) throws IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(s.getInputStream()));
		PrintWriter pw = 
				new PrintWriter(
						new OutputStreamWriter(s.getOutputStream()));		
		String messaggio = "";
		while(!messaggio.equals("esci")) {
			messaggio = br.readLine();
			System.out.println("console: " + sa + ": " + messaggio);
			pw.println("socket : " + sa + ": " + messaggio);
			pw.flush();
		}
		s.close();
	}
}
