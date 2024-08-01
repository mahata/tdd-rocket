package rocket;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RocketMock implements Rocket {
  private boolean launchWasCalled = false;
  private boolean disableWasCalled = false;

  @Override
  public void launch() {
    launchWasCalled = true;
  }

  @Override
  public void disable() {
    disableWasCalled = true;
  }

  void verifyRocketNotLaunched() {
    assertFalse(launchWasCalled);
    assertTrue(disableWasCalled);
  }
}
