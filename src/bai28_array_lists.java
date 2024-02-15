import java.util.ArrayList;
import java.util.List;

public class bai28_array_lists {
    public static void main(String[] args) {
        // khai bao list
        ArrayList<Integer> lst = new ArrayList<>();
        // khai bao voi so luong phan tu ban dau
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        // Khoi tao list voi cac phan tu ban dau
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);
    }
}
