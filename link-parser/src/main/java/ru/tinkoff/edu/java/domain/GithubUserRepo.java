package ru.tinkoff.edu.java.domain;

public class GithubUserRepo implements Identifier{
    private final String user;
    private final String repo;

    public GithubUserRepo(String user, String repo) {
        this.user = user;
        this.repo = repo;
    }
}
