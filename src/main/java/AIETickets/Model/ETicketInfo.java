package AIETickets.Model;

public class ETicketInfo {
    private String nameOfPic;
    private String PsgName;
    private String PsgID;
    private String ETicketNo;
    private String psgnamelocal;
    private String psgidlocal;
    private String eticketlocal;

    public String getNameOfPic() {
        return nameOfPic;
    }

    public void setNameOfPic(String nameOfPic) {
        this.nameOfPic = nameOfPic;
    }

    public String getPsgName() {
        return PsgName;
    }

    public void setPsgName(String psgName) {
        PsgName = psgName;
    }

    public String getPsgID() {
        return PsgID;
    }

    public void setPsgID(String psgID) {
        PsgID = psgID;
    }

    public String getETicketNo() {
        return ETicketNo;
    }

    public void setETicketNo(String ETicketNo) {
        this.ETicketNo = ETicketNo;
    }

    public String getPsgnamelocal() {
        return psgnamelocal;
    }

    public void setPsgnamelocal(String psgnamelocal) {
        this.psgnamelocal = psgnamelocal;
    }

    public String getPsgidlocal() {
        return psgidlocal;
    }

    public void setPsgidlocal(String psgidlocal) {
        this.psgidlocal = psgidlocal;
    }

    public String getEticketlocal() {
        return eticketlocal;
    }

    public void setEticketlocal(String eticketlocal) {
        this.eticketlocal = eticketlocal;
    }

    @Override
    public String toString() {
        return "ETicketInfo{" +
                "nameOfPic='" + nameOfPic + '\'' +
                ", PsgName='" + PsgName + '\'' +
                ", PsgID='" + PsgID + '\'' +
                ", ETicketNo='" + ETicketNo + '\'' +
                ", psgnamelocal='" + psgnamelocal + '\'' +
                ", psgidlocal='" + psgidlocal + '\'' +
                ", eticketlocal='" + eticketlocal + '\'' +
                '}';
    }

    public ETicketInfo(String nameOfPic, String psgName, String psgID, String ETicketNo, String psgnamelocal, String psgidlocal, String eticketlocal) {
        this.nameOfPic = nameOfPic;
        PsgName = psgName;
        PsgID = psgID;
        this.ETicketNo = ETicketNo;
        this.psgnamelocal = psgnamelocal;
        this.psgidlocal = psgidlocal;
        this.eticketlocal = eticketlocal;
    }

    public ETicketInfo() {
    }
}
