package com.foxconn.offline;

import org.junit.jupiter.api.Test;

public class StringSplitTest {
    @Test
    public void testSplit1(){
        String rules="Acoustic->System EE/Desense[10]->Coex[10]";
        String rule1="Acoustic";
        new StringSplit().StepSplit(rule1);
    }
    @Test
    public void testSplit2(){
        String rule="Desense[30]/Coex/SystemEE[15]";
        String rule1="Coex";
        String rule2="Coex/Desense/SystemEE";


        int maxConfig=100;
        new StringSplit().DeptSplit(rule2,100);
    }
    @Test
    public void testnumber(){
        String rule1="Coex";
        System.out.println(ExtractTarget.ExtractTargets(rule1));
    }

}
