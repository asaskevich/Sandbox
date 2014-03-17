import static org.junit.Assert.*;
import org.junit.Test;

public class Example32 {
	@Test
	public void testEquals() {
		assertEquals(1 + 3, 4);
	}

	@Test
	public void testArrayEquals() {
		assertArrayEquals(new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 });
	}

	@Test
	public void testTrue() {
		assertTrue(true);
	}

	@Test
	public void testNull() {
		assertNull(null);
	}
}
