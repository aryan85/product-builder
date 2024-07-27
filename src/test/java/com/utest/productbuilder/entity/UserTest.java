package com.utest.productbuilder.entity;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class UserTest {
    @Test
    void given123Password_whenPasswordIsNotValid_thenIsFalse() {
        User user = new User("Baeldung", "123");
        assertThat(user.passwordIsValid()).isFalse();
    }
}
