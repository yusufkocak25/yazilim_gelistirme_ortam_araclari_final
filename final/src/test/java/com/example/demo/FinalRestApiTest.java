package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class FinalRestApiTest {

	@Test
	void testListele() {
		List<String> sonuc = FinalRestApi.listele();
		
		assertEquals(FinalRestApi.DERSLER, sonuc);
	}

	@Test
	void testEkle() {
		String dersAd = "serkan";
		
		Boolean sonuc = FinalRestApi.ekle(dersAd);
		
		assertEquals(true, sonuc);
	}

	@Test
	void testSil() {
		Integer silinecekId = 1;
		FinalRestApi.DERSLER.add("veri");
		
		String sonuc = FinalRestApi.sil(silinecekId);
		
		assertEquals("silindi",sonuc);
		
	}

}
