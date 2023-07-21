package ru.daniladeveloper.kata;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class SecureTesterTest {

  @Test
  @DisplayName("Valid input")
  void testValidInput() {
      assertTrue(SecureTester.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
  }

  @DisplayName("Invalid character")
  @ParameterizedTest(name="Should return false for \"{0}\"")
  @ValueSource(strings = {"", "with space", "with_underscore", "punctuation.", "naïve", "１strangedigit", "emoji😊"})
  void testInvalidChars(String input) {
      assertFalse(SecureTester.alphanumeric(input));
  }
}
