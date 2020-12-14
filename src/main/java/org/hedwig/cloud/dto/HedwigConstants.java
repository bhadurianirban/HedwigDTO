/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hedwig.cloud.dto;

/**
 *
 * @author bhaduri
 */
public class HedwigConstants {
    public static final String HEDWIG_SERVER = "localhost";
    public static final String HEDWIG_PORT = "8080";
    public static final String HEDWIG_BASE_URL = "Hedwig/rest";
    public static String createConnectionUrl() {
        String CONNECTION_URL = "http://"+HedwigConstants.HEDWIG_SERVER+":"+HEDWIG_PORT+"/"+HEDWIG_BASE_URL;
        return CONNECTION_URL;
    }
    public static String createConnectionUrl(String serverName,String serverPort) {
        String CONNECTION_URL = "http://"+serverName+":"+serverPort+"/"+HEDWIG_BASE_URL;
        return CONNECTION_URL;
    }
    public static String createConnectionUrl(String serverName,String serverPort,String baseUrl) {
        String CONNECTION_URL = "http://"+serverName+":"+serverPort+"/"+baseUrl;
        return CONNECTION_URL;
    }
    
    //public static final String BASE_URL = "http://35.197.31.87:8080/DGRFCloud/rest";
}
