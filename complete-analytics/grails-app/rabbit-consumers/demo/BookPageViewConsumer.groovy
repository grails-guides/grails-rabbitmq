package demo

import com.budjb.rabbitmq.consumer.MessageContext

class BookPageViewConsumer {

    BookPageViewGormService bookPageViewGormService

    static rabbitConfig = [
            queue: "bookQueue"
    ]

    /**
     * Handle an incoming RabbitMQ message.
     *
     * @param body    The converted body of the incoming message.
     * @param context Properties of the incoming message.
     * @return
     */
    def handleMessage(Map body, MessageContext messageContext) {
        // TODO: Handle messages
        println 'testing ' + body
        bookPageViewGormService.increment((Long) body.id, (String) body.title)
    }
}
