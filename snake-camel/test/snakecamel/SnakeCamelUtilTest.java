package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void capitalize�œ�������啶���ɕϊ��ł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Capitalize";
		String actual = scu.capitalize("capitalize");
		assertThat(actual, is(expected));
	}

	@Test
	public void capitalize�œ��������啶���ɂȂ��Ă��镶�������ꂽ�ꍇ() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Capitalize";
		String actual = scu.capitalize("Capitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalize�œ��������������ɕϊ��ł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "uncapitalize";
		String actual = scu.uncapitalize("Uncapitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalize�œ��������������ɂȂ��Ă��镶�������ꂽ�ꍇ() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "uncapitalize";
		String actual = scu.uncapitalize("uncapitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camel��SnakeCamel�ɕϊ��ł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("snake_camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camel��Snake_camel��������() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("Snake_camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camel��Snake_Camel��������() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("Snake_Camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase��SnakeCamel��snake_camel�ɕϊ��ł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snake_camel";
		String actual = scu.camelToSnakecase("SnakeCamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase��Snakecamel��������() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snakecamel";
		String actual = scu.camelToSnakecase("Snakecamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase��snakeCamel��������() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snake_camel";
		String actual = scu.camelToSnakecase("snakeCamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase��snakecamel����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snakecamel";
		String actual = scu.camelToSnakecase("snakecamel");
		assertThat(actual, is(expected));
	}
}
