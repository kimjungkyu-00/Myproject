package spring.mvc.service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;


@Service
public class NaverServiceImpl implements NaverService{
	public static StringBuilder sb;//

	
	public List getData() throws IOException, ParseException {
		String clientId = "HWE9yKKnGgl7f6NS1p0Q";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "_TxS6gq9Tt";//애플리케이션 클라이언트 시크릿값";
        
        String text = URLEncoder.encode("유기견", "UTF-8");
        String apiURL = "https://openapi.naver.com/v1/search/news.json?query="+ text; // json 결과
        //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
        URL url = new URL(apiURL);
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("X-Naver-Client-Id", clientId);
        con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == 200) { 
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else { 
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            sb = new StringBuilder();
            String line;
 
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
        }
        br.close();
        con.disconnect();
		
        String data = sb.toString();        
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObj = (JSONObject) jsonParser.parse(new StringReader(data));
        Object itemobj = (Object)jsonObj.get("items");
        JSONArray jarr = new JSONArray();
        
        if(itemobj.getClass().getTypeName().contains("JSONArray")) {
        	jarr = (JSONArray) itemobj;
        }else { 
        	jarr.add(itemobj);
        }
        
        return jarr;
        

            
            
            
            
	}
}
	



