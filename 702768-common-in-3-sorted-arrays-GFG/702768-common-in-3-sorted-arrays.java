class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        int arr[]  =new int[a.length+b.length+c.length];
        int k=0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(int i=0;i<a.length;i++){
            arr[k++]=a[i];
            set1.add(a[i]);
        }
         for(int i=0;i<b.length;i++){
            arr[k++]=b[i];
            set2.add(b[i]);
        }
         for(int i=0;i<c.length;i++){
            arr[k++]=c[i];
            set3.add(c[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> check = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            check.add(arr[i]);
        }
        for(int val:check){
            if(set1.contains(val)&&set2.contains(val)&&set3.contains(val)){
                list.add(val);
            }
        }
        Collections.sort(list);
        return list;
    }
}