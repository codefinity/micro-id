package com.codefinity.microcontinuum.identityaccess.application.command;

public class ProvisionRoleCommand {

    private String description;
    private String tenantId;
    private String roleName;
    private boolean supportsNesting;

    public ProvisionRoleCommand(
            String tenantId,
            String roleName,
            String description,
            boolean supportsNesting) {

        super();

        this.description = description;
        this.roleName = roleName;
        this.supportsNesting = supportsNesting;
        this.tenantId = tenantId;
    }

    public ProvisionRoleCommand() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isSupportsNesting() {
        return supportsNesting;
    }

    public void setSupportsNesting(boolean supportsNesting) {
        this.supportsNesting = supportsNesting;
    }
}
