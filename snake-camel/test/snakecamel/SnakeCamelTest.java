package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void capitalize�ŕ��������() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "Sss";
		String t = scu.capitalize("sss");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void uncapitalize�ŕ��������() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "tTT";
		String t = scu.uncapitalize("TTT");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcase���g��() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "Snake";
		String t = scu.snakeToCamelcase("snake_case");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcase���g��2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "MyNameIs";
		String t = scu.snakeToCamelcase("my_name_is_ooyuka");
		System.out.println(t);
		assertEquals(s,t);
	}
	
	@Test
	public void camelToSnakecase���g��() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "cCamel_cCase";
		String t = scu.camelToSnakecase("CamelCase");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void camelToSnakecase���g��2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "my_nName_iIs_oOoyuka";
		String t = scu.camelToSnakecase("myNameIsOoyuka");
		System.out.println(t);
		assertEquals(s,t);
	}	
}
