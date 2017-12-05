public class BelegdBroodje {

    private String broodje;
    private String beleg;
    private String extra;

    public BelegdBroodje(String broodje, String beleg) {
 /*
  * Vul de constructor in.
  */
        // Zoek uit wat de this doet en gebruik als je het weet dit ook voor de andere 
        // variabelen.
        // Probeer uit wat een variabele doet zonder this.
        this.extra = "geen extra beleg";
    }

    public void broodjeExtraBeleg(String extra) {
 /*
  * Zorg dat je extra beleg aan het broodje kunt toevoegen.
  */
    }

    public void veranderBroodje(String broodje) {
 /*
  * Wat voor broodje wil jij nu hebben.
  */
    }

    public String getBroodje() {
 /*
  * Laat zien wat voor soort broodje is het.
  */
    }

    public String getBeleg() {
 /*
  * Laat zien wat voor beleg zit erop.
  */
    }

    public String getExtra() {
        if (extra.equals("")) {
            return "";
        } else {
            return " en extra " + extra;
        }
    }

    public static void main(String[] args ) {

// Een verse panini met kaas
        BelegdBroodje broodje = new BelegdBroodje("panini", "kaas");

// Ok, laat maar zien wat er allemaal op zit.
        System.out.printf("%s met %s%s\n",
                broodje.getBroodje(),
                broodje.getBeleg(),
                broodje.getExtra());

// Oh nee, ik bedoelde een baguette met kaas en ham in plaats van panini met kaas. 
        broodje.veranderBroodje("baguette");
        broodje.broodjeExtraBeleg("ham");

// Weet je al hoe printf werkt?
        System.out.printf("%s met %s%s\n",
                broodje.getBroodje(),
                broodje.getBeleg(),
                broodje.getExtra());
    }

}
