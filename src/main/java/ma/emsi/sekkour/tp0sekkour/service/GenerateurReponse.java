package ma.emsi.sekkour.tp0sekkour.service; // A modifier

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;
import java.util.Locale;

/**
 * Classe de service pour les modificateurs de question.
 * Un modificateur de question prend en entrée une question et retourne
 * la question modifiée.
 */
@Dependent // Portée CDI pour rendre la classe injectable par CDI dans les autres classes.
// Portée Dependent : l'instance sera supprimée quand la classe qui l'a injectée sera supprimée.
public class GenerateurReponse implements Serializable { // Serializable car CDI peut mettre l'instance en mémoire secondaire.
    private boolean roleSystemeAffiche = false;

    /**
     * Génère une réponse à une question.
     * @param question La question à modifier.
     * @param roleSysteme Le rôle système à utiliser pour la modification de la question.
     * Bonus : compte les mots séparés par des espaces et les voyelles du texte.
     * Les voyelles accentuées et y sont compris dans le décompte.
     * @return L'analyse et le texte d'origine, entourés de "||", précédés
     * du rôle en majuscules pour la première réponse du chat.
     */
    public String genererReponse(String question, String roleSysteme) {
        String resultat = "||";
        if (!this.roleSystemeAffiche && roleSysteme != null) {
            // Ajouter le rôle système en majuscule au début du résultat, suivi d'un saut de ligne.
            resultat += roleSysteme.toUpperCase(Locale.FRENCH) + "\n";
            this.roleSystemeAffiche = true;
        }
        int nombreMots = question.strip().isEmpty() ? 0 : question.strip().split("\\s+").length;
        long nombreVoyelles = question.toLowerCase(Locale.FRENCH).chars()
                .filter(c -> "aeiouyàâäéèêëîïôöùûüÿœæ".indexOf(c) >= 0)
                .count();
        resultat += "Analyse du texte\nMots : " + nombreMots
                + "\nVoyelles : " + nombreVoyelles
                + "\nTexte : " + question + "||";
        return resultat;
    }
}
