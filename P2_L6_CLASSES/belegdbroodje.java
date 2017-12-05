package P2_L6_CLASSES;

public class BelegdBroodje {

    private String broodje;
    private String beleg;
    private String extra = "";

    public BelegdBroodje(String broodje, String beleg) {
        this.broodje = broodje;
        this.beleg = beleg;
    }

    public void broodjeExtraBeleg(String extra) {
        this.extra = extra;
    }

    public void veranderBroodje(String broodje) {
        this.broodje = broodje;
    }

    public String getBroodje() {
        return broodje;
    }

    public String getBeleg() {
        return beleg;
    }

    public String getExtra() {
        if (extra.equals("")) {
            return "";
        } else {
            return " en extra " + extra;
        }
    }

    public static void main(String[] args ) {

        BelegdBroodje broodje = new BelegdBroodje("panini", "kaas");

        System.out.printf("%s met %s%s\n",
                broodje.getBroodje(),
                broodje.getBeleg(),
                broodje.getExtra());

        broodje.veranderBroodje("baguette");
        broodje.broodjeExtraBeleg("ham");

        System.out.printf("%s met %s%s\n",
                broodje.getBroodje(),
                broodje.getBeleg(),
                broodje.getExtra());
    }

}
