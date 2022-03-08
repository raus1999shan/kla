/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kla.workshop;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author raush
 */
public class dataType {
    private String type;
    private String execution;
    private List<tasks> activities;
}

class tasks{
    private String type;
    private String functions;
    private HashMap<String,String> inputs;
}
