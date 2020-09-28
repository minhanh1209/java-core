package Collection.Mobiles;

public class Mobile {
    String moblieID, moblieModel, mobileColor;
    float gia;

    public Mobile(){

    }

    public Mobile(String moblieID, String moblieModel, String mobileColor, float gia) {
        this.moblieID = moblieID;
        this.moblieModel = moblieModel;
        this.mobileColor = mobileColor;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "{" +
                "moblieID='" + moblieID + '\'' +
                ", moblieModel='" + moblieModel + '\'' +
                ", mobileColor='" + mobileColor + '\'' +
                ", gia=" + gia +
                '}';
    }
}
