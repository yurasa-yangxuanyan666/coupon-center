package com.foxconn.offline;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sw
 */

public class StringSplit {
    /**
     * 这是第一个分割字符串以"->"
     *
     * @param rules
     * @return
     */

    public String[] StepSplit(String rules){
        String[] array1=rules.split("->");
        System.out.println("总步数："+array1.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("\""+array1[i]+"\",");
        }
        return  array1;
    }
    public Map DeptSplit(String rules,int maxConfig){
        String[] array1=rules.split("/");
        System.out.println("部门数："+array1.length);
        Map<String,Integer> map=new HashMap<>();
        int b = 0;
        for (int i = array1.length-1; i >=0; i--) {
            if (ExtractTarget.ExtractTargets(array1[array1.length-1])==1){
                b=maxConfig;
            }else if (array1[i].contains("[")) {
                b = ExtractTarget.ExtractTargets(array1[i]);
            } else if (!array1[i].contains("[")){
                b = ExtractTarget.ExtractTargets(array1[i+1]);
            }


            map.put(array1[i], b);
            System.out.println(array1[i] + "的值为" + map.get(array1[i]));
        }
        return map;
    }
//    public int number(String rules){
//        if (rules.contains("[")){
//            String regEx="[^0-9]";
//            Pattern p = Pattern.compile(regEx);
//            Matcher m=p.matcher(rules);
//            String n=m.replaceAll("").trim();
//            int b=Integer.parseInt(n);
//            return b;
//        }
//            return 0;
//    }
//
//    public void getnumber(String rules){
//        String xixi = rules.substring(rules.indexOf("[") + 1, rules.indexOf("]"));
//        System.out.println(xixi);
//    }

}
