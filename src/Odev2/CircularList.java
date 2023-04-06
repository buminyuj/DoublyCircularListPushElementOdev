package Odev2;

public class CircularList {
	Node head;
	Node tail;
	public void ekle(int data) {
		   Node yeniDugum=new Node(data);
	       if(head==null) {
	    	   head=yeniDugum;
	    	   tail=yeniDugum;
	    	   head.prev=tail;
	    	   tail.next=head;
	       }
	       else {
	    	   tail.next=yeniDugum;
	    	   yeniDugum.next=head;
	    	   head.prev=yeniDugum;
	    	   tail=yeniDugum;
	       }
	}
	
	public CircularList print(CircularList liste) {
		Node current=liste.head;
		int p=0;
		int t=0;
		while(current!=tail) {
			p++;
			t++;
			if(t<10) {
				System.out.print(" ");
			}
			System.out.print(current.data+" ");
			current=current.next;
			if(p%20==0) {
				System.out.println();
			}
			
		}
		return liste;
	}
}
