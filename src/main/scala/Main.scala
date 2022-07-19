object Main {
  /*
     Prenom: Ousmane
     Nom: Sakho
     Niveau: M2
    */

  /*
   var est utilisé pour déclarer une variable mutable. Donc la valeur de cette variable peut être changé au cours du programme.
   On peut utiliser une variable par exemple pour faire une boucle. A chaque itération cette variable peut changer de valeur
   soit pour compter soit pour garder en mémoire une valeur déterministe.


   Par ailleurs val est utilisé pour définir une constante ou variable immutable avec forcément une valeur. Cette valeur ne change pas durant le cours du programme.
   On peut utiliser une constante par exemple pour enregistre la valeur mathematique PI = 3.14. Ou bien quand on souhaite faire de
   la pagination dans une app et qu'on souhaite avoir un nombre de ligne par defaut alors on peut le mettre dans une constante
   defaultLimit = 20
  */

  def main(args: Array[String]): Unit = {

    val name: String = "Ousmane Sakho";
    var favouriteDishes = Array("Soupou kandia", "Guinar", "Thieb niébé", "Maxalou Saloum", "Yape");
    var age: Int = 30;
    var expectedJob: String = "Data Engineer";

    println("Je me nomme %s, j'ai %d ans et l'un de mes plats favoris est %s.".format(name, age, favouriteDishes(2)));

    var sixthFavoriteDish: String = "Yassa Yape";
    favouriteDishes = favouriteDishes :+ sixthFavoriteDish;

    var filteredFavoriteDish = favouriteDishes.filter(dish => dish(0) > 'O');

    favouriteDishes.zipWithIndex.map{ case (dish, index) => println("Mon plat favori numéro %d est %s".format(index+1, dish))}

     def  randomNum() : Int = {
       val r = scala.util.Random
       r.nextInt(100)
     }
    var generated: Int = 0;
    var num: Int = 0;
//     do {
//       println("Veuillez fournir un nombre à deviner svp ");
//       num = scala.io.StdIn.readInt();
//       generated = randomNum();
//       if(num == generated) {
//         println("La machine à déviner le nombre choisi");
//       } else {
//         println(s"La machine a déviner le nombre $generated qui n'est pas correct");
//       }
//     } while(generated != num);

    def pgcd(a: Int, b: Int) : Int = {
      var pgcd = 0;
      var i = if(a > b) b else a;
      do {

        val mod1 = Math.floorMod(a, i);
        val mod2 = Math.floorMod(b, i);
        if( mod1 == mod2  && mod1 == 0) {
          pgcd = i;
          println(s"le pgcd de $a et $b est $pgcd");
        }
        i = i - 1;
      } while(i > 0 && pgcd  == 0);
      return pgcd;
    }

//    do {
//      println("Donner deux nombres pour connaitre leur pgcd ");
//      val a: Int = scala.io.StdIn.readInt();
//      val b: Int = scala.io.StdIn.readInt();
//      val pg = pgcd(a, b);
//    } while(true);

  def isPremier(n: Int): Boolean = {
    var i = 0;
    var test = true;
    for(i <- 2 to n - 1) {
      if(Math.floorMod(n, i) == 0) {
        test = false;
      }
    }
    if(test == true) {
      println(s"$n est un nombre premier");
    } else {
      println(s"$n n'est pas premier");
    }
    return test;
  }

//        do {
//          println("Donner un nombre pour tester s'il est premier ");
//          val n: Int = scala.io.StdIn.readInt();
//          val pg = isPremier(n);
//        } while(true);
// Question 10
    def drawIsoceleTriangle(cote: Int): Unit = {
      for(i <- 1 to cote) {
        val leftSpaces = cote - i + 2;
        for(j <- 1 to leftSpaces) {
          print(" ");
        }
        if(i == 1) print(" ")
        print("*");
        if(i != 1 && i != cote) {
          for(j <- 1 to i * 2 - 1) {
            print(" ");
          }
          print("*")
        }
        if(i == cote) {
          for(i <- 1 to cote) {
            print(" *")
          }
        }
        println();
      }

    }

            do {
              println("Donner le cote du triangle isocele a dessiner example: 10 ");
              val cote: Int = scala.io.StdIn.readInt();
              drawIsoceleTriangle(cote);
            } while(true);
  }
}