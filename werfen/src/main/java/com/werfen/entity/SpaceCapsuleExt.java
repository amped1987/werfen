package com.werfen.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SpaceCapsuleExt extends SpaceCapsule {
	
	private int aim = 0;
	
	public void forward (int x) {
		horizontalPosition += x;
		altitude += aim*x;
	}
	
	public void down (int x) {
		aim += x;
	}
	
	public void up (int x) {
		aim -= x;
	}

}
