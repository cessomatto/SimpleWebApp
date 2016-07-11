package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("alessandro")) {
            return "Alessandro is an " +
                    "Italian poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the Italian language and the world's pre-eminent dramatist.";
        }
        return "";
    }
}
