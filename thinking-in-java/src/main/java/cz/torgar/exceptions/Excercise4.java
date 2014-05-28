package cz.torgar.exceptions;

import cz.torgar.util.Utils;

import java.util.logging.Logger;

public class Excercise4 {
    private final static Logger log = Logger.getLogger(Excercise4.class.getName());

    public void go() {
        try {
            throw new MyException("Universe just ended.");
        } catch (MyException e) {
            log.severe(e.printDetailedMessage());
            e.printStackTrace();
        }
    }

    class MyException extends Exception {
        String cause;

        public MyException(String cause) {
            super(cause);
            this.cause = cause;
        }

        public String printDetailedMessage() {
            return "Exception occured. \n" +
                    "Cause: " + cause + "\n" +
                    Utils.exceptionString(this);
        }
    }

}

