package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dersler")
public class FinalRestApi {
	
	public static final List<String> DERSLER = new ArrayList<String>();
	{
		DERSLER.add("matematik");
		DERSLER.add("türkçe");
		DERSLER.add("fizik");
		
	}
	
	@GetMapping("/listele")
	public static List<String> listele(){
		return DERSLER;
	}
	
	@PostMapping("/ekle")
	public static boolean ekle(@RequestBody String dersAd) {
		DERSLER.add(dersAd);
		return true;
	}
	
	@PostMapping("/sil")
	public static String sil(@RequestBody Integer silinecekDers) {
		DERSLER.remove(silinecekDers - 1);
		return "silindi";
	}
	
	

}
