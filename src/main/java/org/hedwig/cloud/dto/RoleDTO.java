/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hedwig.cloud.dto;

import java.io.Serializable;
import java.util.Map;
/**
 *
 * @author dgrfv
 */
public class RoleDTO implements Serializable {
    private HedwigAuthCredentials cloudAuthCredentials;
    Map<String,String> roleMap;
    private int responseCode;
    private String responseMessage;

    public HedwigAuthCredentials getCloudAuthCredentials() {
        return cloudAuthCredentials;
    }

    public void setCloudAuthCredentials(HedwigAuthCredentials cloudAuthCredentials) {
        this.cloudAuthCredentials = cloudAuthCredentials;
    }

    public Map<String, String> getRoleMap() {
        return roleMap;
    }

    public void setRoleMap(Map<String, String> roleMap) {
        this.roleMap = roleMap;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }


    
}
