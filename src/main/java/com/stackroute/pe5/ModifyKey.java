package com.stackroute.pe5;

    import java.util.Map;
    //5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//Modify and return the given map as follows:
    public class ModifyKey
    {
        Map<String, String> modifyKeyAndValue(Map<String, String> map)
        {
            map.replace("value2", map.get("value1"));
            map.replace("value1", " ");
            return map;

        }
     }
