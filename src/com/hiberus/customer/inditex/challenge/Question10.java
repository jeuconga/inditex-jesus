package com.hiberus.customer.inditex.challenge;

public class Question10 {
    public static void nextGreaterValue(int [] numberList){
        boolean greaterValue=false;
        for(int i=0; i<numberList.length; i++){
            greaterValue=false;
            for(int j=i+1; j<numberList.length; j++){
                if(numberList[i]<numberList[j]){
                    greaterValue=true;
                    System.out.println(numberList[i]+" --> "+numberList[j]);
                    break;
                }
            }
            if(!greaterValue){
                System.out.println(numberList[i]+" --> "+"-1");
            }
        }
    }
    public static void main(String[] args) {
        int numberList[]= {4,5,3,25};
        int numberList2[]={13,7,6,12};
        nextGreaterValue(numberList);
        nextGreaterValue(numberList2);
    }
}
