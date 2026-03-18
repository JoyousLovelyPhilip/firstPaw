class joy{
    void beautiful()
    {
        System.out.println("she is beautiful");
    }
    void voice()
    {
        System.out.println("She sings well");
    }
}
    class ann extends joy{
    void voice()
        {
            System.out.println("she sounds beautiful");
        }
    }
    public class main
    {
        public static void main(String args[])
    {
        joy gig = new ann();
        gig.beautiful() ;
    }
}   