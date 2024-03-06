package com.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {

    public static void main(String[] args) {
        /*
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }*/


        Pattern pattern =
                Pattern.compile("foo\\.");

        Matcher matcher =
                pattern.matcher("foo in foo Bar");

        boolean found = false;
        while (matcher.find()) {
            System.out.println(String.format("I found the text" +
                            " \"%s\" starting at " +
                            "index %d and ending at index %d",
                    matcher.group(),
                    matcher.start(),
                    matcher.end()));
            found = true;
        }
        if (!found) {
            System.out.println("No match found.");
        }

        Pattern emailPpattern =
                Pattern.compile("^(.+)@(\\S+)$");
        Matcher emailMatcher =
                emailPpattern.matcher("vittalbh@gmail.com");

        if (emailMatcher.find()) {
            System.out.println("match found.");
        } else {
            System.out.println("No match found.");
        }

        Pattern strictEmailPpattern =
                Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");

        Matcher strictEmailMatcher =
                emailPpattern.matcher(".vittalbh@gmail.com");

        if (strictEmailMatcher.find()) {
            System.out.println("match found.");
        } else {
            System.out.println("No match found.");
        }
    }
}
