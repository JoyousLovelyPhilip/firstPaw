public class Test{
    public static void main(String[] args){
        boolean isLoggedIn = true;
        boolean isAdmin = true;
        int securityLevel = 4; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 5)) {
            System.out.println("Access granted");//Access granted
            } 
        else {
            System.out.println("Access denied");
            }
    }
}