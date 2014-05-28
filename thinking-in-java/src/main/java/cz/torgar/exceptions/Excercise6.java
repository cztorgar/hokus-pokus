package cz.torgar.exceptions;

import java.util.logging.Logger;

class Excercise6 {
    private final static Logger log = Logger.getLogger(Excercise6.class.getName());

    public void go() {
        try {
            throw new InnerException1("Je to v prdeli");
        } catch (InnerException1 e) {
              e.printStackTrace(System.out);
        }

    }

    class InnerException1 extends Exception {
        private String message;

        public InnerException1(String message) {
            super(message);
            this.message = message;
        }

        @Override
        public String getMessage() {
            return "Exception occured\n" +
                    super.getMessage();
        }
    }
}

