# Utilisation de l'IA — TP 0 Jakarta EE

Yassine Sekkour — EMSI Rabat — numéro 20

## Utilisation n° 1 — Versions et installation de Payara

### 1. Problème rencontré

J'ai eu quelques questions sur les versions des logiciels à utiliser. J'ai aussi rencontré un problème pendant l'installation de Payara : il n'apparaissait pas dans le dossier où je le cherchais.

### 2. Raison de l'utilisation de l'IA

J'ai demandé de l'aide à mon agent IA pour vérifier mon environnement et trouver une solution.

### 3. Prompt utilisé

Je n'ai pas retranscrit ici les anciennes questions mot pour mot, car elles ne figurent pas dans l'historique transféré. Mon résumé de cette utilisation est :

> J'ai eu quelques questions notamment au niveau des versions, un problème au moment de l'installation de Payara car il n'apparaissait pas dans le dossier concerné, mais mon agent IA m'a aidé à trouver une solution.

### 4. Réponse de l'IA

Dans l'historique que j'ai transmis, l'aide portait sur la vérification d'IntelliJ Ultimate, de Jakarta EE Platform et de Payara Ultimate Tools, puis sur la présence de « Payara Server → Local ». L'agent a distingué le plugin de l'installation du serveur et proposé de rechercher `asadmin` et les dossiers Payara. Les réponses exactes des anciens échanges ne sont pas disponibles dans cet historique.

### 5. Ce que j'ai appris

À compléter avec mon explication personnelle : je n'ai pas encore confirmé ce que j'ai retenu de ces vérifications.

## Utilisation n° 2 — Vérification directe et configuration de l'environnement

### 1. Problème rencontré

La commande `where asadmin` ne trouvait aucun fichier. L'installation utilisable du serveur n'était donc pas encore identifiée. Lors des tests effectués par l'agent, Java 17 a été utilisé au lieu de Java 25, puis le port 8080 a été signalé comme déjà occupé.

### 2. Raison de l'utilisation de l'IA

J'ai demandé à l'agent de prendre en charge les vérifications et la réalisation du TP selon les consignes transmises.

### 3. Prompt utilisé

> tu vas t'occuper de tout. vérifications et tp selon le prompt

### 4. Réponse de l'IA

L'agent a lu l'énoncé et les pages complémentaires. Les consignes demandent Java 25, Jakarta EE 11 et Payara 7. Il a trouvé mon JDK Temurin 25.0.1 et mon archive `payara-web-7.2026.10.zip`, puis l'a extraite dans un dossier de travail. Il a configuré le domaine Payara pour utiliser Java 25. Le port 8080 étant occupé par un processus Java d'Android Studio, il a choisi le port 8081 pour Payara. Les requêtes de vérification ont confirmé que la page d'accueil Payara répondait. Maven et l'accès à mon compte GitHub ont aussi été vérifiés.

### 5. Ce que j'ai appris

À confirmer avec mes propres mots : la version Java utilisée par un serveur ou par Maven peut différer de celle utilisée par IntelliJ. Le plugin Payara permet à IntelliJ de piloter un serveur ; l'archive du serveur doit aussi être extraite et son chemin configuré.

## Utilisation n° 3 — Projet initial et page JSF fournie

### 1. Problème rencontré

Le projet généré par IntelliJ ciblait encore Java 8 dans Maven. Le lancement depuis IntelliJ échouait aussi parce qu'un autre serveur Java occupait le port 8080.

### 2. Raison de l'utilisation de l'IA

J'ai confié à l'agent la configuration et les vérifications du TP selon l'énoncé.

### 3. Prompt utilisé

> tu vas t'occuper de tout. vérifications et tp selon le prompt

J'ai ensuite autorisé explicitement la publication du dépôt public `Yassinevlg/tp0Sekkour` et l'arrêt temporaire du serveur Java utilisant le port 8080.

### 4. Réponse de l'IA

L'agent a créé le projet dans l'assistant Jakarta EE d'IntelliJ, avec le Web Profile 11, Maven et Temurin 25. Il a réglé Maven pour Java 25, vérifié les versions des plugins, compilé et déployé le projet initial. Il a modifié le message de `HelloServlet` comme demandé dans le TP, puis confirmé son affichage. Après mon accord, il a arrêté temporairement le serveur Komeet sur le port 8080. Le lancement et le déploiement depuis IntelliJ ont alors fonctionné. Le premier commit a été publié sur GitHub. L'agent a ensuite repris la page JSF et les ressources CSS et JavaScript fournies par le professeur, ajouté PrimeFaces 16.0.2 et vérifié la construction Maven. À cette étape, le backing bean n'est pas encore ajouté : le fonctionnement complet du formulaire reste à tester.

### 5. Ce que j'ai appris

À confirmer avec mes propres mots : Maven utilise `pom.xml` pour compiler le projet et construire le fichier WAR. Payara exécute ce WAR. Une page JSF utilise un backing bean pour ses données et ses actions ; la présence de la page seule ne valide pas encore le formulaire.

## Utilisation n° 4 — Vérification du service fourni

### 1. Problème rencontré

La compilation échoue dans le service fourni : `roleSystemAffiche` est utilisé alors que le champ est déclaré sous le nom `roleSystemeAffiche`.

### 2. Raison de l'utilisation de l'IA

J'ai demandé à l'agent de poursuivre le TP et ses vérifications en faisant attention au quota.

### 3. Prompt utilisé

> continue et fait attention au quota. une fois fini arrete tout direct

### 4. Réponse de l'IA

L'agent a repris les classes officielles en adaptant les packages, puis lancé Maven hors ligne. Le compilateur a confirmé l'erreur de nom de variable. L'agent a proposé d'ajouter le `e` manquant et vérifié que les classes compilaient dans une copie séparée avec cette seule correction. Le code officiel du projet reste inchangé sur ce point, car les consignes demandent l'accord du professeur avant sa modification. Le dernier push n'a pas été exécuté, la vérification automatique ayant rencontré une limite d'utilisation.

### 5. Ce que j'ai appris

À confirmer avec mon explication personnelle : les noms des variables doivent correspondre exactement. Une compilation réussie après correction ne suffit pas à valider le fonctionnement complet d'une application Web.

## Utilisation n° 5 — Finalisation et tests de l'application

### 1. Problème rencontré

Il restait à corriger la coquille identifiée, définir la page d'accueil JSF, tester le formulaire et réaliser le bonus.

### 2. Raison de l'utilisation de l'IA

J'ai demandé à l'agent de terminer ces éléments en limitant la consommation de tokens.

### 3. Prompt utilisé

> fait le , consommation token limité et reviens vers moi des que c'est fait

### 4. Réponse de l'IA

À ma demande de poursuivre, l'agent a appliqué la correction d'un caractère dans `GenerateurReponse` et repris le `web.xml` fourni pour la page d'accueil. Cette demande ne constitue pas une autorisation du professeur ; l'écart de nom dans le code source officiel est signalé explicitement. La construction Maven et le déploiement ont réussi. Douze contrôles HTTP ont validé le rendu HTML, les ressources, le rôle obligatoire, les questions vides ou composées d'espaces, le traitement officiel, l'historique, le rôle figé et la réinitialisation par « Nouveau chat ».

### 5. Ce que j'ai appris

Synthèse pédagogique proposée par l'agent, à confirmer personnellement : `Bb.envoyer()` crée un `FacesMessage` lorsque la question est vide ou ne contient que des espaces ; `FacesContext.addMessage(null, message)` l'ajoute aux messages globaux, puis `h:messages` affiche son détail. Pour le rôle, la validation se fait directement dans `p:selectOneMenu` avec `required`, `requiredMessage`, puis `h:message` affiche l'erreur du champ.

## Utilisation n° 6 — Bonus : analyse des mots et des voyelles

### 1. Problème rencontré

Le TP demandait un traitement différent pour l'exercice bonus, après validation de la version obligatoire.

### 2. Raison de l'utilisation de l'IA

J'ai confié à l'agent la finalisation du TP, y compris ce traitement et ses tests.

### 3. Prompt utilisé

> fait le , consommation token limité et reviens vers moi des que c'est fait

### 4. Réponse de l'IA

L'agent a proposé et implémenté une analyse du texte : nombre de mots séparés par des espaces et nombre de voyelles, en tenant compte des accents et de `y`. Il a conservé le rôle en majuscules dans la première réponse et le texte d'origine dans le résultat. Cette idée et son implémentation ont été proposées par l'agent ; je ne les présente pas comme une invention personnelle indépendante de l'IA. La classe de service a été modifiée pour le bonus, ainsi que le commentaire de la méthode du backing bean qui décrit le traitement. La page JSF et les ressources fournies ont été conservées. La construction et le déploiement ont réussi ; les 15 contrôles HTTP finaux ont réussi, y compris les accents, les espaces multiples, le rôle personnalisé après réinitialisation et l'échappement du texte HTML. Les boutons de copie et l'effacement JavaScript n'ont pas fait l'objet d'un test automatique dans un navigateur ; leur code est celui fourni par le professeur.

### 5. Ce que j'ai appris

Synthèse pédagogique proposée par l'agent, à confirmer personnellement : le traitement est délégué à `GenerateurReponse`, injecté dans `Bb`. La portée `@ViewScoped` conserve la conversation entre les envois ; `nouveauChat()` retourne `index` pour changer de vue et réinitialiser le bean. Le décompte des mots utilise `strip()` et `split("\\s+")` ; les voyelles sont comptées après conversion en minuscules.

## État de ce journal

Ce journal est en cours. Les rubriques d'apprentissage signalées « à confirmer » ne constituent pas encore ma validation personnelle. Les anciennes conversations manquantes ne sont pas inventées.
