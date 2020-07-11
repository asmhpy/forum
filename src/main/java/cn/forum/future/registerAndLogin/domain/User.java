package cn.forum.future.registerAndLogin.domain;

/**
 * 用户信息
 */

public class User {
    private Long adminId;
    private String adminName;
    private String adminPassworld;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassworld() {
        return adminPassworld;
    }

    public void setAdminPassworld(String adminPassworld) {
        this.adminPassworld = adminPassworld;
    }

    @Override
    public String toString() {
        return "User{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminPassworld='" + adminPassworld + '\'' +
                '}';
    }
}
