package ModelPokemon;

public class Pokemon {
    public String nom;
    public float hp;
    public float atk;

    public Pokemon(String nom, float hp, float atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    // Method attack a Pokemon
    public void attack(Pokemon p) {

        p.setHp(p.getHp() - this.atk);
        System.out.println(getNom() + " attaque " + p.getNom() + "\n");
        System.out.println("Vous avez fait quelques dégats !");
        System.out.println("\nPokemon " + p.getNom() + "\n----------\n" + "HP : " + p.getHp());
    }

    @Override
    public String toString() {
        return "Pokemon " + nom + "\n**********" + "\nHP : " + hp + "\nAttaque : " + atk + "\nType : NORMAL"
                + "\n----------\n";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getAtk() {
        return atk;
    }

    public void setAtk(float atk) {
        this.atk = atk;
    }
}
