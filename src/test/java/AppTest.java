import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Word puzzle generator");
  }

  @Test
  public void printsWordPuzzle() {
    goTo("http://localhost:4567");
    fill("#userString").with("katydid");
    submit(".btn");
    assertThat(pageSource()).contains("k-t-d-d");
  }

  @Test
  public void printsRightWhenGuessRight() {
    goTo("http://localhost:4567");
    fill("#userString").with("katydid");
    submit(".btn");
    fill("#userGuess").with("katydid");
    submit(".btn");
    assertThat(pageSource()).contains("That's right!");
  }

  @Test
  public void printsWrongWhenGuessWrong() {
    goTo("http://localhost:4567");
    fill("#userString").with("katydid");
    submit(".btn");
    fill("#userGuess").with("katydo");
    submit(".btn");
    assertThat(pageSource()).contains("That's wrong!");
  }

}
