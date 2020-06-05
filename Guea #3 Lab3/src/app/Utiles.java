package app;

public interface Utiles {
	
	public default int randomN () {
		return (int) Math.floor(Math.random()*100000000);
	}

}
