
public class Lampadina {
	boolean state;

	public Lampadina(boolean onOff) { 
		state = onOff;
	}
	
	public boolean getState(){
		return state;
	}
	
	public boolean turnOn(){
		state = true;
		return state;
	}
	
	public boolean turnOff(){
		state = false;
		return state;
	}
}
