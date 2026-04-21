class Solution {
    public static int merge(int arr[],int l,int mid,int h){
        int i= l;
        int j = mid+1;
        int k=0;
        int count =0;
        int temp[] = new int[h-l+1];
        while(i<=mid&&j<=h){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                count +=mid-i+1;
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=h){
            temp[k++] =arr[j++];
        }
        for(int x=0;x<temp.length;x++){
            arr[l+x]=temp[x];
        }
        return count;
    }
    public static int mergeSort(int arr[],int l,int h){
        int count =0;
        if(l<h){
            int mid = l+(h-l)/2;
            count +=mergeSort(arr,l,mid);
            count +=mergeSort(arr,mid+1,h);
            count +=merge(arr,l,mid,h);
        }
        return count;
    }
    static int inversionCount(int arr[]) {
        // Code Here
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }
}