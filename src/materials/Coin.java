package materials;

import java.util.Random;

public class Coin {

  private CoinState coinState;
  private static final Random RANDOM = new Random();

  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    // TODO : Votre code ici
    CoinState[] lstEnum = CoinState.class.getEnumConstants();
    int randomNumber = RANDOM.nextInt(lstEnum.length);
    coinState = lstEnum[randomNumber];
  }

  public CoinState getState() {
    return coinState;
  }


}
