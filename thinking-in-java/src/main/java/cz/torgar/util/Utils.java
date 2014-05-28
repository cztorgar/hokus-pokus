package cz.torgar.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class Utils {
    public static String exceptionString(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}
