package Entities;

public class Member extends Address{
    String memberName;
    String memberID;
    Integer memberPhone;

    public String getMemberName() {
        return memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public Integer getMemberPhone() {
        return memberPhone;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setMemberPhone(Integer memberPhone) {
        this.memberPhone = memberPhone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberID='" + memberID + '\'' +
                ", memberPhone=" + memberPhone +
                '}';
    }
}
