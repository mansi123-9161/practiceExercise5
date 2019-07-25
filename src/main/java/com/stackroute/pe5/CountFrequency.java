package com.stackroute.pe5;
import java.util.*;
public class CountFrequency {
    public String checkFrequencyOfCharector(String stringData){
        if(stringData==null)

            return null;

        List<String> list= Arrays.asList(stringData.split("[\\W_]+"));
        Map<String,Integer> map=new HashMap<>();
        for(String string:list) {
            if (map.containsKey(string)) {
                map.replace(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }

        Map<String,Boolean> mapValue=new HashMap<>();
        for(String string:map.keySet()){
            if(map.get(string)>=2){
                mapValue.put(string,true);
            }else {
                mapValue.put(string,false);
            }
        }
        return mapValue.toString();
    }
}
