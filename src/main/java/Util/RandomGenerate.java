package Util;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.RandomBasedGenerator;

public class RandomGenerate {

    /**
     * Propriété rand qui
     */
    private static String rand;

    /**
     * Méthode permettant de renvoyer une valeur aléatoire a partir de
     * RandomBasedGenerator qui proviens de  "com.fasterxml.uuid:java-uuid-generator:4.0.1"
     * @return
     */
    public static String getRand() {
        RandomBasedGenerator generator = Generators.randomBasedGenerator();
        String Temp = generator.generate().toString();
        rand = Temp;

        return rand;
    }
}
