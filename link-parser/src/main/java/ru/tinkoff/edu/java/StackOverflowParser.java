package ru.tinkoff.edu.java;

import ru.tinkoff.edu.java.domain.Identifier;
import ru.tinkoff.edu.java.domain.StackOverflowId;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StackOverflowParser implements UrlParser{
    private Pattern stackOverflowPattern = Pattern.compile("https://stackoverflow.com/\\w+/(\\d+)/*");
     private Matcher matcher;
    public Integer extractId(String url) {
        if(matcher.matches()) {
            return Integer.parseInt(matcher.group(1));
        }
        return null;
    }

    @Override
    public Identifier parse(String url) {
        return new StackOverflowId(extractId(url));
    }

    @Override
    public boolean matches(String url) {
        matcher = stackOverflowPattern.matcher(url);
        return matcher.matches();
    }
}
