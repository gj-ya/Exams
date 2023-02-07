import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        exam1();
    }

    public static void exam1(){
        int [] i = {1, 2, 4, 4, 0, 0, 4, 4, 5, 5, 7, 8, 8, 8, 9, 1, 0};
        
        List<Integer> list = new ArrayList<>();

        for(int a = 0 ; a < i.length ; a++){
            if(a==0){
                list.add(i[a]);
            }else if(i[a] != i[a-1]){
                list.add(i[a]);
            }
        }
        System.out.println(list);
        
    }
}
