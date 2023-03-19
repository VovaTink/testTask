package ru.tinkoff.edu.java;

import ru.tinkoff.edu.java.domain.Identifier;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c";
        Identifier result = parse(url);
    }

    private static Identifier parse(String url) {
        List<UrlParser> urlParsers = List.of(new GithubParser(), new StackOverflowParser());
        return urlParsers.stream()
                .filter(urlParser -> urlParser.matches(url))
                .findFirst()
                .map(urlParser -> urlParser.parse(url))
                .orElse(null);
    }
}