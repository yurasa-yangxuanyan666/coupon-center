package com.foxconn.offline;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @author sw
 */
public class RuleSplit {
    public static void main(String[] args) {
        int maxConfig=500;
        StringSplit split=new StringSplit();
        String rules="Coex[22]->EMC[10]/Desense/CoEx[12]->EMC/Desense/CoEx->EMC[10]/Desense/CoEx";
        String[] step =split.StepSplit(rules);
        Map<Integer,Map> map = new TreeMap<>();
        for (int i = 0; i < step.length; i++) {
            System.out.print("第"+(i+1)+"步");
            map.put(i,split.DeptSplit(step[i],maxConfig));
        }

    }
}
