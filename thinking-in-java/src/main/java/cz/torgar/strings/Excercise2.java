package cz.torgar.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class Excercise2 {
    private static final Logger log = Logger.getLogger(Excercise2.class.getName());

    void go() {
        List<Excercise2> infiniteRecursionList = new ArrayList<Excercise2>();
        for(int i = 1;i<=10;i++) {
            infiniteRecursionList.add(new Excercise2());
        }
        System.out.println(infiniteRecursionList);

    }

    @Override
    public String toString() {
        return "Infinite recursion address is " + super.toString() + "\n";
    }
}
