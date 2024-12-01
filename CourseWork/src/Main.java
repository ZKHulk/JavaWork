import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        String allNames[] = {"Bob", "John", "Tim", "James", "Sam", "Frank", "Junaid", "Rajesh","Angela"};
        int[] allStudentIDs = {101, 102, 103, 104, 105, 106, 107, 108, 109};

        // set variables to the size of arrays for ease of access later

        int sizeof_allNames = allNames.length;
        int sizeof_allStudentIDs = allStudentIDs.length;

        // get the number of people we need for the expeditions between 4 to 6  and the size of array

        Random random = new Random();
        int randNum = random.nextInt(3)+4;  // this will generate a number between 0 to 3 - by adding 4 i get 4 inclusive to 7 exclusive

         System.out.println("We are going to have this money members :" + randNum );


        // Allocate member array according to the size we need

        ExpeditionMember[] members = new ExpeditionMember[randNum];

        // we need to generate randNum of random numbers between 0 and sizeof_allNames-1 to pick from array of names

        int count = 0;
        int [] temp_store = new int[randNum];

        // initialise the temp_store with value of -1 - so its clear when testing the values below

        for (int i=0; i<temp_store.length; i++)
        {
            temp_store[i] = -1;
        }


        while (count != randNum )
        {

            int number = random.nextInt (sizeof_allNames);
            int flag = 0;

            if (count > 1)
            {
                for (int z = 0; z < count; z++) {
                    if (temp_store[z] == number) {
                        flag = 1; // duplicate already exists
                        break;
                    }
                    continue;
                }
            }
            if (flag == 0) // we didnt find a duplicate so put it in the array
            {
                temp_store[count++] = number;
            }
        }

        // Allocate names of students and IDs to the members array defined earlier

        for (int i = 0; i <randNum; i++ )
        {
            members [i] = new ExpeditionMember(allNames[temp_store[i]], allStudentIDs[temp_store[i]]);
        }

        // Set the first 3 for the pyramid expedition

        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0],members[1],members[2]);

        // The last three have to be allocated to Research Expo
        // to get teh correct index values....
        // randNum was the full size of the array - so removing one gives us the correct index value

        int index_value_end_of_members = randNum -1;

        // Set the index values (0,-1, -2)

        ResearchExpedition nileExpedition = new ResearchExpedition(members[index_value_end_of_members],members[index_value_end_of_members-1],members[index_value_end_of_members-2]);


        // Lets do the printing to screen ....

        System.out.println("Pyramid Expedition Core Members:");
        System.out.println("Expedition Leader: " + pyramidExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + pyramidExpedition.getArchivistName());
        System.out.println("Field Researcher: " + pyramidExpedition.getFieldResearcherName());

        System.out.println("Nile Expedition Core Members:");
        System.out.println("Expedition Leader: " + nileExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + nileExpedition.getArchivistName());
        System.out.println("Field Researcher: " + nileExpedition.getFieldResearcherName());

        if(ExpeditionMember.getMemberCount() == members.length)
        {
            System.out.println("SUCCESS");
        }
        else
        {
            System.out.println("FAILURE");
        }



    }
}