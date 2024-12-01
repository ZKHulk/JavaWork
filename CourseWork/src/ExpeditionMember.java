public class ExpeditionMember
{
    private String expeditionName;
    private int expeditionStudentID;

    public static int member_counter = 0;

    public ExpeditionMember(String expeditionName, int expeditionStudentID)
    {
        this.expeditionName = expeditionName;
        this.expeditionStudentID = expeditionStudentID;
        member_counter++;
    }
    public String getExpeditionName()
    {
        return expeditionName;
    }
    public void setExpeditionName(String expeditionName)
    {
        this.expeditionName = expeditionName;
    }

    public int getExpeditionStudentID()
    {
        return expeditionStudentID;
    }
    public void setExpeditionStudentID(int expeditionStudentID)
    {
        this.expeditionStudentID = expeditionStudentID;
    }

    public static int getMemberCount()
    {
        return member_counter;
    }



}
