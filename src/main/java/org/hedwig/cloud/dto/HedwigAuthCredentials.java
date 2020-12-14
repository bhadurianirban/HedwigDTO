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
public class HedwigAuthCredentials {
    private String userId;
    private String password;
    private int roleId;
    private int tenantId;
    private int productId;
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

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
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
