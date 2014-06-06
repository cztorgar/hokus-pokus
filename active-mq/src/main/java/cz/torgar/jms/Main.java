package cz.torgar.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

import javax.jms.*;


public class Main {
    public static void main(String[] args) {
        ConnectionFactory cf = new ActiveMQConnectionFactory();
        Destination destination = new ActiveMQQueue("queue.jms");

        try {
            Connection connection = cf.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageConsumer consumer = session.createConsumer(destination);
            connection.start();
            //synchronously get message
            Message message = consumer.receive();
            if (message instanceof TextMessage) {
                TextMessage text = (TextMessage) message;
                System.out.println(text.getJMSDestination() + " " + text.getText());
            }
        } catch (JMSException e) {
            throw new RuntimeException("Fatal error getting JMS message", e);
        }
    }
}
