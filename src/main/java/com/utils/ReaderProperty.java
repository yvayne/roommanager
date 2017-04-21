package com.utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//import java.text.ParseException;
import java.util.Iterator;

/**
 * Created by Yuri on 4/20/2017.
 */
public class ReaderProperty {

    public static final String PROPERTY_PATH = "src/main/resources/properties.json";

    /**
     *
     * @param object
     * @param key
     * @return
     * @throws ParseException
     * @throws IOException
     */
    public static String getProperty(String object, String key) {

        try (Reader reader = new FileReader(PROPERTY_PATH)) {
            JSONParser parser = new JSONParser();
            Object jsonObj = parser.parse(reader);

            JSONObject jsonFile = (JSONObject) jsonObj;
            JSONObject jsonObject = (JSONObject) jsonFile.get(object);
            return String.valueOf(jsonObject.get(key));
        } catch (FileNotFoundException | ParseException e) {
            throw new RuntimeException("");
        } catch (IOException e) {
            throw new RuntimeException("");
        }
    }
}
