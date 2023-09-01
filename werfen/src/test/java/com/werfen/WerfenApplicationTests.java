package com.werfen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.werfen.entity.SpaceCapsule;
import com.werfen.entity.SpaceCapsuleExt;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class WerfenApplicationTests {
	
	@InjectMocks
	private SpaceCapsule spaceCapsule;

	@Test
	/*Test to validate correct functionality described in Part1*/
	public void testExercice1Example() {
		SpaceCapsule capsule = new SpaceCapsule();
		capsule.forward(5);
		capsule.down(5);
		capsule.forward(8);
		capsule.up(3);
		capsule.down(8);
		capsule.forward(2);
		assertEquals(150, capsule.getAltitude()*capsule.getHorizontalPosition());
		

	 
	}
	
	@Test
	/*Test to validate correct functionality described in Part2*/
	public void testExercice2Example() {
		SpaceCapsule capsule = new SpaceCapsuleExt();
		capsule.forward(5);
		capsule.down(5);
		capsule.forward(8);
		capsule.up(3);
		capsule.down(8);
		capsule.forward(2);
		assertEquals(900, capsule.getAltitude()*capsule.getHorizontalPosition());
		

	 
	}

}
