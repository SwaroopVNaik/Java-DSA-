public record MergeSort() {

    static void merge(int [] OrginalArray, int low, int mid, int high)
    {
        int temp [] = new int[low - high + 1];

        int index = low;
        int jindex = high;
        int k = 0;

        // compare
        while(index <= mid && jindex <= high)
        {
            if(OrginalArray[index] < OrginalArray[jindex])
            {
                temp[k] = OrginalArray[index];
                k++;
                index++;
            }
            else
            {
                temp[k] = OrginalArray[jindex];
                jindex++;
                k++;
            }

        }

        // copy remaining left elements
        while (index <= mid) 
        {
            temp[k] = OrginalArray[index];
            index++;
            k++;  
        }

        // copy remaining right elements
        while(jindex <= high)
        {
            temp[k] = OrginalArray[jindex];
            jindex++;
            k++;
        }

        

    }

    static void printArray(int [] OrginalArray)
    {
        int index = 0;
        while(index < OrginalArray.length)
        {
            System.out.println(OrginalArray[index]);
        }
    }

    public static void main(String[] args) 
    {
        int [] OrginalArray = {10, 4, 8, 5, 6, 3, 7, 2, 1};
        
        System.out.println("Before Sorting : ");

        printArray(OrginalArray);

        merge(OrginalArray, 0, OrginalArray.length - 1);

        System.out.println("After Sorting : ");

        printArray(OrginalArray);
    }

}
