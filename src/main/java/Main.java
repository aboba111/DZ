import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.add("Bird");
        list.add("Cat1");
        list.add("Dog1");
        list.add("Bird1");
        // проверка добавления и получения
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i).toString());
        }
        myArrayList.remove(0);
        // проверка удаления
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i).toString());
        }
        // проверка добавления коллекции
        myArrayList.addAll(list);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i).toString());
        }

        List<Integer> array = List.of(87, 12, 56,
                23, 98, 45,
                34, 67, 54,
                89, 78, 43,
                21, 76, 32,
                65, 90, 10,
                99, 11);

        MyArrayList<Integer> listFotSorted = new MyArrayList<>();
        listFotSorted.addAll(array);
        listFotSorted.sort((o1, o2) -> o1 - o2);
        for (int i = 0; i < listFotSorted.size(); i++) {
            System.out.println(listFotSorted.get(i).toString());
        }
    }
}
