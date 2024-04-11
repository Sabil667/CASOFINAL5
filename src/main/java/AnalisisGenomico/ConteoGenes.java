package AnalisisGenomico;

public class ConteoGenes {

    public static int contarGenes(String adn) {
        if (adn.length() < 3) {
            return 0;
        }

        if (adn.substring(0, 3).equals("ATG")) {
            return 1 + contarGenes(adn.substring(3));
        } else {
            return contarGenes(adn.substring(1));
        }
    }
}