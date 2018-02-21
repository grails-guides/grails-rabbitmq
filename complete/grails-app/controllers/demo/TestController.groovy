package demo

import com.budjb.rabbitmq.publisher.RabbitMessagePublisher

class TestController {
    RabbitMessagePublisher rabbitMessagePublisher

    def index() {
        def result =  rabbitMessagePublisher.rpc {
            routingKey = "testqueue"
            body = "Hello!"
            timeout = 20 * 60 * 1000
        }
        println 'TESTING INDEX'
        render result
    }
}
