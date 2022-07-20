package com.foxconn.offline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sw
 */
public class ExtractTarget {

    public static void main(String[] args) {
        String rule="Coex";
        System.out.println(ExtractTarget.ExtractTargets(rule));
    }
    public static int ExtractTargets(String dept) {
        if (dept.contains("[")) {
            String regEx = "[^0-9]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(dept);
            String n = m.replaceAll("").trim();
            return Integer.parseInt(n);
        }else {
            return 1;
        }
    }
}
