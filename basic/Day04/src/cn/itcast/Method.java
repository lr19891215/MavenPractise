package cn.itcast;


    public class Test{
        public static void main(String[] args){
            function(new MyInterface());



        }
        public static void function(MyInterface myInterface){
            myInterface.method();
        }
    }