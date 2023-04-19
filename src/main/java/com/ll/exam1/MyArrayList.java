package com.ll.exam1;

public class MyArrayList<T> {
    private String[] data = new String[2];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean add(String element){
        makeNewdataNotEnough();

        data[size] =element;
        size ++;
        return true;
    }

    private void makeNewdataNotEnough() {
        //먼저 공간이 부족한지 확인
        if(ifNotEnoush()){
            makeNewData();
        }
    }

    private void makeNewData() {
        //새 배열 생성
        String[] newData = new String[data.length*2];

        //기존 창고에 있던 물품을 새 창고로 옮긴다
        for(int i=0; i<data.length; i++){
            newData[i] = data[i];
        }

        //기존 창고와 계약해지우 물품 옮긴다,
        //이전 창고 가비지 컬랙터로 제거댐
        data =newData;
    }

    private boolean ifNotEnoush() {
        return size >= data.length;
    }

    public String get(int index) {
        return  data[index];
    }

}
