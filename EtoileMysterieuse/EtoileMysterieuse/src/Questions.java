class Questions{
    String quest;
    String reponses;
    String choix_un;
    String choix_deux;
    String choix_trois;
}

/*Questions mat_un = new Questions(); 
       mat_un.quest = "45 + 9 = ";
       mat_un.reponses = "54";
       mat_un.choix_un = "63";
       mat_un.choix_deux = "55"; 
       mat_un.choix_trois = "89";

Questions mat_deux = new Questions(); 
       mat_deux.quest = "7 * 7 = ";
       mat_deux.reponses = "49";
       mat_deux.choix_un = "98";
       mat_deux.choix_deux = "5"; 
       mat_deux.choix_trois = "13";

Questions mat_trois = new Questions(); 
       mat_trois.quest = "100 - 64 = ";
       mat_trois.reponses = "46";
       mat_trois.choix_un = "100";
       mat_trois.choix_deux = "5"; 
       mat_trois.choix_trois = "66";

Questions mat_quatre = new Questions(); 
       mat_quatre.quest = "10 * 2 = ";
       mat_quatre.reponses = "20";
       mat_quatre.choix_un = "200";
       mat_quatre.choix_deux = "18"; 
       mat_quatre.choix_trois = "2";

Questions mat_cinq = new Questions(); 
       mat_cinq.quest = "15 / 3 = ";
       mat_cinq.reponses = "5";
       mat_cinq.choix_un = "3";
       mat_cinq.choix_deux = "10"; 
       mat_cinq.choix_trois = "1";

Questions mat_six = new Questions(); 
       mat_six.quest = "Combien de côtés a un hexagone ? ";
       mat_six.reponses = "6";
       mat_six.choix_un = "3";
       mat_six.choix_deux = "2"; 
       mat_six.choix_trois = "16";

Questions mat_sept = new Questions(); 
       mat_sept.quest = "Comment appelle-t-on un angle à 90° ? ";
       mat_sept.reponses = "un angle droit";
       mat_sept.choix_un = "un angle parrallèle";
       mat_sept.choix_deux = "un angle perpendiculaire"; 
       mat_sept.choix_trois = "ca n'existe pas ";

Questions hist_un = new Questions(); 
       hist_un.quest = "Quand a été signé l'armistice de la 2nd GM ? ";
       hist_un.reponses = "08/05/1945";
       hist_un.choix_un = "08/05/1955";
       hist_un.choix_deux = "08/11/1975"; 
       hist_un.choix_trois = "15/03/1938 ";

Questions hist_deux = new Questions(); 
       hist_deux.quest = "Contre qui a perdu Vercingétorix ? ";
       hist_deux.reponses = "Jules Caesar";
       hist_deux.choix_un = "Astérix";
       hist_deux.choix_deux = "César Auguste"; 
       hist_deux.choix_trois = "Alésia ";

Questions hist_trois = new Questions(); 
       hist_trois.quest = "Qui fût le premier roi baptisé de France ? ";
       hist_trois.reponses = "Clovis";
       hist_trois.choix_un = "Louis XIV";
       hist_trois.choix_deux = "Charlemagne"; 
       hist_trois.choix_trois = "Henri I ";

Questions hist_quatre = new Questions(); 
       hist_quatre.quest = "Quelle est la date du sacre de Napoléon ? ";
       hist_quatre.reponses = "02/12/1804";
       hist_quatre.choix_un = "02/05/1913";
       hist_quatre.choix_deux = "25/06/1856"; 
       hist_quatre.choix_trois = "13/01/1605";

Questions hist_cinq = new Questions(); 
       hist_cinq.quest = "Qui a peint la Joconde ? ";
       hist_cinq.reponses = "Léonard De Vinci";
       hist_cinq.choix_un = "Pablo Picasso";
       hist_cinq.choix_deux = "Vincent van Gogh"; 
       hist_cinq.choix_trois = "Salvador Dali";

Questions hist_six = new Questions(); 
       hist_six.quest = "Au côté de quel roi Jeanne d'Arc a combattu les anglais ? ";
       hist_six.reponses = "Charles VII";
       hist_six.choix_un = "Pablo Picasso";
       hist_six.choix_deux = "Charlemagne"; 
       hist_six.choix_trois = "Clovis";

Questions hist_sept = new Questions(); 
       hist_sept.quest = "Qui fût le premier président de la Ve République ? ";
       hist_sept.reponses = "Charles De Gaulle";
       hist_sept.choix_un = "François Hollande";
       hist_sept.choix_deux = "Nicolas Sarkozy"; 
       hist_sept.choix_trois = "Jacques Chirac";

Questions geo_un = new Questions(); 
       geo_un.quest = "Quelle est la capitale de la France ? ";
       geo_un.reponses = "Paris";
       geo_un.choix_un = "Londres";
       geo_un.choix_deux = "Marseille"; 
       geo_un.choix_trois = "Bordeaux";

Questions geo_deux = new Questions(); 
       geo_deux.quest = "Quel fleuve passe par Bordeaux ? ";
       geo_deux.reponses = "La Garonne";
       geo_deux.choix_un = "La Seine ";
       geo_deux.choix_deux = "Le Rhône"; 
       geo_deux.choix_trois = "Le Rhin";

Questions geo_trois = new Questions(); 
       geo_trois.quest = "Combien y a-t-il de pays dans l'UE ? ";
       geo_trois.reponses = "27";
       geo_trois.choix_un = "26";
       geo_trois.choix_deux = "15"; 
       geo_trois.choix_trois = "30";

Questions geo_quatre = new Questions(); 
       geo_quatre.quest = "Combien de frontières possède la France Métropolitaine ? ";
       geo_quatre.reponses = "8";
       geo_quatre.choix_un = "5";
       geo_quatre.choix_deux = "12"; 
       geo_quatre.choix_trois = "6";

Questions geo_cinq = new Questions(); 
       geo_cinq.quest = "Dans quelle région se situe le département du Nord ? ";
       geo_cinq.reponses = "Hauts-De-France";
       geo_cinq.choix_un = "Ile-de-France";
       geo_cinq.choix_deux = "Occitanie"; 
       geo_cinq.choix_trois = "Bretagne";

Questions fr_un = new Questions(); 
       fr_un.quest = "Le verbe Gagner à la 1ère personne du pluriel et à l'imparfait ";
       fr_un.reponses = "Nous gagnions";
       fr_un.choix_un = "Vous gagnez";
       fr_un.choix_deux = "Nous gagnons"; 
       fr_un.choix_trois = "Je gagnais";

Questions fr_deux = new Questions(); 
       fr_deux.quest = "Citez les conjonctions de coordination : ";
       fr_deux.reponses = "mais, ou, et, donc, or, ni, car";
       fr_deux.choix_un = "je, tu, il, elle, nous, vous, ils, on";
       fr_deux.choix_deux = "leur, leurs, la, le"; 
       fr_deux.choix_trois = "lorsque, lesquelles, lesquel";

Questions an_un = new Questions(); 
       an_un.quest = "Traduisez \"Jeudi\" ";
       an_un.reponses = "Thursday ";
       an_un.choix_un = "Monday ";
       an_un.choix_deux = "Sunday"; 
       an_un.choix_trois = "Tuesday";

Questions an_deux = new Questions(); 
       an_deux.quest = "Que signifie \"yellow\" ? ";
       an_deux.reponses = "Jaune ";
       an_deux.choix_un = "Violet";
       an_deux.choix_deux = "Rouge"; 
       an_deux.choix_trois = "Bleu";*/