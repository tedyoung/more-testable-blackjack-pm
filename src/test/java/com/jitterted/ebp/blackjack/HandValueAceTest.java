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

    assertThat(hand.value())
        .isEqualTo(11 + 5);
  }

  // A + 10 = 21 (A = 11)
  @Test
  public void aceWithOtherCardsValuedAt10HasHandValueOf21() throws Exception {
    Hand hand = new Hand();
    hand.add(new Card(DUMMY_SUIT, "A"));
    hand.add(new Card(DUMMY_SUIT, "Q"));

    assertThat(hand.value())
        .isEqualTo(11 + 10);
  }

  // A + 12 = 13 (A = 1)
  @Test
  public void aceWithOtherCardsValuedAt12HasHandValueOf13() throws Exception {
    Hand hand = new Hand();
    hand.add(new Card(DUMMY_SUIT, "A"));
    hand.add(new Card(DUMMY_SUIT, "6"));
    hand.add(new Card(DUMMY_SUIT, "6"));

    assertThat(hand.value())
        .isEqualTo(1 + 12);
  }

  // A + 11 = 12 (A = 1)
  @Test
  public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
    Hand hand = new Hand();
    hand.add(new Card(DUMMY_SUIT, "A"));
    hand.add(new Card(DUMMY_SUIT, "8"));
    hand.add(new Card(DUMMY_SUIT, "3"));

    assertThat(hand.value())
        .isEqualTo(1 + 8 + 3);
  }

}
