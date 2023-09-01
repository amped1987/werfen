package com.werfen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

import com.werfen.entity.InputDoc;
import com.werfen.entity.SpaceCapsule;
import com.werfen.entity.SpaceCapsuleExt;
import com.werfen.utilities.Utilities;

@SpringBootApplication
public class WerfenApplication {
	public static void main(String[] args) {
		SpringApplication.run(WerfenApplication.class, args);
		
		// Part 1
		part1();
		//Part 2
		part2();
	}

	
	private static void part1() {
		SpaceCapsule sp = new SpaceCapsule();
		Stream<InputDoc> s = Utilities.parseFileToStream("input.txt");
		s.forEach((f)-> {
			if(f.getFunction().equals("forward")) {
				sp.forward(f.getParamter());
			}else if(f.getFunction().equals("down")) {
				sp.down(f.getParamter());
			}else {
				sp.up(f.getParamter());
			}
			});
		
		System.out.println("Result of Part1-->"+ sp.getAltitude() * sp.getHorizontalPosition());
		
	}
	
	private static void part2() {
		SpaceCapsule sp = new SpaceCapsuleExt();
		Stream<InputDoc> s = Utilities.parseFileToStream("input.txt");
		s.forEach((f)-> {
			if(f.getFunction().equals("forward")) {
				sp.forward(f.getParamter());
			}else if(f.getFunction().equals("down")) {
				sp.down(f.getParamter());
			}else {
				sp.up(f.getParamter());
			}
			});
		System.out.println("Result of Part2-->"+ sp.getAltitude() * sp.getHorizontalPosition());
		
	}

}
