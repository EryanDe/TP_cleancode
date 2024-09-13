package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire pour le formatage des dates.
 */
public class DateUtils {

    /**
     * Formate une date selon le modèle spécifié.
     * 
     * @param pattern Le modèle de formatage.
     * @param date    La date à formater.
     * @return La date formatée sous forme de chaîne.
     */
    public static String format(String pattern, Date date) {
        return formatDate(pattern, date);
    }

    /**
     * Formate une date avec le modèle par défaut (dd/MM/yyyy HH:mm:ss).
     * 
     * @param date La date à formater.
     * @return La date formatée sous forme de chaîne.
     */
    public static String formatDefaut(Date date) {
        return formatDate("dd/MM/yyyy HH:mm:ss", date);
    }

    /**
     * Méthode privée pour formater une date selon le modèle fourni.
     * 
     * @param pattern Le modèle à appliquer.
     * @param date    La date à formater.
     * @return La date formatée sous forme de chaîne.
     */
    private static String formatDate(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }
}
