package demo

import groovy.transform.CompileStatic

@CompileStatic
class BookShowInterceptor {


    // TODO Inject service which pbulishes messages to Rabbit

    BookShowInterceptor() {
        match(controller:"book", action:"show")
    }

    boolean after() {
        // TODO publish message via the injected service
        // Book book = model.bookInstance

        true
    }
}