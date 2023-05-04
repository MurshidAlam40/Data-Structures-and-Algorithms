import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int n = read.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                a.add(read.nextInt());
            }
            
            HashSet<Integer> set = new HashSet<Integer>(a);
            for (int element : set) {
                System.out.print(element + " ");
            }
            System.out.println();

            ArrayList<Integer> frequency = new ArrayList<Integer>();
            for (int element : set) {
                int count = Collections.frequency(a, element);
                frequency.add(count);
            }
            
            for (int count : frequency) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
        
    }
}
