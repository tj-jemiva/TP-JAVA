#En Java, rmic (Remote Method Invocation Compiler) est un outil qui générait des stubs et skeletons pour les objets distants 
#utilisés dans les applications RMI (Remote Method Invocation)
#
#Fonction de rmic :
#Compiler les classes Java qui implémentent des interfaces distantes.
#Générer des fichiers .class pour les stubs (et les skeletons avant Java 5).
#Faciliter les appels de méthodes entre applications Java situées sur des machines différentes.
#
#Depuis Java 5, la génération des stubs est automatique grâce à dynamic proxies, rendant rmic obsolète. Il a été supprimé à partir de Java 11.
#Pour les projets modernes, on utilise des solutions plus récentes comme RMI dynamique, gRPC, ou des APIs REST.
#
#Étapes pour Compiler et Exécuter un Objet Distant en Java RMI
1. Définir l'Interface Distante
#L'interface doit hériter de java.rmi.Remote et les méthodes doivent déclarer RemoteException.
2. Implémenter l'Objet Distant
#L'implémentation doit étendre UnicastRemoteObject.
3. Créer le Serveur RMI
#Le serveur enregistre l'objet distant dans le registre RMI.
4. Créer le Client RMI
#Le client accède à l'objet distant via le registre.
#
#Compilation et Exécution
1.Compiler les classes :
javac *.java
2.Lancer le serveur :
java ServeurRMI
3.Lancer le client (dans un autre terminal) :
java ClientRMI

