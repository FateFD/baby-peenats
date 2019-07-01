package com.etakhee.searchservice.web;

import java.net.URI;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import lombok.*;

@RestController
@AllArgsConstructor
public class SearchRestController {

    @GetMapping("/kakaomap_search")
    @ResponseBody
    public String search_map(@RequestParam String query) {
    	
    	try {
    		RestTemplate restTemplate = new RestTemplate(); 
        	
        	HttpHeaders headers = new HttpHeaders(); 
        	headers.setContentType(MediaType.APPLICATION_JSON);//JSON
        	headers.set("Authorization", "KakaoAK" + " " + "a263ae2bb6f386cafb5b3c40803ca359");
        	
        	HttpEntity entity = new HttpEntity("parameters", headers); 
        	URI url=URI.create("https://dapi.kakao.com/v2/local/search/address.json?query=" + query); 
        	
        	ResponseEntity response= restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        	
        	System.out.println(response);

    	}catch(Exception ex) {
    		System.err.println(ex);
    	}
    	return "111";
    }
}
