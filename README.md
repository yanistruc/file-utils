# file-utils
Un moyen de créer/déplacer facilement des fichiers en Java

Utilisation : 
createfile(Type : file/folder, Emplacement, Nom);

MoveFile(Emplacement, Destination, Nom);

Exemples:

Creer un fichier nommé blackzombie.txt dans /home/yanis_truc/Bureau/ :

createfile("folder", "/home/yanis_truc/Bureau/", "blackzombie");

moveFile("/home/yanis_truc/Bureau/", "/home/yanis_truc/Bureau/blackzombie/", "blackzombie.txt");

Attention ! Quand vous définisser vorte Emplacement ou votre Destination, il faut TOUJOURS mettre un "/" à la fin.
