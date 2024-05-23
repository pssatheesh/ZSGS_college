package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubsetL78 {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }

        }
        return outer;
    }

    public static void main(String[] args) {
        int []arr={1,2,3};
        List<List<Integer>> ans=subsets(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
}
