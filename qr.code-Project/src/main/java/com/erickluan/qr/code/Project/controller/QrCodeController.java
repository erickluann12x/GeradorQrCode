package com.erickluan.qr.code.Project.controller;

import com.erickluan.qr.code.Project.dto.QrCodeGenerateRequest;
import com.erickluan.qr.code.Project.dto.QrCodeGenerateResponse;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request){
        return null;
    }
}
