package cz.torgar.exceptions;

import cz.torgar.util.Utils;

import java.util.logging.Logger;

public class Excercise5 {
    private final static Logger log = Logger.getLogger(Excercise5.class.getName());
    int i = 10;

    public void go() {

        while (true) {
            try {
                thrower();
                break;
            } catch (Exception e) {
                log.severe(Utils.exceptionString(e));
                log.info("Increasing i to " + --i);
            }
        }

        log.info("Out of while cycle i is " + i);


    }

    public void thrower() throws Exception {
        if (i != 0)
            throw new Exception();
    }
}

