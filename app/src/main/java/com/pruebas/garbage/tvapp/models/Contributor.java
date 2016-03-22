package com.pruebas.garbage.tvapp.models;

/**
 * Created by franciscojosesotoportillo on 29/2/16.
 */
public class Contributor {
    public final String login;
    public final int contributions;

    public Contributor(String login, int contributions) {
        this.login = login;
        this.contributions = contributions;
    }
}
