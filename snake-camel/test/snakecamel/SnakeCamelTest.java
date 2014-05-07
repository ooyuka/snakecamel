package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void capitalizeで文字を作る() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "Sss";
		String t = scu.capitalize("sss");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void capitalizeで文字を作る2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = " ";
		String t = scu.capitalize(" ");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void capitalizeで文字を作る3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "A";
		String t = scu.capitalize("a");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void capitalizeで文字を作る4() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "Xyz";
		String t = scu.capitalize("xyz");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void uncapitalizeで文字を作る() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "tTT";
		String t = scu.uncapitalize("TTT");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void uncapitalizeで文字を作る2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = " ";
		String t = scu.uncapitalize(" ");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void uncapitalizeで文字を作る3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "xyz";
		String t = scu.uncapitalize("Xyz");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcaseを使う() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "Snake";
		String t = scu.snakeToCamelcase("snake_case");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcaseを使う2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "MyNameIs";
		String t = scu.snakeToCamelcase("my_name_is_ooyuka");
		System.out.println(t);
		assertEquals(s,t);
	}
	
	@Test
	public void snakeToCamelcaseを使う3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "Abc";
		String t = scu.snakeToCamelcase("abc");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcaseを使う4() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "AbcDef";
		String t = scu.snakeToCamelcase("abc_def");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcaseを使う5() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "AbcDefGh";
		String t = scu.snakeToCamelcase("abc_def_gh");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcaseを使う6() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "AbcDefGh";
		String t = scu.snakeToCamelcase("abc_def___gh");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void snakeToCamelcaseを使う7() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "AbcDef";
		String t = scu.snakeToCamelcase("_abc_def__");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void camelToSnakecaseを使う() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "cCamel_cCase";
		String t = scu.camelToSnakecase("CamelCase");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void camelToSnakecaseを使う2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "my_nName_iIs_oOoyuka";
		String t = scu.camelToSnakecase("myNameIsOoyuka");
		System.out.println(t);
		assertEquals(s,t);
	}	
	
	@Test
	public void camelToSnakecaseを使う3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "abc";
		String t = scu.camelToSnakecase("Abc");
		System.out.println(t);
		assertEquals(s,t);
	}
	
	@Test
	public void camelToSnakecaseを使う4() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "aAbc_dDef";
		String t = scu.camelToSnakecase("AbcDef");
		System.out.println(t);
		assertEquals(s,t);
	}
	
	@Test
	public void camelToSnakecaseを使う5() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s = "aAbc_dDef_gGh";
		String t = scu.camelToSnakecase("AbcDefGh");
		System.out.println(t);
		assertEquals(s,t);
	}
}
