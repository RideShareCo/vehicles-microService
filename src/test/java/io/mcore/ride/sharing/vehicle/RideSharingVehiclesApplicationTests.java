package io.mcore.ride.sharing.vehicle;

import java.net.URI;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RideSharingVehiclesApplicationTests {

	@Autowired DiscoveryClient client;
	
	public String getVehicle(String service) {
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0 ) {
      	URI uri = list.get(0).getUri();
		System.out.println("uri:::."+uri);
	      	if (uri !=null ) {
	      		return (new RestTemplate()).getForObject(uri,String.class);
	      	}
        }
        return null;
	}

	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getBrandBy() {
		System.out.println("getBrandBy");
		String brand = getVehicle("Vehicles");
		System.out.println(brand);
	}

}
