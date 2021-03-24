package com;

public class DemoPrecedable {
    public static void main(String[] args) {
        Precedable<Persona>[] arr = new Persona[5];

        arr[0] = new Persona("Carlos", 12345);
        arr[1] = new Persona("Juan", 54321);
        arr[2] = new Persona("Jose", 11111);
        arr[3] = new Persona("Pedro", 10111);
        arr[4] = new Persona("Pablo", 40000);

        SortUtil.ordenar(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

//    public static void main(String[] args) {
//        Precedable<Celular>[] arr = new Celular[5];
//
//        arr[0] = new Celular(11223344, "Carlos");
//        arr[1] = new Celular(10111111, "Juan");
//        arr[2] = new Celular(33221144, "Jose");
//        arr[3] = new Celular(12345678, "Pedro");
//        arr[4] = new Celular(11111111, "Pablo");
//
//        SortUtil.ordenar(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].toString());
//        }
//    }
}
