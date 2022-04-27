import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	public void translateStartWithEVowelTest() {
		String expected = "equalway"; 
		String actual = PigLatin.translate("equal");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithAVowelTest() {
		String expected = "appleway"; 
		String actual = PigLatin.translate("Apple");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithIVowelTest() {
		String expected = "itineraryway"; 
		String actual = PigLatin.translate("Itinerary");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithOVowelTest() {
		String expected = "oceanway"; 
		String actual = PigLatin.translate("ocean");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithUVowelTest() {
		String expected = "universeway"; 
		String actual = PigLatin.translate("universe");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithConsonant1Test() {
		String expected = "andapay"; 
		String actual = PigLatin.translate("Panda");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithConsonant2Test() {
		String expected = "endblay"; 
		String actual = PigLatin.translate("Blend");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithConsonant3Test() {
		String expected = "inklespray"; 
		String actual = PigLatin.translate("Sprinkle");
		assertEquals(expected, actual);
	}
	
	@Test
	public void translateUppercaseTest() {
		String expected = "aseballbay"; 
		String actual = PigLatin.translate("BASEBALL");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithConTest() {
		String expected = "iaouedmay"; 
		String actual = PigLatin.translate("miaoued");
		assertEquals(expected, actual);
	}
	@Test
	public void translateStartWithTwoConTest() {
		String expected = "onephay"; 
		String actual = PigLatin.translate("Phone");
		assertEquals(expected, actual);
	}
	@Test
	public void translateTest() {
		String expected = "oolschay"; 
		String actual = PigLatin.translate("School");
		assertEquals(expected, actual);
	}
	@Test
	public void translateSpecialCharTest() {
		String expected = "@hotmail.com"; 
		String actual = PigLatin.translate("@hotmail.com");
		assertEquals(expected, actual);
	}
	@Test
	public void translateSpecialThreeCharTest() {
		String expected = "@hot-mail.com"; 
		String actual = PigLatin.translate("@hot-mail.com");
		assertEquals(expected, actual);
	}
//	@Test
//	public void translateSpacesTest() {
//		String expected = "appleyay tree"; //word with Special char
//		String actual = PigLatin.translate("Apple Tree");
//		assertEquals(expected, actual);
//	}

	
	@Test
	public void hasSpecialCharTest() {
		Boolean expected = true; 
		Boolean actual = PigLatin.hasSpecialChar("email@email.com");
		assertEquals(expected, actual);
	}
	@Test
	public void lowercaseTest() {
		String expected = "school"; 
		String actual = PigLatin.lowercase("SCHOOL");
		assertEquals(expected, actual);
	}
	@Test
	public void vowelTest() {
		Boolean expected = true; 
		Boolean actual = PigLatin.isVowel('u');
		assertEquals(expected, actual);
	}


}
