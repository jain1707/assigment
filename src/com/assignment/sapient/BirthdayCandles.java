package com.assignment.sapient;

public class BirthdayCandles {
    public static void main(String[] args) throws Exception {
        int minBlows=0;
        double[] ch = {200,201.5,1,201.5,3,51,21,200,501};

        if(ch.length>50){
            throw new Exception("Max candles on a cake can be 50, given size is "+ch.length);
        }
        double[] candles = new double[50];
        int candleSize=0;
        for(int i=0;i<ch.length;i++){
                boolean flag=false;
                for(int j=0;j<candleSize;j++){
                    if(candles[j]==ch[i]){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    candles[candleSize++]=ch[i];
                    minBlows++;
                }
            }
        System.out.println(minBlows);
    }
}
