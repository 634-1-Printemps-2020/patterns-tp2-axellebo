package game;

import materials.CoinState;

import java.util.List;

public class Rules {

  private static final int nbIdemGagnant = 3;
  /**
   * Cette méthode permet de déterminer si une suite d'états de pièce permet de gagner à une partie
   * @param states liste d'états pour un joueur
   * @return true si un joueur a gagné, false sinon
   */
  public boolean checkWin(List<CoinState> states) {
    // TODO: Votre code ici
    if(!states.isEmpty() || states.size()>=3) {
      CoinState type = states.get(states.size()-1);
      int nbIdem = 0;
      for (int i = states.size() - 1; i >= 0; i--) {
        if (nbIdem < nbIdemGagnant) {
          if (states.get(i).equals(type)) {
            nbIdem++;
          } else {
            return false;
          }
        } else {
          return true;
        }
      }
    }
    return false;
  }
}
