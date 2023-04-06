package Odev2;

public class Main {

	public static void main(String[] args) {
		CircularList liste=new CircularList();
		
		for(int i=1;i<=101;i++) {
			liste.ekle(i);
		}
		liste=liste.print(liste);
	}

}
