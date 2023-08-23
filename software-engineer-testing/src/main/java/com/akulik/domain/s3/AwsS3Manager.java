package com.akulik.domain.s3;

import io.awspring.cloud.s3.S3Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class AwsS3Manager {

    @Value("s3://register-bucket/samplefile.txt")
    private Resource s3SampleFile;

    public void updateRegistry(String data) {
        try (OutputStream outputStream = ((S3Resource) s3SampleFile).getOutputStream()) {
            outputStream.write(data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
