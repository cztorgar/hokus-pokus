package cz.torgar.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTextMessage;

import javax.jms.*;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory cf = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
        Connection conn = null;
        Session session = null;

        try {
            conn = cf.createConnection();
            conn.start();
            session = conn.createSession(true, Session.AUTO_ACKNOWLEDGE);
            Destination queue = new ActiveMQQueue("queue.jms");
            MessageProducer producer = session.createProducer(queue);
            MessageConsumer consumer = session.createConsumer(queue);

            TextMessage message = new ActiveMQTextMessage();
            message.setText("ahoj pico vole");

            producer.send(message);



        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
