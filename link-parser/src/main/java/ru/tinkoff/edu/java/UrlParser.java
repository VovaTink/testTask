package ru.tinkoff.edu.java;

import ru.tinkoff.edu.java.domain.Identifier;

public interface UrlParser {
    Identifier parse(String url);
    boolean matches(String url);
}
