package P2_L3_SCOPE;

public class Scope {
   int nummertje1 = 1;			// Ben ik zichtbaar in een andere class en in een ander package?
   public int nummertje2 = 2; 		// Ben ik zichtbaar in een andere class en in een ander package?
   private int nummertje4 = 4; 		// Ben ik zichtbaar in een andere class en in een ander package?
   protected int nummertje5 = 5; 		// Ben ik zichtbaar in een andere class en in een ander package?

   public void scoopje() {
       int nummertje3 = 10;			// Ben ik zichtbaar in een andere class en in een ander package?

       for (int count = 0; count < nummertje3; count++) {
       }
       System.out.printf("%s%n", nummertje3); 	// GOED OF FOUT
       System.out.printf("%s%n", count); 		// GOED OF FOUT
   }
}
