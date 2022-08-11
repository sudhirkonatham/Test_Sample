package com.framework.implementation.utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;


public class readJsonFile {

    public static JSONParser jsonParser = new JSONParser();
    public static JSONObject environment;

     public static void getEnvironment(String Environment){
         try {
             Reader reader = new FileReader("src/test/resources/testdata/testData.json");
             JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
             environment= (JSONObject)jsonObject.get(Environment);
         } catch (ParseException | IOException e) {
             e.printStackTrace();
         }
     }

    public static String getJsonKeyValue(String key) {
        return (String)environment.get(key);
    }

}
