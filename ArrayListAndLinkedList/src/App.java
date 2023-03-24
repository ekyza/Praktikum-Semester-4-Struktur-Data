import java.util.ArrayList;

public class App {
    private static ArrayList<Animal> daftarHewan = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        daftarHewan.add(new Animal("Sapi", "Coklat"));
        daftarHewan.add(new Animal("Kelinci", "Putih"));
        daftarHewan.add(new Animal("Kambing", "Hitam"));
        daftarHewan.add(new Animal("Unta", "Coklat"));
        daftarHewan.add(new Animal("Domba", "Putih"));

        System.out.print("Hewan : [ ");
        for(int index = 0; index < daftarHewan.size(); index++) {
            System.out.print(daftarHewan.get(index).getName() + ", ");
        }
        System.out.println("]\n");

        System.out.print("Hewan yang dihapus : [ ");
        for(int index = 0; index < daftarHewan.size(); index++) {
            if(daftarHewan.get(index).getColor() == new DeleteAnimal("Coklat").getColor()) {
                System.out.print(daftarHewan.get(index).getName() + ", ");
                daftarHewan.remove(index);
            }
        }
        System.out.println("]\n");

        System.out.print("Hewan yang tersisa : [ ");
        for(int index = 0; index < daftarHewan.size(); index++) {
            System.out.print(daftarHewan.get(index).getName() + ", ");
        }
        System.out.println("]\n");
    }
}
