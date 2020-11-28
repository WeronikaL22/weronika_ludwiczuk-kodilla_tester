public class PrintColour {
    public static void main(String[] args) {
       String colourLetter = DefineColour.getLetter().toLowerCase();
       //System.out.println("You typed   "+ colourLetter);
        switch (colourLetter) {
          case "w":
              System.out.println( "It's white" );
              break;
          case "r":
                System.out.println( "It's red" );
              break;
          case "b":
                System.out.println( "It's black" );
                break;
          case"y":
              System.out.println( "It's yellow" );
              break;
          case"o":
                System.out.println( "It's orange" );
                break;
          default:
              break;
        }
    }
}