package cz.torgar.exceptions;

import cz.torgar.util.Utils;

import java.util.logging.Logger;

public class Excercise2 {
    private final static Logger log = Logger.getLogger(Excercise2.class.getName());

    public void go() {
        Excercise2 excercise2 = null;
        try {
            excercise2.go();
        } catch (NullPointerException e) {
            log.severe(Utils.exceptionString(e));
        }

//        try {
//            throw new Exception("This is a serious exception!");
//        } catch (Exception e) {
//            StringWriter sw = new StringWriter();
//            e.printStackTrace(new PrintWriter(sw));
//            log.severe(sw.toString());
//        }
    }
}
