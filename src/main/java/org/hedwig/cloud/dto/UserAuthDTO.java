/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hedwig.cloud.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dgrf-vi
 */

public class UserAuthDTO implements Serializable {
    private String userId;
    private String password;
    private int tenantId;
    private int productId;
    private int responseCode;
    private String responseMessage;
    private int roleId;
    private String roleName;
    private String name;
    private String dbAdminUser;
    private String dbAdminPassword;
    private String dbConnUrl;
    private String hedwigServer;
    private String hedwigServerPort;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbAdminUser() {
        return dbAdminUser;
    }

    public void setDbAdminUser(String dbAdminUser) {
        this.dbAdminUser = dbAdminUser;
    }

    public String getDbAdminPassword() {
        return dbAdminPassword;
    }

    public void setDbAdminPassword(String dbAdminPassword) {
        this.dbAdminPassword = dbAdminPassword;
    }

    public String getDbConnUrl() {
        return dbConnUrl;
    }

    public void setDbConnUrl(String dbConnUrl) {
        this.dbConnUrl = dbConnUrl;
    }

    public String getHedwigServer() {
        return hedwigServer;
    }

    public void setHedwigServer(String hedwigServer) {
        this.hedwigServer = hedwigServer;
    }

    public String getHedwigServerPort() {
        return hedwigServerPort;
    }

    public void setHedwigServerPort(String hedwigServerPort) {
        this.hedwigServerPort = hedwigServerPort;
    }
    
        
}
