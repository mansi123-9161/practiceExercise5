package com.stackroute.pe5;

import java.util.ArrayList;

public class PrintArrayList {
    public ArrayList<String> printUpdatedArrayList(ArrayList arrayList){
        arrayList.set(0,"kiwi");
        arrayList.set(2,"mango");
        return arrayList;
    }
    public ArrayList<String> clearThePrintedArrayList(ArrayList arrayList)
    {
        arrayList.clear();
        return arrayList;
    }
}
