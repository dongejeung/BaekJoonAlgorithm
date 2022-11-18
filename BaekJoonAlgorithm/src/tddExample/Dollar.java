package tddExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Dollar {
	
	private int amount;
	
	public Dollar() {
		
	}
	
	public void DollarAmount(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(); 
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(5, 5);
		
	}
	
}
