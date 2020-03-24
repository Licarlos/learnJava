package examples;

class ArrayDemo {
    public static void main(String[] args) {
        String[] names = {"李闯","倩倩","座座","cc"};
        String result = "家里有";
        for(int x=0;x<names.length;x++){
            if(x==names.length-1){
                result= result+names[x]+"\n";
            }else{
                result= result+names[x]+"、";
            }
        }
        System.out.println(result);        
    }
}