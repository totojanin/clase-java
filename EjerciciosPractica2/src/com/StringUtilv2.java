package com;

public class StringUtilv2 {
    public static String ltrim(String s) {
        int posPrimerLetra = 0;

        while (s.charAt(posPrimerLetra) == ' ') {
            posPrimerLetra++;
        }

        String nuevoString = "";

        for (int i = posPrimerLetra; i < s.length(); i++) {
            nuevoString += s.charAt(i);
        }

        return nuevoString;
    }

    public static String rtrim(String s) {
        int posUltimaLetra = s.length() - 1;

        while (s.charAt(posUltimaLetra) == ' ') {
            posUltimaLetra--;
        }

        String nuevoString = "";

        for (int i = 0; i <= posUltimaLetra; i++) {
            nuevoString += s.charAt(i);
        }

        return nuevoString;
    }

    public static String trim(String s) {
        return ltrim(rtrim(s));
    }

    public static int indexOfN(String s, char c, int n) {
        int posOcurrenciaN = -1;
        int posControl = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                posControl++;

            if (posControl == n) {
                posOcurrenciaN = i;

                break;
            }
        }

        return posOcurrenciaN;
    }
}
