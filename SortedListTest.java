import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedListTest {

	@Test
	public void testSize() {
		SortedList<Integer> list = new SortedList<>();
		list.insertInOrder(1);
		assertEquals(list.size(), 1);
	}
	@Test
	public void testRemove1() {
		SortedList<Integer> list = new SortedList<>();
		list.insertInOrder(1);
		list.insertInOrder(0);
		list.insertInOrder(-5);
		list.remove(0);
		assertEquals(list.size(), 2);
	}
	@Test
	public void testRemove2() {
		SortedList<Integer> list = new SortedList<>();
		list.insertInOrder(1);
		list.insertInOrder(0);
		list.insertInOrder(-5);
		list.remove(0);
		list.remove(-5);
		assertEquals(list.size(), 1);
	}
}
