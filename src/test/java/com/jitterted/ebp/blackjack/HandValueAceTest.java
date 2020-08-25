package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

  private static final Suit DUMMY_SUIT = Suit.HEART;

  @Test
  public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
    Game game = new Game();
    List<Card> hand = new ArrayList<>();
    hand.add(new Card(DUMMY_SUIT, "A"));
    hand.add(new Card(DUMMY_SUIT, "5"));

    assertThat(game.handValueOf(hand))
        .isEqualTo(11 + 5);
  }

  @Test
  public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
    Game game = new Game();
    List<Card> hand = new ArrayList<>();
    hand.add(new Card(DUMMY_SUIT, "A"));
    hand.add(new Card(DUMMY_SUIT, "8"));
    hand.add(new Card(DUMMY_SUIT, "3"));

    assertThat(game.handValueOf(hand))
        .isEqualTo(1 + 8 + 3);
  }

}
