package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

  private static final Suit DUMMY_SUIT = Suit.HEART;

  @Test
  public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
    Hand hand = new Hand();
    hand.add(new Card(DUMMY_SUIT, "A"));
    hand.add(new Card(DUMMY_SUIT, "5"));

    assertThat(hand.handValueOf())
        .isEqualTo(11 + 5);
  }

  @Test
  public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
    Hand hand = new Hand();
    hand.add(new Card(DUMMY_SUIT, "A"));
    hand.add(new Card(DUMMY_SUIT, "8"));
    hand.add(new Card(DUMMY_SUIT, "3"));

    assertThat(hand.handValueOf())
        .isEqualTo(1 + 8 + 3);
  }

}
