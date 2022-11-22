package ModelPokemon;

public class TypeFeu extends Pokemon {
    public TypeFeu(String nom, float hp, float atk) {
        super(nom, hp, atk);
    }

     // Method attack a Pokemon
    public void attack(Pokemon p){

        if (p.getClass().getSimpleName().equals("TypePlante")){
            p.setHp(p.getHp()-(super.getAtk()*2));
            System.out.println(getNom() + " attaque " + p.getNom() + "\n");
            System.out.println("Vous avez fait beaucoup de dégats !");
            System.out.println("\nPokemon " + p.getNom() + "\n----------\n" + "HP : " + p.getHp());
        } else if (p.getClass().getSimpleName().equals("TypeEau")) {
            p.setHp(p.getHp()-(super.getAtk()*0.5f));
            System.out.println(getNom() + " attaque " + p.getNom() + "\n");
            System.out.println("Vous avez fait peu de dégats !");
            System.out.println("\nPokemon " + p.getNom() + "\n----------\n" + "HP : " + p.getHp());
        } else {
            p.setHp(p.getHp()-super.getAtk());
            System.out.println(getNom() + " attaque " + p.getNom() + "\n");
            System.out.println("Vous avez fait quelques dégats !");
            System.out.println("\nPokemon " + p.getNom() + "\n----------\n" + "HP : " + p.getHp());
        }
    }

    @Override
    public String toString() {
        return "Pokemon " + nom + "\n**********" + "\nHP : " + hp + "\nAttaque : " + atk + "\nType : FEU" + "\n----------\n";
    }
}
