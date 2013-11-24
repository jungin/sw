package linkedListNew;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkListTest {

	@Test
	public void testLinkList() {
		//Constructor creates the first link that always starts as null
		LinkList theLinkedList = new LinkList();
		assertNull(theLinkedList.firstLink);
	}

	@Test
	public void testIsEmpty() {
		//Nothing on it
		LinkList theLinkedList = new LinkList();
		assertEquals(theLinkedList.isEmpty(), true);
		
		//add an element and delete it
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.removeFirst();
		assertEquals(theLinkedList.isEmpty(), true);
		
	}

	@Test
	public void testInsertFirstLink() {
		//testing insertion function
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
		theLinkedList.insertFirstLink("The Lord of the Rings", 150);
		theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);
		assertEquals(theLinkedList.firstLink.toString(), "Harry Potter and the Sorcerer's Stone"); //first element
		assertEquals(theLinkedList.firstLink.next.toString(), "The Lord of the Rings"); //second element
	}

	@Test
	public void testRemoveFirst() {
		//testing remove function
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
		theLinkedList.insertFirstLink("The Lord of the Rings", 150);
		theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);
		
		theLinkedList.removeFirst();
		assertEquals(theLinkedList.firstLink.toString(), "The Lord of the Rings");
	}

	@Test
	public void testDisplay() {
		fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveLink() {
		fail("Not yet implemented");
	}
	

}
