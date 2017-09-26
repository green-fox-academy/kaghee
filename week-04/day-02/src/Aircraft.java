public class Aircraft {
    int currAmmo;
    int maxAmmo;
    int baseDmg;
    int dmg;

    public Aircraft() {
        currAmmo = 0;
    }

    public int fight() {
        dmg = baseDmg * currAmmo;
        currAmmo = 0;
        return dmg;
    }

    public int refill(int ammo) {
        if (maxAmmo <= ammo) {
            currAmmo += maxAmmo;
            return ammo - maxAmmo;
        } else {
            currAmmo += ammo;
            return 0;
        }
    }

    public String getType() {
        return this.getClass().toString();
    }

    public String getStatus() {
        return "Type" + this.getClass().toString() + ", Ammo: " + currAmmo + ", Base Damage: " + baseDmg +
                ", All Damage: " + dmg;
    }

    public static void main(String[] args) {
        Aircraft repcsi = new F16();

        repcsi.refill(300);
        System.out.println(repcsi.getStatus());
        repcsi.fight();
        System.out.println(repcsi.getStatus());
    }
}
