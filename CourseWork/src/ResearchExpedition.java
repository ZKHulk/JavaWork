public class ResearchExpedition
{
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    public ResearchExpedition(ExpeditionMember leader, ExpeditionMember archivist, ExpeditionMember researcher)
    {
        this.expeditionLeader = leader;
        this.archivist = (archivist);
        this.fieldResearcher = researcher;
    }

    public void change_object_assign  (ExpeditionMember X)
    {
        expeditionLeader = X;
    }

    public String getExpeditionLeaderName()
    {
        return expeditionLeader.getExpeditionName();
    }

    public String getArchivistName()
    {
        return archivist.getExpeditionName();
    }

    public String getFieldResearcherName()
    {
        return fieldResearcher.getExpeditionName();
    }
}
