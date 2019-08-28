package com.meyue.xiwen.sort;

/**
 * @ClassName:SelectionSort </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] list = {27, 76, 47, 23, 7, 32, 19, 86};

        //排序
       /* selectionSort(list);

        displayList(list);*/

        moreSort(list);

        displayList(list);
    }

    private static void moreSort(int[] list) {
        int len =list.length;
        for(int i =0;i<len;i++){
            int max =i;
            for(int j =i+1;j<=len-1;j++){
                if(list[j]>list[max]){
                    max =j;
                }
            }
            swapMore(list,max,i);
        }
    }

    private static void swapMore(int[] list, int max, int i) {
        int temp = list[max];
        list[max] =list[i];
        list[i]=temp;
    }

    private static void selectionSort(int[] list) {
        int len =list.length;
        //遍历 len-1
        for(int i=0;i<len;i++){
            int min = i;
            //遍历 min 后面的值
            for(int j =i+1;j<=len-1;j++){
                if(list[j]<list[min]){
                    min =j;
                }
            }
            if(min!=i){
                swap(list,min,i);
            }
            
        }
    }

    private static void swap(int[] list, int min, int i) {
        int temp = list[min];
        list[min] =list[i];
        list[i]=temp;
    }

    private static void displayList(int[] list) {
        if (list != null && list.length > 0) {
            for (int num :list) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

}
