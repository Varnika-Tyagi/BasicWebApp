package com.develogical;

import java.util.Locale;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("hello")) {
            return "hello to you too!";}
        else if (query.toLowerCase().contains("what is your name")){
            return "";
        }
        return "";
    }
}
