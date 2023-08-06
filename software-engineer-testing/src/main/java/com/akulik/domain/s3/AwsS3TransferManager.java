package com.akulik.domain.s3;

import io.awspring.cloud.s3.S3Resource;
import io.awspring.cloud.s3.S3Template;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Service
@RequiredArgsConstructor
public class AwsS3TransferManager {

    private final S3Template s3Client;
    @Value("${app.bucket-name}")
    private String bucketName;

    public void uploadFile() {
        InputStream is = null;
        try {
            is = new FileInputStream("/Users/akulik/IdeaProjects/software-engineer/software-engineer-testing/src/main/resources/text.txt");
        } catch (final FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        s3Client.upload(bucketName, "greetings", is);
        readFile();
    }

    public void readFile() {
        S3Resource s3Resource = s3Client.download(bucketName, "greetings");

        String fileContent = null;
        try {
            fileContent = s3Resource.getFile().getAbsolutePath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("#### " + fileContent);
    }

}
