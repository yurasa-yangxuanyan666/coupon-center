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
        new StringSplit().DeptSplit(rule);
    }
/*    @Test
    public void testNumber(){
        String rules="Coex[20]";
        String rule1="Desense";
        System.out.println(new StringSplit().number(rule1));
    }*/

}
