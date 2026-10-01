public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (!hasPet()) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("Água ou shampoo insuficiente para o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        this.pet.setClean(true);

        System.out.println("O pet " + this.pet.getName() + " está limpo.");
    }

    public void addWater() {
        if (this.water >= 30) {
            System.out.println("A capacidade de água está no máximo.");
            return;
        }

        this.water = Math.min(this.water + 2, 30);

        System.out.println("Água abastecida. Total: "
                + this.water + " litro(s).");
    }

    public void addShampoo() {
        if (this.shampoo >= 10) {
            System.out.println("A capacidade de shampoo está no máximo.");
            return;
        }

        this.shampoo = Math.min(this.shampoo + 2, 10);

        System.out.println("Shampoo abastecido. Total: "
                + this.shampoo + " litro(s).");
    }

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public void setPet(Pet pet) {
        if (pet == null) {
            System.out.println("Informe um pet válido.");
            return;
        }

        if (!this.clean) {
            System.out.println("A máquina está suja. Limpe-a primeiro.");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName()
                    + " já está na máquina.");
            return;
        }

        this.pet = pet;

        System.out.println("O pet " + this.pet.getName()
                + " foi colocado na máquina.");
    }

    public void removePet() {
        if (!hasPet()) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName()
                + " foi retirado da máquina.");

        this.pet = null;
    }

    public void wash() {
        if (hasPet()) {
            System.out.println("Retire o pet antes de limpar a máquina.");
            return;
        }

        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("Água ou shampoo insuficiente para limpar a máquina.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("A máquina foi limpa.");
    }
}