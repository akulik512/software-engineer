package com.akulik.domain.s3;

import io.awspring.cloud.s3.S3Resource;
import io.awspring.cloud.s3.S3Template;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class AwsS3TransferManager {

    @Value("${app.bucket-name}")
    private String bucketName;

    private static final String FILE_KEY = "greetings";

    private final S3Template s3Client;

    public void uploadFile() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("/Users/akulik/IdeaProjects/software-engineer/software-engineer-testing/src/main/resources/text.txt");
        } catch (final FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        s3Client.store(bucketName, FILE_KEY, inputStream);
    }

    public String readFile() {
        S3Resource s3Resource = s3Client.download(bucketName, FILE_KEY);

        String fileContent = null;
        try {
            fileContent = StreamUtils.copyToString(s3Resource.getInputStream(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return fileContent;
    }

}
