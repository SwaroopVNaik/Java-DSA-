import java.util.*;

public class Train 
{
    static int platformCount(int [] arrival, int [] departure)
    {
        if(arrival == null || departure == null || arrival.length != departure.length)
        {
            System.out.println("Invalid Input");
            return -100;
        }

        int maxPlatfrom = 0;
        int minPlatformCurrently = 0;

        Arrays.sort(arrival);
        Arrays.sort(departure);

        System.out.println("Arrvial Time Of Train : " + Arrays.toString(arrival));
        System.out.println("Departure Time Of Train : " + Arrays.toString(departure));

        int arrivalIndex = 0;
        int departureIndex = 0;

        while(arrivalIndex < arrival.length)
        {
            if(arrival[arrivalIndex] <= departure[departureIndex])
            {
                minPlatformCurrently = minPlatformCurrently + 1;
                maxPlatfrom = Math.max(minPlatformCurrently, maxPlatfrom);

                arrivalIndex = arrivalIndex + 1;
            }
            else if(arrival[arrivalIndex] > departure[departureIndex])
            {
                if(minPlatformCurrently == 0)
                {
                    System.out.println("Invalid Input");
                    return -100;
                }

                minPlatformCurrently = minPlatformCurrently - 1;

                departureIndex = departureIndex + 1;
            }
        }

        return maxPlatfrom;
    }

    public static void main(String[] args) 
    {
        int [] arrival = {1030, 1050, 1035, 1050, 1037};
        int [] departure = {1045, 1055, 1040, 1110, 1058};

        int count = platformCount(arrival, departure);
        
        System.out.println("The Maximum Number of Platforms needed : " + count);
    }
}