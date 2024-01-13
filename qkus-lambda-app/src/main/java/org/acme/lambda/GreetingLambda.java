package org.acme.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import jakarta.inject.Inject;
import org.spnd.repository.EmpRepository;

public class GreetingLambda implements RequestHandler<Person, String> {

    @Inject
    private EmpRepository empRepository;

    @Override
    public String handleRequest(Person input, Context context) {
        return "Hello Dear " + empRepository.findUser();
    }
}
