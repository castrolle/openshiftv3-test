package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping({"/"})
    public String index() {
        return "100 hello world";
    }

 }