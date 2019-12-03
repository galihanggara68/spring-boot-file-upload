package com.galih.spring.service;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService {
	private Path path;
	
	public StorageService(){
		this.path = Paths.get("D:/Upload").toAbsolutePath().normalize();
		try{
			Files.createDirectories(this.path);
		}catch(Exception e){
			
		}
	}
	
	public String saveFile(MultipartFile file){
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		try{
			Path targetLocation = this.path.resolve(fileName);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
			return fileName;
		}catch(Exception e){
			return "failed";
		}
	}
}
