package cz.torgar.strings;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.logging.Logger;

class Excercise3 {
    private static final Logger log = Logger.getLogger(Excercise3.class.getName());

    void go() {
        Turtle tommy = new Turtle("tommy", new Formatter(System.out));
        Turtle greg = new Turtle("greg", new Formatter(System.err));

        tommy.move(5,3);
        greg.move(6,8);
        tommy.move(3,8);
        greg.move(5,3);
        tommy.move(5,3);
        greg.move(5,3);
    }

    class Turtle {
        private String name;
        private Formatter formatter;

        Turtle(String name, Formatter formatter) {
            this.name = name;
            this.formatter = formatter;
        }

        public void move(int x, int y) {
            formatter.format("%s moved to (%d;%d)\n", name, x, y);
        }
    }
}
