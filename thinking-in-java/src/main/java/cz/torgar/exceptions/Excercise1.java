package cz.torgar.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Excercise1 {
    private final static Logger log = Logger.getLogger(Excercise1.class.getName());

    public void go() {
        try {
            throw new Exception("This is a serious exception!");
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            log.severe(sw.toString());
        } finally {
            log.info("Finally we are here.");
        }
    }
}
