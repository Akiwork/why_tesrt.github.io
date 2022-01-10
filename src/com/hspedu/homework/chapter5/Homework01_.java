package com.hspedu.homework.chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework01_ {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(new news_("新官确诊病例"));
        list.add(new news_("男子突然想起两个月前钓的鱼还在往兜里,捞起一看赶紧放生"));
        Collections.reverse(list);

        for (Object o : list) {
            System.out.println(processTitle(str.getTitle()));
        }

    }
    static String processTitle(String titile){
        if(titile==null){
            return "";
        }
        if (titile.length()>15){
            return titile = titile.substring(0,15) + " . . . . ";
        }else {
            return titile;
        }
            news_ str = (news_)o;
    }
}
class news_{
    private String title;
    private String content;

    public news_(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "news{" +
                "title='" + title + '\'' +
                '}';
    }
}
