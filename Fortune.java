import java.util.Random;
public class Fortune{
    public static void main(String[] args) {
        Random random = new Random();
        String[] fortunes = {
            "A surprise item will appear in your code today.",
            "Your bugs will vanish on the second try.",
            "A great journey begins with a single line of code.",
            "You will find money in an old pair of pants.",
            "Patience is your key to solving tough problems."
        };

        int index = random.nextInt(fortunes.length);
        String chosenFortune = fortunes[index];

        System.out.println("======================================");
        System.out.println("🥠 YOUR DIGITAL FORTUNE COOKIE 🥠");
        System.out.println("======================================");
        System.out.println("Fortune: " + chosenFortune);
        
        System.out.print("Lucky Numbers: ");
        System.out.print((random.nextInt(50) + 1) + " - ");
        System.out.print((random.nextInt(50) + 1) + " - ");
        System.out.println(random.nextInt(50) + 1);
        System.out.println("======================================");
    }
}