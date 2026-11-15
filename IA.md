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

## État de ce journal

Ce journal est en cours. Les rubriques d'apprentissage signalées « à confirmer » ne constituent pas encore ma validation personnelle. Les anciennes conversations manquantes ne sont pas inventées.
