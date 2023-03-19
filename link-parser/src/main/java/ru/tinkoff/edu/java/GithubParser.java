package ru.tinkoff.edu.java;
import ru.tinkoff.edu.java.domain.GithubUserRepo;
import ru.tinkoff.edu.java.domain.Identifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GithubParser implements UrlParser{
    private Pattern githubPattern = Pattern.compile("https://github.com/([\\w-]+)/([\\w-]+)/");

    private Matcher matcher;
    public String extractUser(String url) {
        if(matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }
    public String extractRepo(String url) {
        if(matcher.matches()) {
            return matcher.group(2);
        }
        return null;
    }

    @Override
    public Identifier parse(String url) {
        return new GithubUserRepo(extractUser(url), extractRepo(url));
    }

    @Override
    public boolean matches(String url) {
        this.matcher = githubPattern.matcher(url);
        return matcher.matches();
    }
}
