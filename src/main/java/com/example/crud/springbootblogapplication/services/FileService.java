package com.example.crud.springbootblogapplication.services;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class FileService {
//    private final Logger logger = LoggerFactory.getLogger(FileService.class);
//
//    private final Path root = Paths.get("./uploads");
//
//    @PostConstruct
//    public void init() {
//        try {
//            Files.createDirectories(root);
//            logger.info("Root directory created: {}", root);
//        } catch (IOException ex) {
//            logger.error("Could not initialize root folder: {}", ex.getMessage());
//            throw new RuntimeException("Could not initialize root folder", ex);
//        }
//    }
//
//    public void save(MultipartFile file) {
//        try {
//            String uniqueFilename = System.currentTimeMillis() + "_" + file.getOriginalFilename();
//            Files.copy(file.getInputStream(), this.root.resolve(Objects.requireNonNull(uniqueFilename)));
//            logger.info("File saved: {}", uniqueFilename);
//        } catch (FileAlreadyExistsException ex) {
//            logger.error("File already exists: {}", ex.getFile());
//            throw new RuntimeException("File already exists", ex);
//        } catch (IOException ex) {
//            logger.error("Error saving file: {}", ex.getMessage());
//            throw new RuntimeException("Error saving file", ex);
//        }
//    }
//
//    public Resource load(String filename) {
//        if (filename == null) {
//            logger.warn("Attempting to load a null filename");
//            return null;
//        }
//
//        try {
//            Path file = root.resolve(filename);
//            Resource resource = new UrlResource(file.toUri());
//
//            if (resource.exists() || resource.isReadable()) {
//                return resource;
//            } else {
//                logger.error("Could not read the file: {}", filename);
//                throw new RuntimeException("Could not read the file!");
//            }
//        } catch (MalformedURLException mex) {
//            logger.error("Error creating URL for file: {}", mex.getMessage());
//            throw new RuntimeException("Error creating URL for file", mex);
//        }
//    }
}
