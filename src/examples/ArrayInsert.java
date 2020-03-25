package examples;

class ArrayInsert {
    public static void main(String[] args){
        String[] names = {"李闯","倩倩","座座","cc"}; //初始化数组

        //测试数组堆栈push
        arrayPush(names,"12");
        //打印数组
        for (String item : names) {
            System.out.println(item);
        }
    }
    public static Object arrayPush(Object arr,Object item){
        if(arr instanceof  Object){
            System.out.println("array");
        }
        String[] result = {"12"};
        return result;
    }
}
