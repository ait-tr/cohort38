package logicalOperation;

public class Main {
    public static void main(String[] args) {
//
        boolean b0 =  ((5 > 7) ^ (true ^ !true) || ((true ^ !false) ^ !true)) && !((5 > 7) && (7 < 9)) || (((2 < 3) || (1 > 0)) && (24 >= 19));
//                      false          true     ||        false         false       false        true         true       true
//                            true              ||                false                   true                     true               true
//                                              true                          &&          true          ||                      true
//                                                                            true                      ||                      true
//                                                                                                     true
//        System.out.println(b1);
        boolean b = (4 > 3)
                    &&
                    (5 < 7)
                    ||
                    (true ^ false);

        boolean b1 =  ((5 > 7) ^ (true ^ !true) || ((true ^ !false) ^ !true))
                      &&
                      !((5 > 7) && (7 < 9))
                      ||
                      (((2 < 3) || (1 > 0)) && (24 >= 19));

        boolean b2 =  ((5 >= 7) && !(true ^ !true) ^ !(!(true || !false) ^ !true)) || !((5 < 7) && !(7 < 9)) || ((!(2 < 3) ^ (1 > 0)) && !(24 >= 19));
        boolean b3 =  ((5 > 7) ^ !(true ^ true) && (!!(true ^ !false) || !true)) || (!(5 > 7) && !(7 > 9)) && ((!(2 < 3) ^ (1 < 0)) || (24 >= 19));

        boolean b4 =  !!((5 > 7) ^ (!true ^ !true) && ((true || !false) ^ !true)) || ((5 < 7) && (7 < 9)) && (((2 < 3) || (1 > 0)) ^ (24 >= 19));
        boolean b5 =  ((5 > 7) ^ (true ^ !false) || ((false ^ false) ^ true)) || (!(5 > 7) && !(7 < 9)) || (((2 < 3) || (1 > 0)) && (24 >= 19));

//        System.out.println(
//
//                  (5 > 7) && (7 < 9)

//                ((5 > 7) && (7 < 9)) || (((2 < 3) || (1 > 0)) && (24 >= 19))
////              (false) & (true)
//
//        );

//        System.out.println(
//                (!true || !false) && (5 < 7)
//        );

//        System.out.println(
//                (true ^ false) ^ (5 < 7)
//        );
//        System.out.println(
//                ((5 > 7) ^ (true ^ !true) || ((true ^ !false) ^ !true)) && !((5 > 7) && (7 < 9)) || (((2 < 3) || (1 > 0)) && (24 >= 19))
////                false         true
////                true         true
////                true         true
////                true         true
//        );


    }
}
