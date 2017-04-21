package com.utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Properties;

/**
 * Created by Yuri on 4/21/2017.
 */
public class EjemploLog4j {
    public static void main(String[] args) {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("log4j.properties"));
            PropertyConfigurator.configure(props);
            Logger log = Logger.getLogger("Logger de Ejemplo");
            log.warn("un warning");
            log.error("un error");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
