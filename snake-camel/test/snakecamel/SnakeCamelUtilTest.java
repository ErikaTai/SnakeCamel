package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void capitalizeで頭文字を大文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Capitalize";
		String actual = scu.capitalize("capitalize");
		assertThat(actual, is(expected));
	}

	@Test
	public void capitalizeで頭文字が大文字になっている文字列を入れた場合() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Capitalize";
		String actual = scu.capitalize("Capitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで頭文字を小文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "uncapitalize";
		String actual = scu.uncapitalize("Uncapitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで頭文字が小文字になっている文字列を入れた場合() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "uncapitalize";
		String actual = scu.uncapitalize("uncapitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camelがSnakeCamelに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("snake_camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camelにSnake_camelを代入する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("Snake_camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camelにSnake_Camelを代入する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("Snake_Camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでSnakeCamelをsnake_camelに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snake_camel";
		String actual = scu.camelToSnakecase("SnakeCamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseにSnakecamelを代入する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snakecamel";
		String actual = scu.camelToSnakecase("Snakecamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseにsnakeCamelを代入する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snake_camel";
		String actual = scu.camelToSnakecase("snakeCamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseにsnakecamelを代入() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snakecamel";
		String actual = scu.camelToSnakecase("snakecamel");
		assertThat(actual, is(expected));
	}
}
