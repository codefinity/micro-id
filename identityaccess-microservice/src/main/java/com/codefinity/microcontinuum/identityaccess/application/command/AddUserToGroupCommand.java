package com.codefinity.microcontinuum.identityaccess.application.command;

public class AddUserToGroupCommand {

    private String tenantId;
    private String groupName;
    private String username;

    public AddUserToGroupCommand(String tenantId, String groupName, String username) {
        super();

        this.tenantId = tenantId;
        this.groupName = groupName;
        this.username = username;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
