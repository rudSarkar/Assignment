class GameAgeLimitException extends Exception {
    GameAgeLimitException(String message) {
        super(message);
    }
}
class checkUserInformaion {
    String Name;
    int ID;
    int Age;

    checkUserInformaion(String name, int id, int age) throws GameAgeLimitException {

        this.Name = name;
        this.ID = id;
        this.Age = age;

        if (age < 13) {
            throw new GameAgeLimitException("You can't play this game.");
        } else {
            System.out.println("You can play this game " + name+".");
        }
    }
}
public class Main {
    public static void main(String args[]) {
        try {
            checkUserInformaion checkuserinformation = new checkUserInformaion("Aonkon Mallick", 193002132, 10);
        } catch (Exception e) {
            System.out.println(e + "\n");
        }
    }
}
