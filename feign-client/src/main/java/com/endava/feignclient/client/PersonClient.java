package com.endava.feignclient.client;

import com.endava.feignclient.model.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@FeignClient(name = "personClient", url = "http://localhost:8081/person")
public interface PersonClient {
    @RequestMapping(method = RequestMethod.GET)
    List<Person> findAll();
}
