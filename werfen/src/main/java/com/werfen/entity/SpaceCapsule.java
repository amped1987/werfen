package com.werfen.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SpaceCapsule {
	protected int altitude =0;
	protected int horizontalPosition = 0;
	
	public void forward (int x) {
		horizontalPosition += x;
	}
	
	public void down (int x) {
		altitude += x;
	}
	
	public void up (int x) {
		altitude -= x;
	}

}
