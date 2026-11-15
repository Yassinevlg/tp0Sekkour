# TP 0 Jakarta EE — Yassine Sekkour

EMSI Rabat — numéro 20 — professeur Richard Grin.

## Exécution

- JDK 25, Maven 3.9 ou supérieur, Payara Server 7 compatible Jakarta EE 11.
- Définir `JAVA_HOME` vers le JDK 25.
- Compiler avec `mvnw.cmd clean package` sous Windows, ou `./mvnw clean package` sous Linux/macOS.
- Déployer `target/tp0Sekkour-1.0-SNAPSHOT.war` dans Payara.
- Ouvrir `http://localhost:8080/tp0Sekkour-1.0-SNAPSHOT/`.

L'API Jakarta EE est fournie par Payara ; PrimeFaces 16.0.2 est inclus dans le WAR. `HelloServlet.java` et `index.jsp` sont conservés. Le servlet reste accessible à `/hello-servlet`.

## Exercice bonus

Le service compte les mots séparés par des espaces et les voyelles, accents et `y` compris. Il restitue aussi le texte saisi. Le rôle est affiché au début de la première réponse du chat. Exemple : `Bonjour Rabat 20` donne 3 mots et 5 voyelles.

## Vérifications effectuées

Compilation sous Java 25 et déploiement sur Payara 7.2026.10. Douze contrôles HTTP ont validé la version obligatoire ; quinze ont validé la version bonus : accueil rendu, ressources, saisies invalides, réponses, historique, rôle figé, nouveau chat, accents et échappement HTML.

Les boutons de copie et d'effacement conservent le JavaScript fourni ; leur exécution dans un navigateur n'a pas été automatisée.

## Sources et utilisation de l'IA

[Énoncé officiel](http://richard.grin.free.fr/emsi/rabat-ia/tp/tp0-jakartaee/). La page JSF, le CSS et le JavaScript sont repris du professeur. Les packages Java sont adaptés au nom de l'étudiant. La coquille `roleSystemAffiche` du service fourni a été harmonisée en `roleSystemeAffiche` avant validation de la version obligatoire ; le traitement a ensuite été modifié pour le bonus.

L'aide réelle de l'agent et les validations personnelles restant à confirmer sont consignées dans [IA.md](IA.md). L'accord du professeur sur la correction de la coquille n'a pas été obtenu ; l'acceptation du bonus relève de son appréciation.
