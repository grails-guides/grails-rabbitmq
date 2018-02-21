package myapp

import com.budjb.rabbitmq.consumer.MessageContext

class TestConsumer {

    static rabbitConfig = [
            queue: "testqueue"
    ]

    /**
     * Handle an incoming RabbitMQ message.
     *
     * @param body    The converted body of the incoming message.
     * @param context Properties of the incoming message.
     * @return
     */
    def handleMessage(String body, MessageContext context) {
        println 'test ' + body
        return "Hello to you, too!"
    }
}
