package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsedLaunchCodesTest {
    @Test
    void push_and_contains() {
        // Given
        // ValidLaunchCode のインスタンスがある
        // UsedLaunchCodes のインスタンスがある
        // usedLaunchCodes の contains() が false になる
        UsedLaunchCodes usedLaunchCodes = new FakeArrayListUsedLaunchCodes(); // TODO: 真に実装したいもの
        ValidLaunchCodeStub validLaunchCode = new ValidLaunchCodeStub();
        assertFalse(usedLaunchCodes.contains(validLaunchCode));

        // When
        // usedLaunchCodes のインスタンスの push をコールする
        usedLaunchCodes.push(validLaunchCode);

        // Then
        // usedLaunchCodes の contains() が true になる
        assertTrue(usedLaunchCodes.contains(validLaunchCode));
    }

    // tsuik
    @Test
    void push_and_contains_tow_times() {
        UsedLaunchCodes usedLaunchCodes = new FakeSetUsedLaunchCodes(); // TODO: 真に実装したいもの
        ValidLaunchCodeStub validLaunchCode1 = new ValidLaunchCodeStub();
        ValidLaunchCodeStub validLaunchCode2 = new ValidLaunchCodeStub();

        assertFalse(usedLaunchCodes.contains(validLaunchCode1));
        assertFalse(usedLaunchCodes.contains(validLaunchCode2));

        // When
        // usedLaunchCodes のインスタンスの push をコールする
        usedLaunchCodes.push(validLaunchCode1);

        // Then
        // usedLaunchCodes の contains() が true になる
        assertTrue(usedLaunchCodes.contains(validLaunchCode1));
        assertFalse(usedLaunchCodes.contains(validLaunchCode2));
    }
}
