package com.Q3.Controller;


import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class ZipCodeDetailController {

    @RequestMapping(value = "/pincode/{pin}")
    public ResponseEntity<List<ZipCodeDetail>> getZipDetail(@PathVariable("pin") String pin) throws  Exception {
        String url = "https://api.postalpincode.in/pincode/" + pin;

        // Creating the connection to get the data from api
        URL uri = new URL(url);
        HttpURLConnection con = (HttpURLConnection) uri.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        int response = con.getResponseCode();
        if (response != 200)
            throw new RuntimeException("HttpResponseCode" + response);
        else {
            Scanner sc = new Scanner(uri.openStream());
            String inline = "";
            while (sc.hasNext()) {
                inline += sc.nextLine();

            }

            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(inline);
            JSONObject jsonObject = (JSONObject) jsonArray.get(0);

            JSONArray jsonArray1 = (JSONArray) jsonObject.get("PostOffice");
            System.out.println(jsonArray1);

            List<ZipCodeDetail> list = new ArrayList<>();
            for (int i = 0; i < jsonArray1.size(); i++) {
                JSONObject jsonObject1 = (JSONObject) jsonArray1.get(i);
                ZipCodeDetail zipCodeDetail = new ZipCodeDetail();
                zipCodeDetail.setCity((jsonObject1.get("Block")).toString());
                zipCodeDetail.setState(jsonObject1.get("State").toString());
                zipCodeDetail.setCountry("India");
                list.add(zipCodeDetail);

            }

            if(list.isEmpty()){
                return new ResponseEntity<>(list, HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
        }
    }
}
