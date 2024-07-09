class BinarySearch
{
   public static void main(String args[])
   {


      int arr[]={12,13,14,15};
      int first=0,last=arr.length-1;

      int key=16;
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
       }  
   }
}

 