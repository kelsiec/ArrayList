public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);

        System.out.println(contains(list, 5));

        ArrayList<Integer> reverseList = reverse(list);
        System.out.println(reverseList);

    }

    public static <E> ArrayList<E> reverse(ArrayList<E> list) {
        ArrayList<E> reverseList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }

        return reverseList;
    }

    public static <E> boolean contains(ArrayList<E> list, E value) {
        for (E element : list) {
            if (element.equals(value)) {
                return true;
            }
        }

        return false;
    }

}
