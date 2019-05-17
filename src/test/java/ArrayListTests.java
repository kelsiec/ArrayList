import org.junit.Assert;
import org.junit.Test;

public class ArrayListTests {
    @Test
    public void testGetElement() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Assert.assertEquals(5, list.size());
        Assert.assertEquals((Integer) 4, list.get(4));
    }

    @Test
    public void testIncreaseCapacity() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            list.add(i);
        }

        Assert.assertEquals(12, list.size());
        Assert.assertEquals((Integer) 11, list.get(11));
    }

    @Test
    public void testToString() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Assert.assertEquals("[0, 1, 2, 3, 4]", list.toString());
    }

    @Test
    public void testIterator() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer element : list) {
            sb.append(element);
        }

        Assert.assertEquals("01234", sb.toString());
    }

    @Test
    public void testIsEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        Assert.assertFalse(list.isEmpty());
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        list.get(5);
    }

}