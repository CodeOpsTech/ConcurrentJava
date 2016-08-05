// Copyright: Ganesh Samarthyam, 2016; www.codeops.tech

import java.util.Arrays;

class StringConcatenator {
    public static String result = "";
    public static void concatStr(String str) {
        result = result + " " + str;
    }
}

class StringSplitAndConcatenate {
    public static void main(String []args) {
        String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
        Arrays.stream(words).parallel().forEach(StringConcatenator::concatStr);
        System.out.println(StringConcatenator.result);
    }
}

