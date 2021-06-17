package com.priya.springweb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.priya.springweb.entities.Product;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class ProductRestApiApplicationTests {
	
	@Value("${productresapi.services.url}")
	private String baseURL;

	@Test
	public void textGetProduct() {
		RestTemplate template=new RestTemplate();
		Product product=template.getForObject(baseURL+"2", Product.class);
		System.out.println("name :"+product.getName());
		assertEquals("Mac Book Pro", product.getName());
		
		
		
	}

}
