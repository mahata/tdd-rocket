package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LauncherTest {
    @Test
    void sample() {
        assertEquals(1, 1);
    }

    @Test
    void givenExpiredLaunchCodes_RocketIsNotLaunched() {
        ExpiredLaunchCodeStub launchCode = new ExpiredLaunchCodeStub();
        RocketMock rocket = new RocketMock();

        Launcher.launchRocket(rocket, launchCode, new FakeArrayListUsedLaunchCodes());

        rocket.verifyRocketNotLaunched();
    }


    @Test
    void givenUnsignedLaunchCodes_RocketIsNotLaunched() {
        UnsignedLaunchCodeStub launchCode = new UnsignedLaunchCodeStub();
        RocketMock rocket = new RocketMock();

        Launcher.launchRocket(rocket, launchCode, new FakeArrayListUsedLaunchCodes());

        rocket.verifyRocketNotLaunched();
    }

    @Test
    void withReusedLaunchCodes_RocketIsNotLaunched() {
        // ...

        // Given?
        // Valid なローンチコードとロケットをインスタンス化する
        RocketMock rocket1 = new RocketMock();
        RocketMock rocket2 = new RocketMock();
        LaunchCode launchCode = new ValidLaunchCodeStub();

        UsedLaunchCodes usedLaunchCodes = new FakeArrayListUsedLaunchCodes();
        // When?
        // ロケットを発射する (ローンチコードA)
        // ロケットを発射する (ローンチコードA)
        Launcher.launchRocket(rocket1, launchCode, usedLaunchCodes);
        Launcher.launchRocket(rocket2, launchCode, usedLaunchCodes);

        // Then?
        // 2回目のロケットが発射されない
        rocket2.verifyRocketNotLaunched();
    }
}
