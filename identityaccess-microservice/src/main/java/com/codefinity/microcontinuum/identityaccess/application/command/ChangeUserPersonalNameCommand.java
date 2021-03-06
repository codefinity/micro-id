package com.codefinity.microcontinuum.identityaccess.application.command;

public class ChangeUserPersonalNameCommand {
    private String tenantId;
    private String username;
    private String firstName;
    private String lastName;

    public ChangeUserPersonalNameCommand(
            String tenantId, String username,
            String aFirstName, String aLastName) {

        super();

        this.tenantId = tenantId;
        this.username = username;
        this.firstName = aFirstName;
        this.lastName = aLastName;
    }

    public ChangeUserPersonalNameCommand() {
        super();
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
