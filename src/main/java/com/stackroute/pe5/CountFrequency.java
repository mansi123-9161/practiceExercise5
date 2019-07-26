package com.stackroute.pe5;
import java.util.*;
public class CountFrequency {
    /*Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/
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
// for printing true if key appears more than one time
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
