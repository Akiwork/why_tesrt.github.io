package com.hspedu.Wrapper.StringBuffer;

public class Stringbuffer_01 {
    public static void main(String[] args) {
        String price = "8435131321.54";
        StringBuffer strbuf = new StringBuffer(price);

        for (int i = strbuf.indexOf(".")-3; i > 0; i -= 3) {
            strbuf.insert(i,",");
        }
        System.out.println(strbuf);
    }
}