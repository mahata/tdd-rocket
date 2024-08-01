package rocket;

public class DummyRocket implements Rocket {
  @Override
  public void launch() {
    throw new RuntimeException("Dummy Rocket launch");
  }

  @Override
  public void disable() {

  }
}
