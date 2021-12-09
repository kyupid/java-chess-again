package com.kyu.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("기본 테스트")
class MainTest {

    @Test
    @DisplayName("잘 실행되어야 한다.")
    void foo() {
        int a = 5;
        assertThat(a).isEqualTo(5);
    }
}
