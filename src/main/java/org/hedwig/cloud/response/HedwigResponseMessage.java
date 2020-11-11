/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hedwig.cloud.response;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bhaduri
 */
public class HedwigResponseMessage {
    protected Map <Integer,String> responseMessageMap;

    public HedwigResponseMessage() {
        responseMessageMap = new HashMap<>();
        responseMessageMap.put(HedwigResponseCode.SUCCESS, "Success");
        responseMessageMap.put(HedwigResponseCode.SERVICE_CONNECTION_FAILURE, "Connection to the web service could not be established. Contact Admin");
        responseMessageMap.put(HedwigResponseCode.JSON_FORMAT_PROBLEM, "JSON Processing problem");
        
        responseMessageMap.put(HedwigResponseCode.TERM_NOT_EXISTS, "Term does not exist.");
        responseMessageMap.put(HedwigResponseCode.TERM_META_NOT_EXISTS, "Term meta definition does not exist.");
        responseMessageMap.put(HedwigResponseCode.TERM_INSTANCE_NOT_EXISTS, "Term instance does not exist.");
        
        responseMessageMap.put(HedwigResponseCode.DB_DUPLICATE, "Duplicate key in DB. Contact admin.");
        responseMessageMap.put(HedwigResponseCode.DB_NON_EXISTING, "Key not in DB. Contact admin.");
        responseMessageMap.put(HedwigResponseCode.DB_ILLEGAL_ORPHAN, "Illegal orphan in DB. Contact admin.");
        responseMessageMap.put(HedwigResponseCode.DB_SEVERE, "Severe error in DB. Contact admin.");
        
        
        responseMessageMap.put(HedwigResponseCode.SUBSCRIPTION_NOT_ACTIVE, "Subscription of the host is not active: Contact Admin.");
        responseMessageMap.put(HedwigResponseCode.USER_EXCEEDED, "Sorry, Number of users exceeded");
        responseMessageMap.put(HedwigResponseCode.NO_RESPONSE, "Server Not Responding: Contact Admin");
        responseMessageMap.put(HedwigResponseCode.NO_USER, "User not registered");
        responseMessageMap.put(HedwigResponseCode.USER_INACTIVE, "User not Active: Contact Admin");
        responseMessageMap.put(HedwigResponseCode.PASSWORD_INCORRECT, "Incorrect Password");
        responseMessageMap.put(HedwigResponseCode.NO_SUBCRIPTION, "No subcription for this product");
        responseMessageMap.put(HedwigResponseCode.SUBSCRITION_AUTH_FAIL, "Subscription not authorised");
        responseMessageMap.put(HedwigResponseCode.DATA_CONN_ERROR, "Database connection cannot be established.");
        responseMessageMap.put(HedwigResponseCode.DB_SIZE_EXCEED, "Database size exceeded.");
        responseMessageMap.put(HedwigResponseCode.WRONG_ATTEMPTS_EXCEED, "You are now an inactive user, contact admin to active.");
        

        
        responseMessageMap.put(HedwigResponseCode.AmazonClientException, "Caught an AmazonClientException, which means the client encountered a serious internal problem while trying to communicate with S3, such as not being able to access the network.");
        responseMessageMap.put(HedwigResponseCode.AmazonServiceException, "AmazonServiceException Amazon S3 request was rejected with an error response for some reason.");
    }
    public String getResponseMessage (Integer responseCode) {
        return responseMessageMap.get(responseCode);
    }
    
}
