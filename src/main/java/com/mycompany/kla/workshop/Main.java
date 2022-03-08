package com.mycompany.kla.workshop;

public class Main {
    public static void main(String[] arg){
        System.out.print("hello");
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream("customer.yaml");
        Map<String, Object> obj = yaml.load(inputStream);
        System.out.println(obj);
    }
}
