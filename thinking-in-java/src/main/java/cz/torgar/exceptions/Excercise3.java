package cz.torgar.exceptions;

import java.util.logging.Logger;

public class Excercise3 {
    private final static Logger log = Logger.getLogger(Excercise3.class.getName());

    public void go() {
        int[] array = new int[3];

        int i = 0;
        while (true) {
            log.info("Printing i=" + i + " with value=" + array[i]);
            i++;
        }
    }
}
