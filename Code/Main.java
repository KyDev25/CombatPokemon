package ModelPokemon;

import java.util.*;

public class Main {
    // Creating Pokémon lists
    static List<Pokemon> pokemon = new ArrayList<>();
    static List<TypeFeu> typeFeu = new ArrayList<>();
    static List<TypeEau> typeEau = new ArrayList<>();
    static List<TypePlante> typePlante = new ArrayList<>();

    static List<Pokemon> listCombat = new ArrayList<>();
    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        // Request of user's choice
        for (;;) {
            switch (choix()) {
                case 1:
                    switchChoixAddPokemon();
                    break;
                case 2:
                    switchChoixSuppPokemon();
                    break;
                case 3:
                    switchChoixCombatPokemon();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Entrez un choix valide...");
                    break;
            }
        }
    }

    // Function that gives the user the choice to add, delete, make a fight or leave
    public static int choix() {
        System.out.println(
                "ATTENTION : Tous les choix se font via l'index.\nDonc chaque choix est un nombre et non une lettre !\n");
        System.out.println("Choisissez une option : \n");
        System.out.println("1 - Ajouter un Pokemon");
        System.out.println("2 - Supprimer un Pokemon");
        System.out.println("3 - Faire un combat de Pokemon");
        System.out.println("4 - Quitter\n");
        System.out.println("Votre choix : ");
        int choice = Integer.parseInt(scan.next());
        return choice;
    }

    // Function that gives the user to add a Pokemon
    public static int choixAddPokemon() {
        System.out.println("Choisissez une option : \n");
        System.out.println("1 - Ajouter un Pokemon de type NORMAL");
        System.out.println("2 - Ajouter un Pokemon de type FEU");
        System.out.println("3 - Ajouter un Pokemon de type EAU");
        System.out.println("4 - Ajouter un Pokemon de type PLANTE");
        System.out.println("5 - Retour\n");
        System.out.println("Votre choix : ");
        int choiceAdd = Integer.parseInt(scan.next());
        return choiceAdd;
    }

    // Function that gives the user to delete a Pokemon
    public static int choixSuppPokemon() {
        System.out.println("Choisissez une option : \n");
        System.out.println("1 - Supprimer un Pokemon de type NORMAL");
        System.out.println("2 - Supprimer un Pokemon de type FEU");
        System.out.println("3 - Supprimer un Pokemon de type EAU");
        System.out.println("4 - Supprimer un Pokemon de type PLANTE");
        System.out.println("5 - Retour\n");
        System.out.println("Votre choix : ");
        int choiceSupp = Integer.parseInt(scan.next());
        return choiceSupp;
    }

    // Function that gives the user to make fight
    public static int choixCombatPokemon() {
        System.out.println("Choisissez deux Pokemons : \n");
        System.out.println("1 - Pokemon de type NORMAL");
        System.out.println("2 - Pokemon de type FEU");
        System.out.println("3 - Pokemon de type EAU");
        System.out.println("4 - Pokemon de type PLANTE");
        System.out.println("5 - Combattre");
        System.out.println("6 - Retour\n");
        System.out.println("Votre choix : ");
        int choiceCombat = Integer.parseInt(scan.next());
        return choiceCombat;
    }

    // Function that allows you to choose the Pokemon to add
    public static void switchChoixAddPokemon() {
        for (;;) {
            switch (choixAddPokemon()) {
                case 1:
                    addPokemonNormal();
                    break;
                case 2:
                    addPokemonFeu();
                    break;
                case 3:
                    addPokemonEau();
                    break;
                case 4:
                    addPokemonPlante();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Entrez un choix valide...");
                    break;
            }
        }
    }

    // Function that allows you to choose the Pokemon to delete
    public static void switchChoixSuppPokemon() {
        for (;;) {
            switch (choixSuppPokemon()) {
                case 1:
                    suppPokemonNormal();
                    break;
                case 2:
                    suppPokemonFeu();
                    break;
                case 3:
                    suppPokemonEau();
                    break;
                case 4:
                    suppPokemonPlante();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Entrez un choix valide...");
                    break;
            }
        }
    }

    // Function that allows you to choose the Pokemon to make fight
    public static void switchChoixCombatPokemon() {
        for (;;) {
            switch (choixCombatPokemon()) {
                case 1:
                    choixPokemonNormal();
                    break;
                case 2:
                    choixPokemonFeu();
                    break;
                case 3:
                    choixPokemonEau();
                    break;
                case 4:
                    choixPokemonPlante();
                    break;
                case 5:
                    combatPokemon();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Entrez un choix valide...");
                    break;
            }
        }
    }

    // Function to add the selected Pokemon Normal
    public static void addPokemonNormal() {
        System.out.println("Son Nom : ");
        String nom = scan.next();
        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1);
        for (;;) {
            try {
                System.out.println("Son HP : ");
                float hp = Float.parseFloat(scan.next());
                System.out.println("Son Attaque : ");
                float atk = Float.parseFloat(scan.next());
                pokemon.add(new Pokemon(nom, hp, atk));
                return;
            } catch (NumberFormatException number) {
                System.out.println("\nVeuillez entrer un nombre...\n");
            }
        }
    }

    // Function to add the selected Pokemon Fire
    public static void addPokemonFeu() {
        System.out.println("Son Nom : ");
        String nom = scan.next();
        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1);
        for (;;) {
            try {
                System.out.println("Son HP : ");
                float hp = Float.parseFloat(scan.next());
                System.out.println("Son Attaque : ");
                float atk = Float.parseFloat(scan.next());
                typeFeu.add(new TypeFeu(nom, hp, atk));
                return;
            } catch (NumberFormatException number) {
                System.out.println("\nVeuillez entrer un nombre...\n");
            }
        }
    }

    // Function to add the selected Pokemon Water
    public static void addPokemonEau() {
        System.out.println("Son Nom : ");
        String nom = scan.next();
        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1);
        for (;;) {
            try {
                System.out.println("Son HP : ");
                float hp = Float.parseFloat(scan.next());
                System.out.println("Son Attaque : ");
                float atk = Float.parseFloat(scan.next());
                typeEau.add(new TypeEau(nom, hp, atk));
                return;
            } catch (NumberFormatException number) {
                System.out.println("\nVeuillez entrer un nombre...\n");
            }
        }
    }

    // Function to add the selected Pokemon Plant
    public static void addPokemonPlante() {
        System.out.println("Son Nom : ");
        String nom = scan.next();
        nom = nom.substring(0, 1).toUpperCase() + nom.substring(1);
        for (;;) {
            try {
                System.out.println("Son HP : ");
                float hp = Float.parseFloat(scan.next());
                System.out.println("Son Attaque : ");
                float atk = Float.parseFloat(scan.next());
                typePlante.add(new TypePlante(nom, hp, atk));
                return;
            } catch (NumberFormatException number) {
                System.out.println("\nVeuillez entrer un nombre...\n");
            }
        }
    }

    // Function to delete the selected Pokemon Normal
    public static void suppPokemonNormal() {

        int number = 1;
        for (Pokemon normal : pokemon) {
            System.out.println(number + " - " + normal.getNom());
            number++;
        }
        System.out.println("Votre choix : ");
        int choix = Integer.parseInt(scan.next());

        try {
            pokemon.remove(choix - 1);
        } catch (IndexOutOfBoundsException index) {
            System.out.println("\nLe Pokemon sélectionné n'existe pas...\n");
        }
    }

    // Function to delete the selected Pokemon Fire
    public static void suppPokemonFeu() {

        int number = 1;
        for (TypeFeu feu : typeFeu) {
            System.out.println(number + " - " + feu.getNom());
            number++;
        }
        System.out.println("Votre choix : ");
        int choix = Integer.parseInt(scan.next());

        try {
            typeFeu.remove(choix - 1);
        } catch (IndexOutOfBoundsException index) {
            System.out.println("\nLe Pokemon sélectionné n'existe pas...\n");
        }
    }

    // Function to delete the selected Pokemon Water
    public static void suppPokemonEau() {

        int number = 1;
        for (TypeEau eau : typeEau) {
            System.out.println(number + " - " + eau.getNom());
            number++;
        }
        System.out.println("Votre choix : ");
        int choix = Integer.parseInt(scan.next());

        try {
            typeEau.remove(choix - 1);
        } catch (IndexOutOfBoundsException index) {
            System.out.println("\nLe Pokemon sélectionné n'existe pas...\n");
        }
    }

    // Function to delete the selected Pokemon Plant
    public static void suppPokemonPlante() {

        int number = 1;
        for (TypePlante plante : typePlante) {
            System.out.println(number + " - " + plante.getNom());
            number++;
        }
        System.out.println("Votre choix : ");
        int choix = Integer.parseInt(scan.next());

        try {
            typePlante.remove(choix - 1);
        } catch (IndexOutOfBoundsException index) {
            System.out.println("\nLe Pokemon sélectionné n'existe pas...\n");
        }
    }

    // Function to view a list of Pokemon Normal
    public static void choixPokemonNormal() {
        if (listCombat.size() < 2) {
            int number = 1;
            for (Pokemon normal : pokemon) {
                System.out.println(number + " - \n" + normal.toString());
                number++;
            }
            System.out.println("Veuillez choisir un Pokemon : ");
            int choix = Integer.parseInt(scan.next());

            try {
                listCombat.add(pokemon.get(choix - 1));
            } catch (IndexOutOfBoundsException index) {
                System.out.println("\nCe Pokemon n'existe pas...\n");
            }
        } else {
            System.out.println("\nVous avez déjà séléctionné deux Pokemons...\n");
        }
    }

    // Function to view a list of Pokemon Fire
    public static void choixPokemonFeu() {
        if (listCombat.size() < 2) {
            int number = 1;
            for (TypeFeu feu : typeFeu) {
                System.out.println(number + " - \n" + feu.toString());
                number++;
            }
            System.out.println("Veuillez choisir un Pokemon : ");
            int choix = Integer.parseInt(scan.next());

            try {
                listCombat.add(typeFeu.get(choix - 1));
            } catch (IndexOutOfBoundsException index) {
                System.out.println("\nCe Pokemon n'existe pas...\n");
            }
        } else {
            System.out.println("\nVous avez déjà séléctionné deux Pokemons...\n");
        }
    }

    // Function to view a list of Pokemon Water
    public static void choixPokemonEau() {
        if (listCombat.size() < 2) {
            int number = 1;
            for (TypeEau eau : typeEau) {
                System.out.println(number + " - \n" + eau.toString());
                number++;
            }
            System.out.println("Veuillez choisir un Pokemon : ");
            int choix = Integer.parseInt(scan.next());

            try {
                listCombat.add(typeEau.get(choix - 1));
            } catch (IndexOutOfBoundsException index) {
                System.out.println("\nCe Pokemon n'existe pas...\n");
            }
        } else {
            System.out.println("\nVous avez déjà séléctionné deux Pokemons...\n");
        }
    }

    // Function to view a list of Pokemon Plant
    public static void choixPokemonPlante() {
        if (listCombat.size() < 2) {
            int number = 1;
            for (TypePlante plante : typePlante) {
                System.out.println(number + " - \n" + plante.toString());
                number++;
            }
            System.out.println("Veuillez choisir un Pokemon : ");
            int choix = Integer.parseInt(scan.next());

            try {
                listCombat.add(typePlante.get(choix - 1));
            } catch (IndexOutOfBoundsException index) {
                System.out.println("\nCe Pokemon n'existe pas...\n");
            }
        } else {
            System.out.println("\nVous avez déjà séléctionné deux Pokemons...\n");
        }
    }

    // Function to make figth with selected Pokemon
    public static void combatPokemon() {

        System.out.println("Voici la liste des combattants : \n");

        try {
            System.out.println(listCombat.get(0));
            System.out.println("VS\n");
            System.out.println(listCombat.get(1));

            for (;;) {
                if (listCombat.get(0).getHp() >= 0 || listCombat.get(1).getHp() >= 0) {
                    listCombat.get(0).attack(listCombat.get(1));
                    listCombat.get(1).attack(listCombat.get(0));
                } else if (listCombat.get(0).getHp() < 0) {
                    System.out.println(listCombat.get(0).getNom() + " a été vainqu !");
                    return;
                } else if (listCombat.get(1).getHp() < 0) {
                    System.out.println(listCombat.get(1).getNom() + " a été vainqu !");
                    return;
                }
            }
        } catch (IndexOutOfBoundsException index) {
            System.out.println("\nVous devez d'abord choisir deux Pokemons...\n");
        }
    }
}
