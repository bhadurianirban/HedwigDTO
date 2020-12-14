/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hedwig.cms.dto;

import org.hedwig.cloud.dto.HedwigAuthCredentials;

/**
 *
 * @author dgrfi
 */
public class CMSDTO {
    private HedwigAuthCredentials hedwigAuthCredentials;
    private int responseCode;
    private String responseMessage;

    public HedwigAuthCredentials getHedwigAuthCredentials() {
        return hedwigAuthCredentials;
    }

    public void setHedwigAuthCredentials(HedwigAuthCredentials hedwigAuthCredentials) {
        this.hedwigAuthCredentials = hedwigAuthCredentials;
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
