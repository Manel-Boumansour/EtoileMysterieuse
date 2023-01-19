import extensions.File;

class EtoileMysterieuse extends Program{

    Questions newQuestion(String question, String rep, String un, String deux, String trois){
        Questions Quest = new Questions();
        Quest.quest = question;
        Quest.reponses = rep;
        Quest.choix_un = un;
        Quest.choix_deux = deux; 
        Quest.choix_trois = trois;
        return Quest;
    }

    Questions[] initialiserTableau(Questions un, Questions deux, Questions trois, Questions quatre, Questions cinq, Questions six, Questions sept, Questions huit, Questions neuf, Questions dix){
        Questions[] tableau = new Questions[] {un, deux, trois, quatre, cinq, six, sept, huit, neuf, dix};
        return tableau;
    }

    Questions afficherQuest(Questions[] tab){
        int alea = (int) (random() * length(tab));
        println(tab[alea].quest);
        println();
        return tab[alea];
    }

    boolean estPresent(int chiffre, int[] tab){
        boolean present = false;
        for (int i=0; i<length(tab); i++){
            if (tab[i] == chiffre){
                present = true;
            }
        }
        return present;
    }

    boolean cendrillon = false;
    boolean olaf = false;
    boolean dora = false; 
    boolean luigi = false;
    boolean minnie = false;

    final int facile = 3;
    final int moyen = 2;
    final int difficile = 1;

    final int point_facile = 4;
    final int point_moyen = 8;
    final int point_difficile = 10;

    final int cpt_facile = 20;
    final int cpt_moyen = 10;
    final int cpt_difficile = 8;

    final File image_1 = newFile("../ressources/Cendrillon.txt");
    final File image_2 = newFile("../ressources/Olaf.txt");
    final File image_3 = newFile("../ressources/Dora.txt");
    final File image_4 = newFile("../ressources/Luigi.txt");
    final File image_5 = newFile("../ressources/Minnie.txt");
    final File image_bienvenue = newFile("../ressources/Bienvenue.txt");

    final Questions math_un = newQuestion("45 + 9 = ", "54", "63", "55", "89");
    final Questions math_deux = newQuestion("7 * 7 = ", "49", "98", "5", "13");
    final Questions math_trois = newQuestion("100 - 64 = ", "36", "100", "5", "66");
    final Questions math_quatre = newQuestion("10 * 2 = ", "20", "300", "18", "2");
    final Questions math_cinq = newQuestion("15 / 3 = ", "5", "3", "10", "1");
    final Questions math_six = newQuestion("Combien de côtés a un hexagone ? ", "6", "3", "2", "16");
    final Questions math_sept = newQuestion("Comment appelle-t-on un angle à 90° ? ", "un angle droit", "un angle parrallèle", "un angle perpendiculaire", "ca n'existe pas ");
    final Questions math_huit = newQuestion("Combien y a-t-il de grammes dans un kilo ?", "1000", "100","1500", "4");
    final Questions math_neuf = newQuestion("Ecrire 1698 en lettre", "mille six cent quatre-vingt-dix-huit", "milles six cents quatre-vingt-dix-huit", "mille sis cent quatre-vingt-dis-huit" , "mil six cent quatre-vingt-dix-huit");
    final Questions math_dix = newQuestion("2 < 5", "Vrai", "Faux", "Peut-être", "42");
    final Questions[] maths = initialiserTableau(math_un,math_deux,math_trois,math_quatre,math_cinq,math_six,math_sept,math_huit,math_neuf,math_dix);
            
    final Questions hist_un = newQuestion("Quand a été signé l'armistice de la 2nd GM ? ", "08/05/1945", "08/05/1955", "08/11/1975", "15/03/1938 ");
    final Questions hist_deux = newQuestion("Contre qui a perdu Vercingétorix ? ", "Jules Caesar", "Astérix", "César Auguste","Alésia ");
    final Questions hist_trois = newQuestion("Qui fût le premier roi baptisé de France ? ", "Clovis", "Louis XIV", "Charlemagne","Henri I ");
    final Questions hist_quatre = newQuestion("Quelle est la date du sacre de Napoléon ? ", "02/12/1804", "02/05/1913", "25/06/1856", "13/01/1605");
    final Questions hist_cinq = newQuestion("Qui a peint la Joconde ? ", "Léonard De Vinci", "Pablo Picasso", "Vincent van Gogh", "Salvador Dali");
    final Questions hist_six = newQuestion("Au côté de quel roi Jeanne d'Arc a combattu les anglais ? ", "Charles VII", "Pablo Picasso", "Charlemagne", "Clovis");
    final Questions hist_sept = newQuestion("Qui fût le premier président de la Ve République ? ", "Charles De Gaulle", "François Hollande", "Nicolas Sarkozy", "Jacques Chirac");
    final Questions hist_huit = newQuestion("Où les jeux olympiques ont-ils inventés ?", "En Grèce", "En Argentine", "En France", "Sur Mars");
    final Questions hist_neuf = newQuestion("Quel est le surnom de Louis XIV ?", "Le Roi Soleil", "Le Roi Lumière", "Le Roi Lion", "Le Roi Versailles");
    final Questions hist_dix = newQuestion("A quelle occasion  la Tour Eiffel a-t-elle été construite ?", "L\'Exposition Universelle de 1889", "L\'anniversaire de la Mairie de Paris", "A la demande de Napoléon III", "Pour défendre Paris durant la Seconde Guerre Mondiale");
    final Questions[] histoire = initialiserTableau(hist_un,hist_deux,hist_trois,hist_quatre,hist_cinq,hist_six,hist_sept, hist_huit, hist_neuf, hist_dix );
            
    final Questions geo_un = newQuestion("Quelle est la capitale de la France ?", "Paris", "Lille", "New York", "Madrid");
    final Questions geo_deux = newQuestion("Quel fleuve passe par Bordeaux ?", "La Garonne", "La Seine", "Le Nil", "L'Amazone");
    final Questions geo_trois = newQuestion("Combien y a-t-il de pays dans l'UE ?", "27", "12", "42", "7² + (4 * (-3))");
    final Questions geo_quatre = newQuestion("Combien de frontières possède la France Métropolitaine ?", "8", "15", "3", "157");
    final Questions geo_cinq = newQuestion("Dans quelle région se situe le département du Nord ? ", "Les Hauts-De-France", "L'Ile-De-France", "La Bretagne", "L'Alsace");
    final Questions geo_six = newQuestion("Combien y a-t-il de continents sur Terre ?", "7", "4", "12", "PI");
    final Questions geo_sept = newQuestion("Combien y a-t-il de pays dans le monde ?", "194", "1245", "86", "456");
    final Questions geo_huit = newQuestion("Combien d\'Etats comportent les Etats Unis d\'Amérique ?" , "50", "48", "57", "60");
    final Questions geo_neuf = newQuestion("Quel est le plus grand océan du monde ?","L\'Océan Pacifique", "L\'Océan Atlantique", "L\'Océan Indien", "L\'Océan Arctique");
    final Questions geo_dix = newQuestion("Quel est le plus grand pays du monde ?", "La Russie", "La Chine", "Le Canada", "L'Afrique");
    final Questions[] geo = initialiserTableau(geo_un, geo_deux, geo_trois, geo_quatre, geo_cinq, geo_six, geo_sept, geo_huit, geo_neuf, geo_dix);

    final Questions fr_un = newQuestion("Conjugue le verbe GAGNER à la première personne du pluriel à l'imparfait.", "Nous gagnions", "Vous gagniez", "Nous gagnons", "Vous gagnez");
    final Questions fr_deux = newQuestion("Lequel de ces mots n\'est pas une conjonction de coordination ?", "Que", "Mais", "Or", "Car");
    final Questions fr_trois = newQuestion("Qui a écrit \"Le Lièvre Et La Tortue\" ?", "Jean De La Fontaine", "Juan De La Fuente", "Molière", "Victor Hugo");
    final Questions fr_quatre = newQuestion("Qu'est-ce qui marque la fin d'une phrase interrogative ?", "Le point d'interrogation", "Le point d'exclamation", "La virgule", "L'apostrophe");
    final Questions fr_cinq = newQuestion("Une phrase est constituer à minima de :", "sujet + verbe + complément", "verbe + complément du sujet", "sujet + COD", "adverbe + verbe");
    final Questions fr_six = newQuestion("Quel mot est mal orthographié ?", "Lappin", "Voiture", "Sorcier", "Arbre");
    final Questions fr_sept = newQuestion("Que signifie SYNONYME ?", "Qui a le même sens", "Qui a un sens opposé", "Qui n'a pas de sens", "Qui est perdue");
    final Questions fr_huit = newQuestion("Le mot BALLON est du genre :", "Masculin", "Féminin", "Non-binaire", "Animal");
    final Questions fr_neuf = newQuestion("Quel livre a été écrit par Victor Hugo ?", "Notre Dame de Paris", "Germinal", "Les fleurs du mal", "L'étranger");
    final Questions fr_dix = newQuestion("Complète la phrase : \"J'habite ... Lille.\"", "à", "a", "as", "ah");
    final Questions[] français = initialiserTableau(fr_un, fr_deux, fr_trois, fr_quatre, fr_cinq, fr_six, fr_sept, fr_huit, fr_neuf, fr_dix);

    final Questions ang_un = newQuestion("Traduis le mot MERCREDI", "Wednesday", "Thursday", "Mercreday", "Frinday");
    final Questions ang_deux= newQuestion("Que signifie YELLOW ?", "Jaune", "Rouge", "Soleil", "Etoile");
    final Questions ang_trois = newQuestion("Comment s\'appellait la mère des Princes Wiliam & Harry ?", "Lady Diana", "Camilia Parker Bowles", "Elisabeth II", "Victoria");
    final Questions ang_quatre = newQuestion("Lequel des ces pays ne fait pas parti du Royaume-Uni", "L'Irlande", "L'Angleterre", "L'Ecosse", "Le Pays De Galle");
    final Questions ang_cinq = newQuestion("Who\'s the first Avengers ?", "Captain America", "Iron Man", "Hulk", "Pepper");
    final Questions ang_six = newQuestion("I am, your are, he/she/it ...", "is", "has", "are", "be");
    final Questions ang_sept = newQuestion("Traduis la phrase : \"J'ai 21 ans\"", "I am twenty one years old", "I am twoty one years old", "I have twenty one years", "I have twoty years old");
    final Questions ang_huit = newQuestion("\"Dépêche-toi ! \" se dit :", "Hurry up !", "Harry up !", "Urry up !", "Orry up !");
    final Questions ang_neuf = newQuestion("A quel moment de la journée dit-on GOOD-AFTERNOON ?", "L'après-midi", "Le matin", "Le soir", "Le midi");
    final Questions ang_dix = newQuestion("Quelles lettres indiquent qu\'il s\'agit d'une heure du matin ?", "AM", "PM", "AT", "PT");
    final Questions[] anglais = initialiserTableau(ang_un, ang_deux, ang_trois, ang_quatre, ang_cinq, ang_six, ang_sept, ang_huit, ang_neuf, ang_dix);

    Questions[] afficherMenu(){
        Questions[] quest = new Questions[10];
        String s;
        do {
            println();
            println("Bienvenue dans le jeu de l'Etoile Mystérieuse !");
            delay(300);
            println("Le but du jeu est simple : il faut répondre correctement aux questions afin de dévoiler le plus d'images !");
            delay(300);
            println("Nous allons tester vos connaissances en Mathématiques, Histoire, Géographie, Français & Anglais.");
            delay(300);
            println();
            println("[1] ----> JOUER");
            delay(300);
            println("[2] ----> VITRINE D'IMAGES DECOUVERTE");
            delay(300);
            println("[3] ----> QUITTER");
            println();
            s = readString();
            if (equals(s,"3")){
                println();
                println("Merci d'avoir joué à ce jeu ! A une prochaine fois ! ");
                println();
                System.exit(0);
            }
            if (equals(s,"2")){
                println("Voici les images que vous avez découvertes jusqu'à présent : ");
                if (cendrillon){
                    println();
                    println("CENDRILLON");
                    println();
                    for (int idx=0; idx<80; idx++){
                        println(readLine(image_1));
                    }
                    println();
                }
                if (olaf){
                    println();
                    println("OLAF");
                    println();
                    for (int idx=0; idx<80; idx++){
                        println(readLine(image_2));
                    }
                    println();
                }
                if (dora){
                    println();
                    println("DORA");
                    println();
                    for (int idx=0; idx<80; idx++){
                        println(readLine(image_3));
                    }
                    println();
                }
                if (luigi){
                    println();
                    println("LUIGI");
                    println();
                    for (int idx=0; idx<80; idx++){
                        println(readLine(image_4));
                    }
                    println();
                }
                if (minnie){
                    println();
                    println("MINNIE");
                    println();
                    for (int idx=0; idx<80; idx++){
                        println(readLine(image_5));
                    }
                    println();
                }
            }
        }while (!equals(s,"1"));
        println();
        println("Quelle matière ?");
        println();
        delay(300);
        println("[1] ----> MATHEMATIQUES");
        delay(300);
        println("[2] ----> HISTOIRE");
        delay(300);
        println("[3] ----> GEOGRAPHIE");
        delay(300);
        println("[4] ----> FRANCAIS");
        delay(300);
        println("[5] ----> ANGLAIS");
        println();
        String s1 = readString();
        if (equals(s1,"1")){
            println();
            quest = maths;
            println("Nous commençons avec des questions de mathématiques : ");
            delay(300);
            println();
        }else if (equals(s1,"2")){
            println();
            quest = histoire;
            println("Nous commençons avec des questions d'histoire : ");
            delay(300);
            println();
        }else if (equals(s1,"3")){
            println();
            quest = geo;
            println("Nous commençons avec des questions de géographie : ");
            delay(300);
            println();
        }else if (equals(s1,"4")){
            println();
            quest = français;
            println("Nous commençons avec des questions de français : ");
            delay(300);
            println();
        }else if (equals(s1,"5")){
            println();
            quest = anglais;
            println("Nous commençons avec des questions d'anglais : ");
            delay(300);
            println();
        }
        return quest;
    }

    void jouer(Questions[] matiere){
        int cpt_ajoute = 0;
        int nbrErreur = 0;
        int point_avoir = 0;
        String z;
        do{
            println();
            delay(300);
            println("Quel niveau voulez-vous ?");
            println();
            delay(300);
            println("[1] ----> FACILE");
            delay(300);
            println("[2] ----> MOYEN");
            delay(300);
            println("[3] ----> DIFFICILE");
            delay(300);
            println();
            z = readString();
            if (equals(z, "1")){
                nbrErreur = facile;
                cpt_ajoute = cpt_facile;
                point_avoir = point_facile;
                delay(300);
                println();
                println("Vous aurez donc le droit à 3 erreurs.");
            }else if (equals(z, "2")){
                nbrErreur = moyen;
                cpt_ajoute = cpt_moyen;
                point_avoir = point_moyen;
                delay(300);
                println();
                println("Vous aurez donc le droit à 2 erreurs.");
            }else if (equals(z, "3")){
                nbrErreur = difficile;
                cpt_ajoute = cpt_difficile;
                point_avoir = point_difficile;
                delay(300);
                println();
                println("Vous aurez donc le droit à seulement 1 erreur.");
            }
        }while (!equals(z, "1") && !equals(z, "2") && !equals(z, "3"));
        println();
        File image_final = image_1;
        if (matiere == maths){
            image_final = newFile("../ressources/Cendrillon.txt");
        }else if (matiere == histoire){
            image_final = newFile("../ressources/Olaf.txt");
        }else if (matiere == geo){
            image_final = newFile("../ressources/Dora.txt");
        }else if (matiere == français){
            image_final = newFile("../ressources/Luigi.txt");
        }else if (matiere == anglais){
            image_final = newFile("../ressources/Minnie.txt");
        }
        int cpt_image = 0;
        int tour = 0;
        int points = 0;
        int avance = 0; 
        String reponse = "";
        do{
            do{          
        Questions quest = afficherQuest(matiere);
        int cpt = 0;
        int repp = 0;
        String rep;
        int[]chiffre = new int[4];
        do{
            while (cpt !=4){
            int alea = (int) (random() * 5 );
            if (!estPresent(alea, chiffre)){
                chiffre[cpt] = alea;
                cpt += 1;
                if (alea == 1){
                    println(cpt + ")" + " " + quest.reponses);
                    delay(300);
                    repp += cpt;
                }else if (alea == 2){
                    println(cpt + ")" + " " + quest.choix_un);
                    delay(300);
                }else if (alea == 3){
                    println(cpt + ")" + " " + quest.choix_deux);
                    delay(300);
                }else if (alea == 4){
                    println(cpt + ")" + " " + quest.choix_trois);
                    delay(300);
                }
            }
        }
        println();
        println("Quelle est votre réponse ? (Saisir le numéro)");
        println();
        rep = readString();
        }while(length(rep) != 1);    
        int reppp = Integer.parseInt(rep);
        println();
        if (repp == reppp){
            cpt_image += cpt_ajoute;
            println("C'est la bonne réponse ! Bravo !");
            println("Un bout de l'image s'est dévoilé !");
            println();
            for (int idx=0; idx<cpt_image; idx++){
                println(readLine(image_final));
            }
            if (matiere == maths){
                image_final = newFile("../ressources/Cendrillon.txt");
            }else if (matiere == histoire){
                image_final = newFile("../ressources/Olaf.txt");
            }else if (matiere == geo){
                image_final = newFile("../ressources/Dora.txt");
            }else if (matiere == français){
                image_final = newFile("../ressources/Luigi.txt");
             }else if (matiere == anglais){
                image_final = newFile("../ressources/Minnie.txt");
            }
            points += 1;
            println();
        }else{
            println("C'est la mauvaise réponse. Dommage !");
            for (int idx_1=0; idx_1<cpt_image; idx_1++){
                println(readLine(image_final));
            }
            if (matiere == maths){
                image_final = newFile("../ressources/Cendrillon.txt");
            }else if (matiere == histoire){
                image_final = newFile("../ressources/Olaf.txt");
            }else if (matiere == geo){
                image_final = newFile("../ressources/Dora.txt");
            }else if (matiere == français){
                image_final = newFile("../ressources/Luigi.txt");
             }else if (matiere == anglais){
                image_final = newFile("../ressources/Minnie.txt");
            }
            println();
            avance += 1;
        }
        }while(points != point_avoir && avance != nbrErreur);
        if (points == point_avoir){
            println("Bravo ! Vous avez réussi à dévoiler toute l'image !");
            if (matiere == maths){
                cendrillon = true;
            }else if (matiere == histoire){
                olaf = true;
            }else if (matiere == geo){
                dora = true;
            }else if (matiere == français){
                luigi = true;
            }else if (matiere == anglais){
                minnie = true;
            }
            println();
            for (int idx=0; idx<cpt_image; idx++){
                println(readLine(image_final));
            }
            if (matiere == maths){
                image_final = newFile("../ressources/Cendrillon.txt");
            }else if (matiere == histoire){
                image_final = newFile("../ressources/Olaf.txt");
            }else if (matiere == geo){
                image_final = newFile("../ressources/Dora.txt");
            }else if (matiere == français){
                image_final = newFile("../ressources/Luigi.txt");
            }else if (matiere == anglais){
                image_final = newFile("../ressources/Minnie.txt");
            }
            println();
            println("Avez-vous deviné de quel personnage s\'agit-il ?");
            println();
            String devinette = readString();
            println();
            if (matiere == maths){
                if (equals(devinette, "Cendrillon") || equals(devinette, "cendrillon") || equals(devinette, "CENDRILLON")){
                    println("Bien Joué ! Cette image représentait bien le personnage Cendrillon !");
                    println();
                }else{
                    println("Dommage, cette image représentait le personnage Cendrillon.");
                    println();
                }
            }else if (matiere == histoire){
                if (equals(devinette, "Olaf") || equals(devinette, "olaf") || equals(devinette, "OLAF")){
                    println("Bien Joué ! Cette image représentait bien le personnage Olaf !");
                    println();
                }else{
                    println("Dommage, cette image représentait le personnage Olaf.");
                    println();
                } 
            }else if (matiere == geo){
                if (equals(devinette, "Dora") || equals(devinette, "dora") || equals(devinette, "DORA")){
                    println("Bien Joué ! Cette image représentait bien le personnage Dora !");
                    println();
                }else{
                    println("Dommage, cette image représentait le personnage Dora.");
                    println();
                }
            }else if (matiere == français){
                if (equals(devinette, "Luigi") || equals(devinette, "luigi") || equals(devinette, "LUIGI")){
                    println("Bien Joué ! Cette image représentait bien le personnage Luigi !");
                    println();
                }else{
                    println("Dommage, cette image représentait le personnage Luigi.");
                    println();
                }
            }else if (matiere == anglais){
                if (equals(devinette, "Minnie") || equals(devinette, "minnie") || equals(devinette, "MINNIE")){
                    println("Bien Joué ! Cette image représentait bien le personnage Minnie !");
                    println();
                }else{
                    println("Dommage, cette image représentait le personnage Minnie.");
                    println();
                }
            } 
        }else{
            println("Raté ! L'image n'est pas découverte. Ce sera pour une prochaine fois !");
            println();
        }
        cpt_image = 0;
        tour += 1; 
        points = 0;
        avance = 0; 
        if (matiere == maths){
            image_final = newFile("../ressources/Cendrillon.txt");
        }else if (matiere == histoire){
            image_final = newFile("../ressources/Olaf.txt");
        }else if (matiere == geo){
            image_final = newFile("../ressources/Dora.txt");
        }else if (matiere == français){
            image_final = newFile("../ressources/Luigi.txt");
        }else if (matiere == anglais){
            image_final = newFile("../ressources/Minnie.txt");
        }
        do{
            delay(300);
            println("Que voulez-vous faire maintenant ? ");
            println();
            delay(300);
            println("[1] ----> CONTINUER À JOUER");
            delay(300);
            println("[2] ----> CHANGER DE MATIERE");
            delay(300);
            println("[3] ----> RETOURNER AU MENU");
            delay(300);
            println("[4] ----> QUITTER LE JEU");
            println();
            z = readString();
            if (equals(z, "1")){
                delay(300);
                println();
                println("Passons à une autre image...");
                continue;
            }else if (equals(z, "2")){
                delay(300);
                println();
                println();
            println("Quelle matière ?");
            println();
            delay(300);
            println("[1] ----> MATHEMATIQUES");
            delay(300);
            println("[2] ----> HISTOIRE");
            delay(300);
            println("[3] ----> GEOGRAPHIE");
            delay(300);
            println("[4] ----> FRANCAIS");
            delay(300);
            println("[5] ----> ANGLAIS");
            println();
            String s1 = readString();
            if (equals(s1,"1")){
                println();
                println("Nous commençons avec des questions de mathématiques : ");
                delay(300);
                println();
                jouer(maths);
            }else if (equals(s1,"2")){
                println();
                println("Nous commençons avec des questions d'histoire : ");
                delay(300);
                println();
                jouer(histoire);
            }else if (equals(s1,"3")){
                println();
                println("Nous commençons avec des questions de géographie : ");
                delay(300);
                println();
                jouer(geo);
            }else if (equals(s1,"4")){
                println();
                println("Nous commençons avec des questions de français : ");
                delay(300);
                println();
                jouer(français);
            }else if (equals(s1,"5")){
                println();
                println("Nous commençons avec des questions d'anglais : ");
                delay(300);
                println();
                jouer(anglais);
            }
            continue;
            }else if (equals(z, "3")){
                delay(300);
                println();
                jouer(afficherMenu());
                System.exit(0);
            }else if (equals(z, "4")){
                delay(300);
                println();
                println("Merci d'avoir joué, à une prochaine fois !");
                println();
                System.exit(0);
            }
        }while (!equals(z, "1") && !equals(z, "2") && !equals(z, "3"));
        println();
        delay(300);
        }while(tour != 2);        
    }

    void algorithm(){
        for (int i=0; i<10; i++){
            println(readLine(image_bienvenue));
        }
        jouer(afficherMenu()); 
    }
}
