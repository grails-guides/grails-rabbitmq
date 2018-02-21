package demo

import com.budjb.rabbitmq.publisher.RabbitMessagePublisher
import groovy.transform.CompileStatic

@CompileStatic
class BookShowInterceptor {
    // TODO Inject service which publishes messages to Rabbit - DONE
    RabbitMessagePublisher rabbitMessagePublisher

    BookShowInterceptor() {
        match(controller:"book", action:"show")
    }

    boolean after() {
        // TODO publish message via the injected service
        final Book book = (Book) model.bookInstance
        println book
        println book.id

        rabbitMessagePublisher.send {
            routingKey = "bookQueue"
            body = [id: book.id, title: book.title]
        }
        true
    }
}