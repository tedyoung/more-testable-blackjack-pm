package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SuitColorTest {

  @Test
  public void givenSuitOfHeartColorIsRed() throws Exception {
    assertThat(Suit.HEART.isRed())
        .isTrue();
  }

  @Test
  public void givenSuitOfSpadeColorIsNotRed() throws Exception {
    assertThat(Suit.SPADE.isRed())
        .isFalse();
  }

}