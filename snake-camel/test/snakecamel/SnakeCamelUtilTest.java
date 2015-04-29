package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void capitalize‚Å“ª•¶š‚ğ‘å•¶š‚É•ÏŠ·‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Capitalize";
		String actual = scu.capitalize("capitalize");
		assertThat(actual, is(expected));
	}

	@Test
	public void capitalize‚Å“ª•¶š‚ª‘å•¶š‚É‚È‚Á‚Ä‚¢‚é•¶š—ñ‚ğ“ü‚ê‚½ê‡() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Capitalize";
		String actual = scu.capitalize("Capitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalize‚Å“ª•¶š‚ğ¬•¶š‚É•ÏŠ·‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "uncapitalize";
		String actual = scu.uncapitalize("Uncapitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalize‚Å“ª•¶š‚ª¬•¶š‚É‚È‚Á‚Ä‚¢‚é•¶š—ñ‚ğ“ü‚ê‚½ê‡() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "uncapitalize";
		String actual = scu.uncapitalize("uncapitalize");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camel‚ªSnakeCamel‚É•ÏŠ·‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("snake_camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camel‚ÉSnake_camel‚ğ‘ã“ü‚·‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("Snake_camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snake_camel‚ÉSnake_Camel‚ğ‘ã“ü‚·‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeCamel";
		String actual = scu.snakeToCamelcase("Snake_Camel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase‚ÅSnakeCamel‚ğsnake_camel‚É•ÏŠ·‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snake_camel";
		String actual = scu.camelToSnakecase("SnakeCamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase‚ÉSnakecamel‚ğ‘ã“ü‚·‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snakecamel";
		String actual = scu.camelToSnakecase("Snakecamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase‚ÉsnakeCamel‚ğ‘ã“ü‚·‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snake_camel";
		String actual = scu.camelToSnakecase("snakeCamel");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase‚Ésnakecamel‚ğ‘ã“ü() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "snakecamel";
		String actual = scu.camelToSnakecase("snakecamel");
		assertThat(actual, is(expected));
	}
}
