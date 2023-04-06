//JT1

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give length of array ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("give space seperated array elements ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int ans[] = twoSum(a);

        for(int i = 0; i < ans.length; i++){
            if(i > 0)
            System.out.print(", ");
            System.out.print(ans[i]);
        }

    }

    public static int[] twoSum(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        boolean found = twoSum(numbers, 0, 0, list);
        if (found) {
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
        return null;
    }
    
    public static boolean twoSum(int[] numbers, int from, int target,
            List<Integer> list) {
        for (int i = from; i < numbers.length; i++) {
            int current = numbers[i];
            list.add(current);
            int newTarget = target-current;
            if (newTarget == 0) {
                return true;
            }
            boolean found = twoSum(numbers, i+1, newTarget, list);
            if (found) {
                return true;
            }
            list.remove(list.size()-1);
        }
        return false;
    }
}

