Set<String> set = new HashSet<>(); 
String pair;
int size;
for(int i = 0; i<pair_left.length; i++){
    pair = pair_left[i] + "_" + pair_right[i];
    if(set.contains(pair)){
        size = set.size();
        System.out.println(size);
    }else{
        set.add(pair); 
        size = set.size();
        System.out.println(size); 
    }
}
   
   
   