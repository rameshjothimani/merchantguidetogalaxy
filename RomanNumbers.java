package com.merchantguide.practice;

public class RomanNumbers {

    public enum Roman{
        i("i", 1), v("v", 5), x("x", 10), l("l", 50), c("c", 100), d("d", 500), m("m",1000);


        private int value;
        private String displayValue;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getDisplayValue() {
            return displayValue;
        }

        public void setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
        }

        Roman(String displayValue, int value){
            this.displayValue=displayValue;
            this.value=value;
        }



    }
}
