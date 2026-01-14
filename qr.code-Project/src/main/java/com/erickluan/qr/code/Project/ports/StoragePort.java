package com.erickluan.qr.code.Project.ports;

public interface StoragePort {

    String uploadFile(byte[] fileData, String fileName, String contentType);
}
