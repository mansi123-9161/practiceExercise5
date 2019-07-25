package com.stackroute.pe5;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
public class SetSorting {
    ArrayList<String> setArraySort(ArrayList<String> list)
    {

        TreeSet<String> set = new TreeSet<String>(list);
        ArrayList<String> arrayList=new ArrayList<String>(set);
        return arrayList;
    }
}
