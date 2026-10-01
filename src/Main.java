import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");

            try {
                option = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número de 0 a 9.");
                option = -1;
                continue;
            }

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShapoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.out.println("Programa encerrado.");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);
    }

    private static void setWater() {
        petMachine.addWater();
    }

    private static void setShapoo() {
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        System.out.println("A máquina está com "
                + petMachine.getWater() + " litro(s) de água.");
    }

    private static void verifyShampoo() {
        System.out.println("A máquina está com "
                + petMachine.getShampoo() + " litro(s) de shampoo.");
    }

    private static void checkIfHasPetInMachine() {
        boolean hasPet = petMachine.hasPet();

        System.out.println(hasPet
                ? "Tem pet na máquina."
                : "Não tem pet na máquina.");
    }

    public static void setPetInPetMachine() {
        String name;

        do {
            System.out.println("Informe o nome do pet:");
            name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("O nome não pode ficar vazio.");
            }
        } while (name.isEmpty());

        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }
}