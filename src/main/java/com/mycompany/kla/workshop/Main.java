package com.mycompany.kla.workshop;

import java.io.InputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class Main {
    public static void main(String[] arg){
        System.out.print("hello");
        Parse parse  = new Parse();
        parse.parseYaml();
    }
}
class Parse {
    public void parseYaml(){
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream("C://Users/raush/Desktop/KLA/problem/DataSet/Milestone1/Milestone1A.yaml");
        //dataType obj = yaml.load(inputStream);
        //System.out.println(obj);
    }
}
