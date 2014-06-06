package cz.torgar.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jms.*;

@Controller
@RequestMapping(value = "/")

public class MainController {
        ConnectionFactory cf = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
//    @Autowired
//    ConnectionFactory cf;

    @RequestMapping(value = "/")
    public void control() {
        Destination queue = new ActiveMQQueue("queue.jms");
        Connection conn = null;
        Session session = null;

        try {
            conn = cf.createConnection();
            conn.start();
            session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
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
