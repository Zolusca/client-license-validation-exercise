package com.haslam.project_lisensi.DTO;

public class LicenseRequest {
    private String license;

    public LicenseRequest(String license) {
        this.license = license;
    }

    public LicenseRequest() {
    }

    public String getLicense() {
        return license;
    }
}
