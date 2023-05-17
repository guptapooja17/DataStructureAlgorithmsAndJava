package com.java.leetcode.arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuleMatchElement {
    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        System.out.println();

        int count = new RuleMatchElement().countMatches(items, "type", "phone");
        System.out.println(count);
    }

    // My solution
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] ruleKeys = {"type", "color", "name"};
        int count = 0;
        for (int keyIndex = 0; keyIndex < ruleKeys.length; keyIndex++) {
            if(ruleKeys[keyIndex] == ruleKey) {
                for (List<String> item : items) {
                    System.out.println(item.get(keyIndex));
                    if(item.get(keyIndex).equals(ruleValue)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Leet code
    public int countMatches1(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;

        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        return res;
    }
}
