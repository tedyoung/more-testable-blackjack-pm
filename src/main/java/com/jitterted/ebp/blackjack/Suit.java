package com.jitterted.ebp.blackjack;

public enum Suit {
  HEART("♥"),
  DIAMOND("♦"),
  SPADE("♠"),
  CLUB("♣");

  private final String symbol;

  Suit(String symbol) {
    this.symbol = symbol;
  }

  public String symbol() {
    return symbol;
  }
}
