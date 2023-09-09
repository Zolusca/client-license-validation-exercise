package com.haslam.project_lisensi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;
import java.util.Map;

public class HttpController {
    private static final String URL_FIND_LICENSEKEY="http://localhost:8080/license/find";
//    public void doPostValidationLicenseKey(String licenseKey)
//    {
//        HttpClient httpClient = HttpClientBuilder.create().build();
//
//        HttpPost postRequest = new HttpPost(URL_FIND_LICENSEKEY);
//        postRequest.setHeader("Content-type","application/json");
//
//        String json = createJson(Map.of("license",licenseKey));
//        StringEntity jsonEntityData = new StringEntity(json);
//
//        postRequest.setEntity(jsonEntityData);
//
//        try {
//            HttpResponse response = httpClient.execute(postRequest);
//            HttpEntity entity = response.;
//            String responseData = EntityUtils.toString(entity);
//
//            System.out.println(responseData);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    public static String createJson(Map<String,String> data){
        ObjectMapper objectMapper = new ObjectMapper();
        String json= null;

        try {
             json = objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            System.out.println("something wrong on json processing...");
            System.out.println(e.getOriginalMessage());

            throw new RuntimeException(e);
        }
        return json;
    }
}
