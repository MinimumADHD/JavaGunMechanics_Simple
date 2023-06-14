public class M4A1 {
    private final int MaxAmmo = 20;
    private int CurrentAmmo = 20;
    private int CurrentMode = 0;
    private final String[] UsableModes = {"Semi", "Burst", "Auto", "Safe"};

    public void ReloadGun() {
        if (CurrentAmmo < MaxAmmo) {
            if (CurrentAmmo == 0) {
                CurrentAmmo = MaxAmmo-1;
                return;
            }
            CurrentAmmo = MaxAmmo;
        }
    }

    public void SwitchMode() {
        if (CurrentMode != UsableModes.length-1) {
            CurrentMode += 1;
            return;
        }
        CurrentMode = 0;
    }

    public void ShootGun() {
        if (CurrentAmmo > 0 && CurrentAmmo <= MaxAmmo) {
            if (UsableModes[CurrentMode] == "Semi") {
                CurrentAmmo -= 1;
            } else if (UsableModes[CurrentMode] == "Burst") {
                if (CurrentAmmo < 3) {
                    CurrentAmmo = 0;
                    return;
                }
                CurrentAmmo -= 3;
            } else if (UsableModes[CurrentMode] == "Auto") {
                CurrentAmmo = 0;
            } else if (UsableModes[CurrentMode] == "Safe") {
                System.out.println("*GUN JAM SOUND*");
            }
        }
    }

    public void CheckGun() {
        System.out.println("Current ammo in gun: "+CurrentAmmo+"\nCurrent Mode: "+UsableModes[CurrentMode]);
    }
}
