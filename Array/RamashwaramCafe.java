public class RamashwaramCafe
{
    static int seatingCapacityCount(int [] foodOrderTimmings, int [] emptyPlate)
    {
        int currentSeatingCount = 0;
        int maxSeatingCount = 0;

        int index = 0;
        int timingsIndex = 0;
        while(index < foodOrderTimmings.length)
        {
            if(foodOrderTimmings[index] >= 600)
            {
                emptyPlate[timingsIndex++] = foodOrderTimmings[index] + 10;
            }

            index = index + 1;
        }

        index = 0;
        int indexTwo = 0;

        while(index < foodOrderTimmings.length && indexTwo < emptyPlate.length)
        {
            if(foodOrderTimmings[index] < emptyPlate[indexTwo])
            {
                currentSeatingCount = currentSeatingCount + 1;
                maxSeatingCount = Math.max(currentSeatingCount, maxSeatingCount);

                index = index + 1;
            }
            else if(emptyPlate[indexTwo] < foodOrderTimmings[index])
            {
                currentSeatingCount = currentSeatingCount - 1;
                indexTwo = indexTwo + 1;
            }
        }

        return maxSeatingCount;
    
    }

    public static void main(String[] args) 
    {
        int [] foodOrderTimmings = {600, 600, 601, 601, 615, 616, 616, 617, 617};

        int [] timings = new int[foodOrderTimmings.length];

        int seatingCount = seatingCapacityCount(foodOrderTimmings, timings);

        System.out.println("The total Seating count : " + seatingCount);

    }
}
