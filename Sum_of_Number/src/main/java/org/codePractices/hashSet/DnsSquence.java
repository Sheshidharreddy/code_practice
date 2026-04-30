package org.codePractices.hashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DnsSquence {
    public static void main(String[] args){
        List<String> finalList = new ArrayList<>();
        DnsSquence find = new DnsSquence();
        finalList = find.dnsSquenceString("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        System.out.println("Final output " +finalList);

    }

    public List dnsSquenceString(String s){
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i = 0 ; i <= s.length() - 10 ; i++){
            String subString = s.substring(i , i + 10);
            map.put(subString, map.getOrDefault(subString, 0) +1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
